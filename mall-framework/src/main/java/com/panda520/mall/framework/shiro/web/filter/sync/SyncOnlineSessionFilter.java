package com.panda520.mall.framework.shiro.web.filter.sync;

import com.panda520.mall.common.constant.ShiroConstants;
import com.panda520.mall.framework.shiro.session.OnlineSession;
import com.panda520.mall.framework.shiro.session.OnlineSessionDAO;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author X
 * @描述.同步Session数据到Db
 */
public class SyncOnlineSessionFilter extends PathMatchingFilter {
    @Autowired
    private OnlineSessionDAO onlineSessionDAO;

    /**
     * @描述.同步会话数据到DB一次请求最多同步一次防止过多处理需要放到Shiro过滤器之前
     */
    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        OnlineSession session = (OnlineSession) request.getAttribute(ShiroConstants.ONLINE_SESSION);
        // 如果session stop了 也不同步
        // session停止时间，如果stopTimestamp不为null，则代表已停止
        if (session != null && session.getUserId() != null && session.getStopTimestamp() == null) {
            onlineSessionDAO.syncToDb(session);
        }
        return true;
    }
}
