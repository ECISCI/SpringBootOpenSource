package com.it521.open.mobilesql.domain;


import com.it521.open.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 客户端用户操作日志表 table_user_log
 *
 * @author MingX
 * @date 2019-12-30
 */
public class TableUserLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 日志主键
     */
    private String operationId;
    /**
     * 模块标题
     */
    private String title;
    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     */
    private Integer businessType;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 操作类别（0其它 1后台用户 2手机端用户）
     */
    private Integer operationType;
    /**
     * 操作人员
     */
    private String operationName;
    /**
     * 请求URL
     */
    private String operationUrl;
    /**
     * 主机地址
     */
    private String operationIp;
    /**
     * 请求参数
     */
    private String operationParam;
    /**
     * 操作状态（0正常 1异常）
     */
    private String status;
    /**
     * 错误消息
     */
    private String errorMsg;
    /**
     * 操作时间（时间戳）
     */
    private String operationTime;

    public TableUserLog setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    public String getOperationId() {
        return operationId;
    }

    public TableUserLog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TableUserLog setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public TableUserLog setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public TableUserLog setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public TableUserLog setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    public String getOperationName() {
        return operationName;
    }

    public TableUserLog setOperationUrl(String operationUrl) {
        this.operationUrl = operationUrl;
        return this;
    }

    public String getOperationUrl() {
        return operationUrl;
    }

    public TableUserLog setOperationIp(String operationIp) {
        this.operationIp = operationIp;
        return this;
    }

    public String getOperationIp() {
        return operationIp;
    }

    public TableUserLog setOperationParam(String operationParam) {
        this.operationParam = operationParam;
        return this;
    }

    public String getOperationParam() {
        return operationParam;
    }

    public TableUserLog setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TableUserLog setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TableUserLog setOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    public String getOperationTime() {
        return operationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("operationId", getOperationId())
                .append("title", getTitle())
                .append("businessType", getBusinessType())
                .append("method", getMethod())
                .append("operationType", getOperationType())
                .append("operationName", getOperationName())
                .append("operationUrl", getOperationUrl())
                .append("operationIp", getOperationIp())
                .append("operationParam", getOperationParam())
                .append("status", getStatus())
                .append("errorMsg", getErrorMsg())
                .append("operationTime", getOperationTime())
                .toString();
    }
}
