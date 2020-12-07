package com.my.crowd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.crowd.constant.CrowdConstant;
import com.my.crowd.entity.AdminExample;
import com.my.crowd.exception.LoginAcctAlreadyInUseException;
import com.my.crowd.exception.LoginAcctAlreadyInUseForUpdateException;
import com.my.crowd.exception.LoginFailedException;
import com.my.crowd.mapper.AdminMapper;
import com.my.crowd.util.CrowdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.my.crowd.entity.Admin;
import com.my.crowd.service.api.AdminService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    private Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Override
    public void saveAdmin(Admin admin) {

        // 密码加密
        String userPwd = admin.getUserPswd();
        userPwd = CrowdUtil.md5(userPwd);
        admin.setUserPswd(userPwd);

        // 生成创建时间
        LocalDateTime rightNow = LocalDateTime.now();
        String createtime = rightNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        admin.setCreateTime(createtime);

        // 保存操作
        try {
            adminMapper.insert(admin);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getClass().getName());

            if (e instanceof DuplicateKeyException) {
                throw new LoginAcctAlreadyInUseException(CrowdConstant.MESSAGE_LOGIN_ACCT_ALREADY_IN_USE);
            }
        }
    }

    @Override
    public void remove(Integer adminId) {
        adminMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public List<Admin> getAll() {
        return adminMapper.selectByExample(new AdminExample());
    }

    @Override
    public Admin getAdminByLoginAcct(String loginAcct, String userPswd) {

        // 创建AdminExample对象
        AdminExample adminExample = new AdminExample();

        // 创建Criteria对象,并且封装查询条件
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUserAcctEqualTo(loginAcct);

        // 调用Admin-Mapper方法进行查询
        List<Admin> list = adminMapper.selectByExample(adminExample);



        if (list == null && list.size() == 0) {
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }
        if (list.size() > 1) {
            throw new RuntimeException(CrowdConstant.MESSAGE_SYSTEM_ERROR_LOGIN_NOT_UNIQUE);
        }

        Admin admin = list.get(0);

        // 如果admin对象为空则抛出异常
        if (admin == null) {
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }

        // 如果admin对象不为null则将数据库密码从Admin对象中取出
        String userFromDB = admin.getUserPswd();

        // 将表单提交的明文密码进行加密
        String userPswdForm = CrowdUtil.md5(userPswd);

        // 对加密后的密码进行比较
        if (!Objects.equals(userFromDB, userPswdForm)) {
            // 密码不一致抛出异常
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }

        return admin;
    }

    @Override
    public PageInfo<Admin> getPageInfo(String keyword, Integer pageNum, Integer pageSize) {

        // 调用PageHelper的静态方法开启分页功能,此处体现了PageHelper的非入侵式设计，原本要做的查询不必有任何修改
        PageHelper.startPage(pageNum, pageSize);

        // 执行查询
        List<Admin> list = adminMapper.selectAdminByKeyword(keyword);

        // 封装到PageInfo对象中
        return new PageInfo<>(list);
    }

    @Override
    public Admin getAdminById(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public void update(Admin admin) {
        try {
            // Selective表示有选择的更新，对null字段值不更新
            adminMapper.updateByPrimaryKeySelective(admin);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getClass().getName());

            if (e instanceof DuplicateKeyException) {
                throw new LoginAcctAlreadyInUseForUpdateException(CrowdConstant.MESSAGE_LOGIN_ACCT_ALREADY_IN_USE);
            }
        }
    }

    @Override
    public void saveAdminRoleRelationship(Integer adminId, List<Integer> roleIdList) {
        // 根据adminId删除旧的关联数据
        adminMapper.deleteOldRelationship(adminId);

        // 根据roleIdList保存新的关联关系
        adminMapper.insertNewRelationship(adminId, roleIdList);
    }

}
