package com.my.crowd.service.api;

import com.my.crowd.entity.Menu;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/10/28
 */
public interface MenuService {

    void saveMenu(Menu menu);

    void updateMenu(Menu menu);

    void removeMenu(Integer id);

    List<Menu> getAll();
}
