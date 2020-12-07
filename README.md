

## 1.数据库

##### 创建库

```mysql
create database `project_crowd` character SET utf8;
```

##### 创建表

```mysql
create table t_admin
(
 id        int      not null  auto_increment,   #主键
 user_acct varchar(255) not null,               #账号
 user_pswd char(32) not null,                   #密码
 user_name varchar(255) not null,               #用户名
 email     varchar(255) not null,               #邮件
 create_time  char(19),
 primary key(id)
);
```



## 2.架构图

![1601969724585](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1601969724585.png)





![1602210067152](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602210067152.png)

## 3.操作

![1601967726937](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1601967726937.png)



1.子工程加入需要的依赖

- component加入依赖


2.准备jdbc.properties

3.创建spring配置文件配置spring+mybatis整合，spring配置文件加载jdbc.properties属性文件

4.配置数据源

- 测试从数据源中获取数据库连接

5.配置SqlSessionFactoryBean

- 装配数据源
- 指定___Mapper.xml配置文件位置
- 指定mybatis全局配置文件的位置

6.配置MapperScannerConfiger

7.测试是否可装配*Mapper接口并通过接口操纵数据库



## 4.日志系统

替换spring默认的commonlog

## 5.声明式事务



```
try{

	// 开启事务（关闭自动提交）
	Connection.setAutoCommit(false);

	// 核心操作
	adminService.saveAdmin(admin);

	// 提交事务
	Connection.commit();

} catch(Exception e){

	// 回滚事务
	Connection.rollBack();
} finally{

	// 释放数据库连接
	Connection.close();

}
```



### 配置文件的结构

![1602144561230](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602144561230.png)



### 操作

- 创建spring管理事务的配置文件

  spring-persist-tx.xml

- 配置自动扫描的包

  com.my.crowd.service.*

- 事务管理器 

  ```
      <!--配置事务管理器-->
      <bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
          <!--装配数据源-->
          <property name="dataSource" ref="dataSource"></property>
      </bean>
  
      <!--配置事务切面-->
      <aop:config>
          <!--考虑需要整合SpringSecurity，避免UserDetailsService加入事务控制，让切入点表达式定位到ServiceImpl-->
          <aop:pointcut id="txPointcut" expression="execution(* *..*ServiceImpl.*(..))"/>
          <!--将切入点表达式和事务通知关联起来-->
          <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointcut"></aop:advisor>
      </aop:config>
  
      <!--配置事务的通知-->
      <tx:advice id="txAdvice" transaction-manager="txManager">
          <!--配置事务的属性-->
          <tx:attributes>
              <!--查询方法：配置只读属性，让数据库知道这是一个查询操作，能够进行一定优化-->
              <tx:method name="get*" read-only="true"/>
              <tx:method name="find*" read-only="true"></tx:method>
              <tx:method name="query*" read-only="true"></tx:method>
              <tx:method name="count*" read-only="true"></tx:method>
              <!--增删改方法：配置事务传播行为，回滚异常-->
              <!--propagation：
                  REQUIRES:表示当前方法必须工作在事务中，如果当前线程上没有已经开启的事务，则自己开新事务；用别人的事务可能会回滚
                  REQUIRES_NEW：不受其他事务回滚的印影响,不管自己线程上有没有事务，都要自己开事务并运行
              -->
              <!--rollback-for：配置事务方法针对什么样的异常回滚
                  默认：运行时回滚
                  建议：编译时异常和运行时异常都回滚
                  -->
              <tx:method name="save*" propagation="REQUIRES_NEW" rollback-for="java.lang.Exception"></tx:method>
              <tx:method name="update*" propagation="REQUIRES_NEW" rollback-for="java.lang.Exception"></tx:method>
              <tx:method name="remove*" propagation="REQUIRES_NEW" rollback-for="java.lang.Exception"></tx:method>
              <tx:method name="batch*" propagation="REQUIRES_NEW" rollback-for="java.lang.Exception"></tx:method>
          </tx:attributes>
      </tx:advice>
  
  ```

### 测试

![1602147634018](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602147634018.png)



## 6.表述层配置

### 目标

​    页面---->handler(@RequestMapping)---->service--->Mapper--->数据库

### spring配置文件与 web.xml 的关系

![1602211734928](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602211734928.png)

配置web.xml

