package com.my.crowd.service.api;

import com.github.pagehelper.PageInfo;
import com.my.crowd.entity.Admin;

import java.util.List;

public interface AdminService {

     void saveAdmin(Admin admin);

     void remove(Integer adminId);

     List<Admin> getAll();

     Admin getAdminByLoginAcct(String loginAcct, String userPswd);

     PageInfo<Admin> getPageInfo(String keyword, Integer pageNum, Integer pageSize);

    Admin getAdminById(Integer adminId);

    void update(Admin admin);

    void saveAdminRoleRelationship(Integer adminId, List<Integer> roleIdList);
}
