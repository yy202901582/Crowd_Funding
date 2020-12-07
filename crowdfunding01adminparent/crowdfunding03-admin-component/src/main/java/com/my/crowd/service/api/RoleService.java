package com.my.crowd.service.api;


import com.github.pagehelper.PageInfo;
import com.my.crowd.entity.Role;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/26
 */

public interface RoleService {

    PageInfo<Role> getPageInfo(String keyword, Integer pageNum, Integer pageSize);

    void saveRole(Role role);

    void updateRole(Role role);

    void removeRole(List<Integer> roleIdList);

    List<Role> getAssignedRole(Integer adminId);

    List<Role> getUnAssignedRole(Integer adminId);
}