- 配置contextLoaderListener

- 配置dispatcherServlet

配置spring-web-mvc.xml

测试（index.jsp）

### SpringMVC环境下Ajax请求

   ajax请求     handler处理    JSON



常用注解@RequestBody和@ResponseBody正常工作必须有jackson支持

![1602489659412](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602489659412.png)

@RequestBody使用（index.jsp testHandler）

### Ajax请求返回进行规范

```
com.my.crowd.util.ResultEntity
```



## 7.异常映射

目标：使用异常映射机制将整个项目的异常和错误提示进行统一管理



![1602655409957](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602655409957.png)





![1602659412320](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602659412320.png)



基于XML（spring-mvc-web.xml）

- 判断请求工具类方法（com.my.crowd.util.CrowdUtil）

基于注解(com.my.crowd.mvc.config.CrowdExceptionResolver)

声明一个类管理常量（com.my.crowd.constant.CrowdConstant）



## 8.admin-login

![1602752448701](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1602752448701.png)



### MD5加密

```
com.my.crowd.util.CrowdUtil.md5
```

创建登录失败异常及其处理

```
com.my.crowd.exception.LoginFailedException

com.my.crowd.mvc.config.CrowdExceptionResolver.resolveLoginException

admin-login:
<p>${requestScope.exception.message}</p>
```

handler方法

```
com.my.crowd.mvc.handler.AdminHandler
```

service方法

```
com.my.crowd.service.impl.AdminServiceImpl
```

重定向到目标页面

```
配置view-controller
AdminHandler
```

## 9.抽取后台主页面

创建公共页面

```
include-head.jsp
include-nav.jsp
include-sidebar.jsp
```

## 10.拦截请求

保护部分资源不能被登录访问

![1603079779351](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603079779351.png)

创建拦截器类

```
com.my.crowd.mvc.interceptor.LoginInterceptor
```

自定义异常

```
com.my.crowd.exception.AccessForbiddenException
```

注册拦截器类

```
spring-mvc-web.xml
```



## 11.用户维护

### 分页：

![1603088675335](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603088675335.png)

引入PageHelper

加入依赖（pom.xml)

sqlSessionFactoryBean配置mybatis（spring-peisist-mybatis.xml）

- AdminMapper.xml中编写sql语句

```
<select id="selectAdminByKeyword" resultMap="BaseResultMap">  
select  id, user_acct, user_pswd, user_name, email, create_time  from t_admin  
where      
user_acct like concat("%",#{keyword},"%") or      
user_name like concat("%",#{keyword},"%") or      
email like concat("%",#{keyword},"%")
</select>
```

- AdminMapper接口中声明方法 

```
List<Admin> selectAdminByKeyword(String keyword);
```

```
AdminServiceImpl.getPageInfo()
```

AdminHandler

```
@RequestMapping("admin/get/page.html")
```

**admin-page.jsp**

页面主体

页码导航

### 删除：

AdminHandler

```
@RequestMapping("admin/remove/{adminId}/{pageNum}/{keyword}.html")
```

### 新增：

t_admin表中加入唯一约束

```
ALTER TABLE `project_crowd`.`t_admin` ADD UNIQUE INDEX (`user_acct`); 
```



增加页面（admin-add.jsp）配置view-controller



Adminhandler

```
@RequestMapping("admin/save.html")
```



```
com.my.crowd.service.impl.AdminServiceImpl.saveAdmin

com.my.crowd.mvc.config.CrowdExceptionResolver

com.my.crowd.exception.LoginAcctAlreadyInUseException
```

### 更新：

修改Admin数据，不改密码和创建时间

![1603344247735](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603344247735.png)

AdminHandler

```
@RequestMapping("admin/to/edit/page.html")

@RequestMapping("admin/update.html")
```



```
com.my.crowd.service.impl.AdminServiceImpl.update

com.my.crowd.service.impl.AdminServiceImpl.getAdminById

com.my.crowd.exception.LoginAcctAlreadyInUseForUpdateException
```



## 12.角色维护

### 建立角色表

```sql
CREATE TABLE `project_crowd`.`t_role` (
    `id` INT NOT NULL, 
    `name` VARCHAR(255), 
    PRIMARY KEY (`id`) 
); 
```

### 分页：

![1603686529511](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603686529511.png)

