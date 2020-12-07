package com.my.crowd.mvc.handler;

import com.github.pagehelper.PageInfo;
import com.my.crowd.entity.Role;
import com.my.crowd.service.api.RoleService;
import com.my.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/26
 */
@Controller
public class RoleHandler {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @RequestMapping("role/remove/by/role/id/array.json")
    public ResultEntity<String> removeByRoleIdArray(@RequestBody List<Integer> roleIdList){
        roleService.removeRole(roleIdList);
        return ResultEntity.successWithoutData();
    }

    @ResponseBody
    @RequestMapping("role/update.json")
    public ResultEntity<String> updateRole(Role role) {
        roleService.updateRole(role);
        return ResultEntity.successWithoutData();
    }

    @ResponseBody
    @RequestMapping("role/save.json")
    public ResultEntity<String> savaRole(Role role){
        roleService.saveRole(role);
        return ResultEntity.successWithoutData();
    }


    @ResponseBody
    @RequestMapping("role/get/page/info.json")
    public ResultEntity<PageInfo<Role>> getPageInfo(
            @RequestParam(value = "keyword", defaultValue = "") String keyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize
    ) {
        // 调用service方法获取PageInfo对象
        PageInfo<Role> pageInfo = roleService.getPageInfo(keyword, pageNum, pageSize);
        // 封装到ResultEntity对象返回
        return ResultEntity.successWithData(pageInfo);
    }
}
