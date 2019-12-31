package com.it521.open.common.enums;

/**
 *  @描述.用户会话
 *
 * @author X
 */
public enum OnlineStatus {
    /**
     * 用户状态
     */
    on_line("在线"), off_line("离线");

    private final String info;

    private OnlineStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
