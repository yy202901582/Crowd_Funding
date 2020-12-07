package com.my.crowd.test;



import com.my.crowd.entity.Admin;
import com.my.crowd.entity.Role;
import com.my.crowd.mapper.AdminMapper;
import com.my.crowd.mapper.RoleMapper;
import com.my.crowd.service.api.AdminService;
import com.my.crowd.service.api.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

// Spring整合Junit
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml", "classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource datasource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testRole() {
        for (int i = 2; i < 100; i++) {
            Role role = new Role(null, "RoleName"+i);
            roleMapper.insert(role);
        }
    }

    @Test
    public void testPage() {
        for (int i = 999; i < 1006; i++) {
            Admin admin = new Admin(null,"userAcct"+i,"pwd"+i,"name"+i,"email"+i,null);
            adminService.saveAdmin(admin);
        }
    }

    @Test
    public void testTx() {
        Admin admin = new Admin(null,"tom","tompwd","汤姆","tom@foxmail,com",null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog(){
        // 获取日志对象
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        logger.debug("debug");
        logger.warn("warning");
        logger.info("info");
    }

    @Test
    public void TestInsertAdmin(){
        Admin admin = new Admin(null,"myacount","mypwd","myname","my@foxmail,com",null);
        int count = adminMapper.insert(admin);
        // System.out.println("影响的行数："+count);
    }

    @Test
    public void testConnection() throws SQLException {
        // 测试数据库连接
        Connection con = datasource.getConnection();
        // System.out.println(con);
    }
}


