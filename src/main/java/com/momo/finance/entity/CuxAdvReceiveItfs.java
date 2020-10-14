package com.momo.finance.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 收款接口表
 * </p>
 *
 * @author mrli
 * @since 2020-10-12
 */
@TableName("CUX_ADV_RECEIVE_ITFS")
@ApiModel(value="CuxAdvReceiveItfs对象", description="收款接口表")
public class CuxAdvReceiveItfs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DATA_ID")
    private String dataId;

    @TableField("SOURCE_CODE")
    private String sourceCode;

    @TableField("SOURCE_NAME")
    private String sourceName;

    @TableField("GAAP_CODE")
    private String gaapCode;

    @TableField("ENTITY_CODE")
    private String entityCode;

    @TableField("ENTITY_NAME")
    private String entityName;

    @TableField("CUSTOM_CODE")
    private String customCode;

    @TableField("CUSTOM_NAME")
    private String customName;

    @TableField("YW_DETAIL")
    private String ywDetail;

    @TableField("COA_BUS_CODE")
    private String coaBusCode;

    @TableField("COA_BUS_NAME")
    private String coaBusName;

    @TableField("COA_DEP_CODE")
    private String coaDepCode;

    @TableField("COA_DEP_NAME")
    private String coaDepName;

    @TableField("COA_PROJ_CODE")
    private String coaProjCode;

    @TableField("COA_PROJ_NAME")
    private String coaProjName;

    @TableField("CURRENCY")
    private String currency;

    @TableField("DEAL_DATE")
    private String dealDate;

    @TableField("GL_DATE")
    private String glDate;

    @TableField("RECV_PERIOD")
    private String recvPeriod;

    @TableField("MONTH_AMOUNT")
    private BigDecimal monthAmount;

    @TableField("BANK_NAME")
    private String bankName;

    @TableField("BRANCH_NAME")
    private String branchName;

    @TableField("BANK_ACCOUNT_NUM")
    private String bankAccountNum;

    @TableField("VALUE1")
    private String value1;

    @TableField("VALUE2")
    private String value2;

    @TableField("VALUE3")
    private String value3;

    @TableField("CREATION_DATE")
    private LocalDateTime creationDate;

    @TableField("CREATED_BY")
    private BigDecimal createdBy;

    @TableField("LAST_UPDATED_BY")
    private BigDecimal lastUpdatedBy;

    @TableField("LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

    @TableField("DATA_STATUS")
    private String dataStatus;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    public String getGaapCode() {
        return gaapCode;
    }

    public void setGaapCode(String gaapCode) {
        this.gaapCode = gaapCode;
    }
    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }
    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }
    public String getYwDetail() {
        return ywDetail;
    }

    public void setYwDetail(String ywDetail) {
        this.ywDetail = ywDetail;
    }
    public String getCoaBusCode() {
        return coaBusCode;
    }

    public void setCoaBusCode(String coaBusCode) {
        this.coaBusCode = coaBusCode;
    }
    public String getCoaBusName() {
        return coaBusName;
    }

    public void setCoaBusName(String coaBusName) {
        this.coaBusName = coaBusName;
    }
    public String getCoaDepCode() {
        return coaDepCode;
    }

    public void setCoaDepCode(String coaDepCode) {
        this.coaDepCode = coaDepCode;
    }
    public String getCoaDepName() {
        return coaDepName;
    }

    public void setCoaDepName(String coaDepName) {
        this.coaDepName = coaDepName;
    }
    public String getCoaProjCode() {
        return coaProjCode;
    }

    public void setCoaProjCode(String coaProjCode) {
        this.coaProjCode = coaProjCode;
    }
    public String getCoaProjName() {
        return coaProjName;
    }

    public void setCoaProjName(String coaProjName) {
        this.coaProjName = coaProjName;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }
    public String getGlDate() {
        return glDate;
    }

    public void setGlDate(String glDate) {
        this.glDate = glDate;
    }
    public String getRecvPeriod() {
        return recvPeriod;
    }

    public void setRecvPeriod(String recvPeriod) {
        this.recvPeriod = recvPeriod;
    }
    public BigDecimal getMonthAmount() {
        return monthAmount;
    }

    public void setMonthAmount(BigDecimal monthAmount) {
        this.monthAmount = monthAmount;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }
    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String toString() {
        return "CuxAdvReceiveItfs{" +
            "dataId=" + dataId +
            ", sourceCode=" + sourceCode +
            ", sourceName=" + sourceName +
            ", gaapCode=" + gaapCode +
            ", entityCode=" + entityCode +
            ", entityName=" + entityName +
            ", customCode=" + customCode +
            ", customName=" + customName +
            ", ywDetail=" + ywDetail +
            ", coaBusCode=" + coaBusCode +
            ", coaBusName=" + coaBusName +
            ", coaDepCode=" + coaDepCode +
            ", coaDepName=" + coaDepName +
            ", coaProjCode=" + coaProjCode +
            ", coaProjName=" + coaProjName +
            ", currency=" + currency +
            ", dealDate=" + dealDate +
            ", glDate=" + glDate +
            ", recvPeriod=" + recvPeriod +
            ", monthAmount=" + monthAmount +
            ", bankName=" + bankName +
            ", branchName=" + branchName +
            ", bankAccountNum=" + bankAccountNum +
            ", value1=" + value1 +
            ", value2=" + value2 +
            ", value3=" + value3 +
            ", creationDate=" + creationDate +
            ", createdBy=" + createdBy +
            ", lastUpdatedBy=" + lastUpdatedBy +
            ", lastUpdateDate=" + lastUpdateDate +
            ", dataStatus=" + dataStatus +
        "}";
    }
}
