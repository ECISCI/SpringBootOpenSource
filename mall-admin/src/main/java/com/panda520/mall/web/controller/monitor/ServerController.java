package com.panda520.mall.web.controller.monitor;

import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.framework.web.domain.Server;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 玛丽莲梦明
 * @描述.服务器监控
 */
@Controller
@RequestMapping("/monitor/server")
public class ServerController extends BaseController {
    private String prefix = "monitor/server";

    @RequiresPermissions("monitor:server:view")
    @GetMapping()
    public String server(ModelMap modelMap) throws Exception {
        Server server = new Server();
        server.copyTo();
        modelMap.put("server", server);
        return prefix + "/server";
    }
}
