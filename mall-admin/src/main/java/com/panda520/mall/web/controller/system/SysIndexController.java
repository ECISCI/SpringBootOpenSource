package com.panda520.mall.web.controller.system;

import com.panda520.mall.common.config.Global;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.framework.util.ShiroUtils;
import com.panda520.mall.system.domain.SysMenu;
import com.panda520.mall.system.domain.SysUser;
import com.panda520.mall.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @描述.首页 业务处理
 *
 * @author 玛丽莲梦明
 */
@Controller
public class SysIndexController extends BaseController {
    @Autowired
    private ISysMenuService menuService;

    /**
     * 系统首页
     * @param modelMap
     * @return
     */
    @GetMapping("/index")
    public String index(ModelMap modelMap) {
        // 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        modelMap.put("menus", menus);
        modelMap.put("user", user);
        modelMap.put("copyrightYear", Global.getCopyrightYear());
        return "index";
    }

    /**
     * 系统介绍
     * @param modelMap
     * @return
     */
    @GetMapping("/system/main")
    public String main(ModelMap modelMap) {
        modelMap.put("version", Global.getVersion());
        return "main";
    }
}
