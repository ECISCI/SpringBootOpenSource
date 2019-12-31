package com.it521.open.common.core.domain;

import com.it521.open.common.constant.ResponseEnum;
import com.it521.open.common.utils.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author X
 * @描述.操作消息提醒
 */
public class ResponseResult<T> {

    /**
     * @描述.状态码
     */
    private int code;

    /**
     * @描述.返回内容
     */
    private String msg;

    /**
     * @描述.数据对象
     */
    private T data;

    /**
     * @描述.初始化一个新创建的ResponseResult对象，使其表示一个空消息
     */
    public ResponseResult() {
    }

    /**
     * @param code 状态类型
     * @param msg  返回内容
     * @描述.初始化一个新创建的ResponseResult对象
     */
    public ResponseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    /**
     * @param responseEnum 状态类型
     * @param msg          返回内容
     * @描述.初始化一个新创建的ResponseResult对象
     */
    public ResponseResult(ResponseEnum responseEnum, String msg) {
        this.code = responseEnum.code();
        this.msg = msg;
    }

    /**
     * @param responseEnum 状态类型
     * @param msg          返回内容
     * @param data         数据对象
     * @描述.初始化一个新创建的ResponseResult对象
     */
    public ResponseResult(ResponseEnum responseEnum, String msg, T data) {
        this.code = responseEnum.code();
        this.msg = msg;
        if (StringUtils.isNotNull(data)) {
            this.data = data;
        }
    }

    /**
     * @param responseEnum 响应枚举
     * @描述.初始化一个新创建的ResponseResult对象
     */
    public ResponseResult(ResponseEnum responseEnum) {
        this.code = responseEnum.code();
        this.msg = responseEnum.msg();
    }

    /**
     * @param responseEnum 响应枚举
     * @param data         数据对象
     * @描述.初始化一个新创建的ResponseResult对象
     */
    public ResponseResult(ResponseEnum responseEnum, T data) {
        this.code = responseEnum.code();
        this.msg = responseEnum.msg();
        this.data = data;
    }

    /**
     * @return 响应消息
     * @描述.返回响应消息
     */
    public static ResponseResult response(Integer code, String msg) {
        return new ResponseResult(code, msg);
    }

    /**
     * @return 响应消息
     * @描述.返回响应消息
     */
    public static ResponseResult response(ResponseEnum responseEnum) {
        return new ResponseResult(responseEnum);
    }

    /**
     * @return 消息
     * @描述.返回消息
     */
    public static ResponseResult response(ResponseEnum responseEnum, Object data) {
        return new ResponseResult(responseEnum, data);
    }

    /**
     * @return 成功响应消息
     * @描述.返回成功响应消息
     */
    public static ResponseResult successResponse() {
        return response(ResponseEnum.REQUEST_SUCCESS);
    }

    /**
     * @param data 数据对象
     * @return 成功响应消息
     * @描述.返回成功响应消息
     */
    public static ResponseResult successResponse(Object data) {
        return response(ResponseEnum.REQUEST_SUCCESS, data);
    }

    /**
     * @return 失败响应消息
     * @描述.返回失败响应消息
     */
    public static ResponseResult errorResponse() {
        return response(ResponseEnum.SERVER_ERROR);
    }

    /**
     * @return 成功消息数据
     * @描述.返回成功消息数据
     */
    public static ResponseResult success(Object data) {
        return response(ResponseEnum.REQUEST_SUCCESS, data);
    }

    /**
     * @return 成功消息
     * @描述.返回成功消息
     */
    public static ResponseResult success() {
        return response(ResponseEnum.REQUEST_SUCCESS);
    }

    /**
     * @param msg 返回内容
     * @return 成功消息
     * @描述.返回成功消息
     */
    public static ResponseResult successMsg(String msg) {
        return ResponseResult.success(msg, null);
    }

    /**
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     * @描述.返回成功消息
     */
    public static ResponseResult success(String msg, Object data) {
        return new ResponseResult(ResponseEnum.REQUEST_SUCCESS, msg, data);
    }

    /**
     * @param msg 返回内容
     * @return 警告消息
     * @描述.返回警告消息
     */
    public static ResponseResult warn(String msg) {
        return ResponseResult.warn(msg, null);
    }

    /**
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     * @描述.返回警告消息
     */
    public static ResponseResult warn(String msg, Object data) {
        return new ResponseResult(ResponseEnum.SYSTEM_WARNING, msg, data);
    }

    /**
     * @return
     * @描述.返回错误消息
     */
    public static ResponseResult error() {
        return response(ResponseEnum.CUSTOMIZE_ERROR);
    }

    /**
     * @param msg 返回内容
     * @return 警告消息
     * @描述.返回错误消息
     */
    public static ResponseResult error(String msg) {
        return ResponseResult.error(msg, null);
    }

    /**
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     * @描述.返回错误消息
     */
    public static ResponseResult error(String msg, Object data) {
        return new ResponseResult(ResponseEnum.CUSTOMIZE_ERROR, msg, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("code", getCode())
                .append("msg", getMsg())
                .append("data", getData())
                .toString();
    }
}
