package com.my.crowd.service.api;

import com.my.crowd.entity.Auth;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/11/13
 */
public interface AuthService {
    List<Auth> getAll();

    List<Integer> getAssignedAuthIdByRoleId(Integer roleId);

    void saveRoleAuthRelationship(Map<String, List<Integer>> map);

    List<String> getAssignedAuthNameByAdminId(Integer adminId);
}
