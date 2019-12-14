package com.panda520.mall.quartz.util;

import com.panda520.mall.quartz.domain.SysJob;
import org.quartz.JobExecutionContext;

/**
 * @author 玛丽莲梦明
 * @描述.定时任务处理（允许并发执行）
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
