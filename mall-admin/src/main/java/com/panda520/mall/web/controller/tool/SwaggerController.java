package com.panda520.mall.web.controller.tool;

import com.panda520.mall.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @描述.swagger 接口
 *
 * @author 玛丽莲梦明
 */
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController extends BaseController {
    @RequiresPermissions("tool:swagger:view")
    @GetMapping()
    public String index() {
        return redirect("/swagger-ui.html");
    }
}