新增内容：

generatorConfig.xml逆向工程生成代码：

```
<table tableName="t_role" domainObjectName="Role" />

RoleExample.java

Role.java

RoleMapper.java

RoleMapper.XML
```



```
com.my.crowd.service.impl.RoleServiceImpl

com.my.crowd.service.api.RoleService

com.my.crowd.mvc.handler.RoleHandler
```



分页操作：

RoleHandle:          @RequestMapping("role/get/page/Info.json")

role-page.jsp



webapp.crowd:

my-role.js

```
function generatePage()
```

### 新增：

![1603773403928](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603773403928.png)

```
role-page.jsp:
	<%@include file="/WEB-INF/model-role-add.jsp" %>
	<script>
	$("#showModelBtn").click(...);
	$("#saveRoleBtn").click(...);
	</script>
 
RoleHandler.java:
	@ResponseBody
	@RequestMapping("role/save.json")
```

### 更新：

![1603775572655](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603775572655.png)

```
role-page.jsp:
	<%@include file="/WEB-INF/model-role-edit.jsp" %>
	$("#rolePageBody").on("click", ".pencilBtn", function (...));
	$("#updateRoleBtn").click(...));
	 
my-role.js
    fillTableBody(...) // button绑定roleId
RoleHandler
    @ResponseBody
    @RequestMapping("role/update.json")
com.my.crowd.service.api.RoleService.updateRole
com.my.crowd.service.impl.RoleServiceImpl.updateRole
```

### 删除：

![1603779571181](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1603779571181.png)



```
RoleHandler
	@ResponseBody
	@RequestMapping("/role/remove/by/role/id/array.json")
com.my.crowd.service.api.RoleService.removeRole
com.my.crowd.service.impl.RoleServiceImpl.removeRole
role-page.jsp
    $("#removeRoleBtn").click(function (...));
    $("#rolePageBody").on("click", ".removeBtn", function ());
    $("#batchRemoveBtn").click(function ());
	$("#summaryBox").click(function ());
	$("#rolePageBody").on("click", ".itemBox", function ());
	$("#batchRemoveBtn").click(function ());
```



## 13.菜单维护

数据库表

