package com.panda520.mall.quartz.controller;

import com.panda520.mall.common.annotation.Log;
import com.panda520.mall.common.core.controller.BaseController;
import com.panda520.mall.common.core.domain.ResponseResult;
import com.panda520.mall.common.core.page.TableDataInfo;
import com.panda520.mall.common.enums.BusinessType;
import com.panda520.mall.common.utils.poi.ExcelUtil;
import com.panda520.mall.quartz.domain.SysJobLog;
import com.panda520.mall.quartz.service.ISysJobLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 玛丽莲梦明
 * @描述.调度日志操作处理
 */
@Controller
@RequestMapping("/monitor/jobLog")
public class SysJobLogController extends BaseController {
    private String prefix = "monitor/job";

    @Autowired
    private ISysJobLogService jobLogService;

    @RequiresPermissions("monitor:job:view")
    @GetMapping()
    public String jobLog() {
        return prefix + "/jobLog";
    }

    @RequiresPermissions("monitor:job:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysJobLog jobLog) {
        startPage();
        List<SysJobLog> list = jobLogService.selectJobLogList(jobLog);
        return getDataTable(list);
    }

    @Log(title = "调度日志", businessType = BusinessType.EXPORT)
    @RequiresPermissions("monitor:job:export")
    @PostMapping("/export")
    @ResponseBody
    public ResponseResult export(SysJobLog jobLog) {
        List<SysJobLog> list = jobLogService.selectJobLogList(jobLog);
        ExcelUtil<SysJobLog> util = new ExcelUtil<SysJobLog>(SysJobLog.class);
        return util.exportExcel(list, "调度日志");
    }

    @Log(title = "调度日志", businessType = BusinessType.DELETE)
    @RequiresPermissions("monitor:job:remove")
    @PostMapping("/remove")
    @ResponseBody
    public ResponseResult remove(String ids) {
        return toAjax(jobLogService.deleteJobLogByIds(ids));
    }

    @RequiresPermissions("monitor:job:detail")
    @GetMapping("/detail/{jobLogId}")
    public String detail(@PathVariable("jobLogId") Long jobLogId, ModelMap modelMap) {
        modelMap.put("name", "jobLog");
        modelMap.put("jobLog", jobLogService.selectJobLogById(jobLogId));
        return prefix + "/detail";
    }

    @Log(title = "调度日志", businessType = BusinessType.CLEAN)
    @RequiresPermissions("monitor:job:remove")
    @PostMapping("/clean")
    @ResponseBody
    public ResponseResult clean() {
        jobLogService.cleanJobLog();
        return success();
    }
}
