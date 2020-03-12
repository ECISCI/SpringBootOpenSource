package com.it521.open.api.util;


/**
 * @author 玛丽莲梦明
 * @描述.常量类
 */
public class Constant {
    public static final String NULL_DATA = "";

    /**
     * @描述.用户注册
     */
    public static final String REGISTER_FAILED = "注册失败";
    public static final String REGISTER_EXIST = "用户已存在";
    public static final String REGISTER_SUCCESS = "注册成功";

    /**
     * @描述.用户登录
     */
    public static final String LOGIN_SUCCESS = "登录成功";
    public static final String LOGIN_NOT_EXIST = "该用户不存在,请注册";

    /**
     * @描述.插入数据库成功失败标识位
     */
    public static final int INSERT_SUCCESS_CODE = 1;
    public static final int INSERT_FAILED_CODE = 0;

    /**
     * @描述.添加商品
     */
    public static final String ADD_GOODS_SUCCESS = "商品添加成功";
    public static final String ADD_GOODS_FAILED = "商品添加失败";
    /**
     * @描述.删除成功失败标识位
     */
    public static final int DEL_SUCCESS_CODE = 0;
    public static final int DEL_FAILED_CODE = 1;

    /**
     * @描述.删除商品
     */
    public static final String DEL_GOODS_NOT_EXIST = "商品不存在";
    public static final String DEL_GOODS_SUCCESS = "商品删除失败";
    public static final String DEL_GOODS_FAILED = "商品删除成功";

    /**
     * @描述.更新商品
     */
    public static final String UPDATE_GOODS_FAILED = "更新商品失败";
    public static final String UPDATE_GOODS_EXIST = "更新失败,更新商品未做任何改变";
    public static final String UPDATE_GOODS_SUCCESS = "商品更新成功";
    /**
     * @描述.更新商品成功失败标识位
     */
    public static final int UPDATE_SUCCESS_CODE = 1;
    public static final int UPDATE_FAILED_CODE = 0;

    /**
     * @描述.请求来自于移动端还是Web端
     */
    public static final String REQUEST_FROM_MOBILE = "0";
    public static final String REQUEST_FROM_WEB = "1";


    /**
     * @描述.常用错误信息
     */
    public static final String REQUEST_PARAM_ERROR = "非法请求参数";
    public static final String NO_DATA = "暂无相关数据";

    /**
     * @描述.空字符串
     */
    public static final String NULL_STR = "";


}