```
CREATE TABLE `t_menu`  (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `pid` INT(11) NULL DEFAULT NULL,
  `NAME` VARCHAR(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` VARCHAR(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon` VARCHAR(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

INSERT INTO `t_menu` VALUES (1, NULL, '系统权限菜单', NULL, 'glyphicon glyphicon-th-list\r\n');
INSERT INTO `t_menu` VALUES (2, 1, ' 控 制 面 板 ', 'main.htm', 'glyphicon glyphicon-dashboard\r\n');
INSERT INTO `t_menu` VALUES (3, 1, '权限管理', NULL, 'glyphicon glyphicon glyphicon-tasks\r\n');
INSERT INTO `t_menu` VALUES (4, 3, ' 用 户 维 护 ', 'user/index.htm', 'glyphicon glyphicon-user\r\n');
INSERT INTO `t_menu` VALUES (5, 3, ' 角 色 维 护 ', 'role/index.htm', 'glyphicon glyphicon-king\r\n');
INSERT INTO `t_menu` VALUES (6, 3, ' 菜 单 维 护 ', 'permission/index.htm', 'glyphicon glyphicon-lock\r\n');
INSERT INTO `t_menu` VALUES (7, 1, ' 业 务 审 核 ', NULL, 'glyphicon glyphicon-ok\r\n');
INSERT INTO `t_menu` VALUES (8, 7, '实名认证审核', 'auth_cert/index.htm', 'glyphicon glyphicon-check\r\n');
INSERT INTO `t_menu` VALUES (9, 7, ' 广 告 审 核 ', 'auth_adv/index.htm', 'glyphicon glyphicon-check\r\n');
INSERT INTO `t_menu` VALUES (10, 7, ' 项 目 审 核 ', 'auth_project/index.htm', 'glyphicon glyphicon-check\r\n');
INSERT INTO `t_menu` VALUES (11, 1, ' 业 务 管 理 ', NULL, 'glyphicon glyphicon-th-large\r\n');
INSERT INTO `t_menu` VALUES (12, 11, ' 资 质 维 护 ', 'cert/index.htm', 'glyphicon glyphicon-picture\r\n');
INSERT INTO `t_menu` VALUES (13, 11, ' 分 类 管 理 ', 'certtype/index.htm', 'glyphicon glyphicon-equalizer\r\n');
INSERT INTO `t_menu` VALUES (14, 11, ' 流 程 管 理 ', 'process/index.htm', 'glyphicon glyphicon-random\r\n');
INSERT INTO `t_menu` VALUES (15, 11, ' 广 告 管 理 ', 'advert/index.htm', 'glyphicon glyphicon-hdd\r\n');
INSERT INTO `t_menu` VALUES (16, 11, ' 消 息 模 板 ', 'message/index.htm', 'glyphicon glyphicon-comment\r\n');
INSERT INTO `t_menu` VALUES (17, 11, ' 项 目 分 类 ', 'projectType/index.htm', 'glyphicon glyphicon-list\r\n');
INSERT INTO `t_menu` VALUES (18, 11, ' 项 目 标 签 ', 'tag/index.htm', 'glyphicon glyphicon-tags\r\n');
INSERT INTO `t_menu` VALUES (19, 1, '参 数 管 理', 'param/index.htm', 'glyphicon glyphicon-list-alt');
```

逆向工程生成Menu MenuExample MenuMapper 以及 MenuMapper.xml

MenuService， MenuServiceImpl



### 树形结构

MenuHandler

```
@RequestMapping("/menu/get/whole/tree.json")
```

webapp下引入zTree相关资源

my-menu.js

使用ajax请求初始化menu结构

- 修改icon
- 点击节点不跳转页面
- 在鼠标移入节点范围时添加按钮组
- 在鼠标移出节点范围时删除按钮组

### 添加子节点：

![1604286816335](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1604286816335.png)

### 更新节点：

![1604290125378](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1604290125378.png)

### 删除节点：

![1604466773481](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1604466773481.png)

## 14.权限控制：

### 为Admin分配Role

![1604468727997](C:\Users\YANG\AppData\Roaming\Typora\typora-user-images\1604468727997.png)

创建中间表，保存admin-Role关联关系的数据：

```
CREATE TABLE `inner_admin_role`  (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `admin_id` INT(11) NULL DEFAULT NULL,
  `role_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 116 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;
```



```
创建
	AssignHandler
更新
	RoleService
	RoleServiceImpl
	RoleMapper
添加SQL语句
	RoleMapper
创建
	assign-role.jsp
```

执行分配(AssignHandler)

```
assignHandler
    @RequestMapping("assign/do/role/assign.html")
增加方法
	adminService
	adminServiceImpl
mapper增加sql语句
    deleteOldRelationship
    insertNewRelationship

```

### 为Role分配Auth

t_Auth建表

```
-- ----------------------------
-- Table structure for t_auth
-- ----------------------------
DROP TABLE IF EXISTS `t_auth`;
CREATE TABLE `t_auth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_auth
-- ----------------------------
INSERT INTO `t_auth` VALUES (1, '', '用户模块', NULL);
INSERT INTO `t_auth` VALUES (2, 'user:delete', '删除', 1);
INSERT INTO `t_auth` VALUES (3, 'user:get', '查询', 1);
INSERT INTO `t_auth` VALUES (4, '', '角色模块', NULL);
INSERT INTO `t_auth` VALUES (5, 'role:delete', '删除', 4);
INSERT INTO `t_auth` VALUES (6, 'role:get', '查询', 4);
INSERT INTO `t_auth` VALUES (7, 'role:add', '新增', 4);
INSERT INTO `t_auth` VALUES (8, 'user:save', '保存', 1);
INSERT INTO `t_auth` VALUES (9, 'user:update', '更新', 1);
INSERT INTO `t_auth` VALUES (10, 'role:update', '更新', 4);
-- ----------------------------
-- Table structure for inner_role_auth
-- ----------------------------
DROP TABLE IF EXISTS `inner_role_auth`;
CREATE TABLE `inner_role_auth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NULL DEFAULT NULL,
  `auth_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 364 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
```

name: 分配权限使用的具体值 （模块：操作名）

title：用户在页面上查看到的

category_id：关联到当前表的的其他记录

```
创建更新
	AuthService
	AuthServiceImpl
	AuthMapper
	AuthMapper.xml
	model-role-assign-auth.jsp
```

