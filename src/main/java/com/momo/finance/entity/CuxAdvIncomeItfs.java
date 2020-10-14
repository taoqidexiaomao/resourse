package com.momo.finance.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 收入接口表
 * </p>
 *
 * @author mrli
 * @since 2020-10-13
 */
@TableName("CUX_ADV_INCOME_ITFS")
@ApiModel(value="CuxAdvIncomeItfs对象", description="收入接口表")
public class CuxAdvIncomeItfs extends Model<CuxAdvIncomeItfs> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "源ID")
    @TableField("DATA_ID")
    private String dataId;

    @TableField("SOURCE_CODE")
    private String sourceCode;

    @TableField("SOURCE_NAME")
    private String sourceName;

    @ApiModelProperty(value = "核算准则代码")
    @TableField("GAAP_CODE")
    private String gaapCode;

    @ApiModelProperty(value = "核算主体代码")
    @TableField("ENTITY_CODE")
    private String entityCode;

    @ApiModelProperty(value = "核算主体名称")
    @TableField("ENTITY_NAME")
    private String entityName;

    @TableField("ACC_CODE")
    private String accCode;

    @TableField("ACC_NAME")
    private String accName;

    @TableField("CUSTOM_TYPE_CODE")
    private String customTypeCode;

    @ApiModelProperty(value = "客户编码")
    @TableField("CUSTOM_CODE")
    private String customCode;

    @ApiModelProperty(value = "客户名称")
    @TableField("CUSTOM_NAME")
    private String customName;

    @ApiModelProperty(value = "业务明细名称")
    @TableField("YW_DETAIL")
    private String ywDetail;

    @ApiModelProperty(value = "业务类型代码")
    @TableField("COA_BUS_CODE")
    private String coaBusCode;

    @ApiModelProperty(value = "业务类型名称")
    @TableField("COA_BUS_NAME")
    private String coaBusName;

    @ApiModelProperty(value = "部门代码")
    @TableField("COA_DEP_CODE")
    private String coaDepCode;

    @ApiModelProperty(value = "部门名称")
    @TableField("COA_DEP_NAME")
    private String coaDepName;

    @ApiModelProperty(value = "项目代码")
    @TableField("COA_PROJ_CODE")
    private String coaProjCode;

    @ApiModelProperty(value = "项目名称")
    @TableField("COA_PROJ_NAME")
    private String coaProjName;

    @ApiModelProperty(value = "币种")
    @TableField("CURRENCY")
    private String currency;

    @ApiModelProperty(value = "收入日期")
    @TableField("INCOME_DATE")
    private String incomeDate;

    @ApiModelProperty(value = "GL日期")
    @TableField("GL_DATE")
    private String glDate;

    @ApiModelProperty(value = "金额")
    @TableField("MONTH_AMOUNT")
    private BigDecimal monthAmount;

    @ApiModelProperty(value = "是否调整")
    @TableField("ADJ_FLAG")
    private String adjFlag;

    @ApiModelProperty(value = "合同总金额")
    @TableField("CONTRACT_AMOUNT")
    private BigDecimal contractAmount;

    @ApiModelProperty(value = "合同期间")
    @TableField("CON_PERIOD")
    private String conPeriod;

    @ApiModelProperty(value = "执行额")
    @TableField("EXE_AMOUNT")
    private BigDecimal exeAmount;

    @ApiModelProperty(value = "预估返点")
    @TableField("ESTIMATE_REBATE")
    private BigDecimal estimateRebate;

    @ApiModelProperty(value = "支付返点")
    @TableField("PAYMENT_REBATE")
    private BigDecimal paymentRebate;

    @ApiModelProperty(value = "分成成本")
    @TableField("DIV_COST")
    private BigDecimal divCost;

    @ApiModelProperty(value = "分成返点")
    @TableField("DIV_REBATE")
    private BigDecimal divRebate;

    @ApiModelProperty(value = "备注")
    @TableField("MEMO")
    private String memo;

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
    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }
    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }
    public String getCustomTypeCode() {
        return customTypeCode;
    }

    public void setCustomTypeCode(String customTypeCode) {
        this.customTypeCode = customTypeCode;
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
    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate;
    }
    public String getGlDate() {
        return glDate;
    }

    public void setGlDate(String glDate) {
        this.glDate = glDate;
    }
    public BigDecimal getMonthAmount() {
        return monthAmount;
    }

    public void setMonthAmount(BigDecimal monthAmount) {
        this.monthAmount = monthAmount;
    }
    public String getAdjFlag() {
        return adjFlag;
    }

    public void setAdjFlag(String adjFlag) {
        this.adjFlag = adjFlag;
    }
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }
    public String getConPeriod() {
        return conPeriod;
    }

    public void setConPeriod(String conPeriod) {
        this.conPeriod = conPeriod;
    }
    public BigDecimal getExeAmount() {
        return exeAmount;
    }

    public void setExeAmount(BigDecimal exeAmount) {
        this.exeAmount = exeAmount;
    }
    public BigDecimal getEstimateRebate() {
        return estimateRebate;
    }

    public void setEstimateRebate(BigDecimal estimateRebate) {
        this.estimateRebate = estimateRebate;
    }
    public BigDecimal getPaymentRebate() {
        return paymentRebate;
    }

    public void setPaymentRebate(BigDecimal paymentRebate) {
        this.paymentRebate = paymentRebate;
    }
    public BigDecimal getDivCost() {
        return divCost;
    }

    public void setDivCost(BigDecimal divCost) {
        this.divCost = divCost;
    }
    public BigDecimal getDivRebate() {
        return divRebate;
    }

    public void setDivRebate(BigDecimal divRebate) {
        this.divRebate = divRebate;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "CuxAdvIncomeItfs{" +
            "dataId=" + dataId +
            ", sourceCode=" + sourceCode +
            ", sourceName=" + sourceName +
            ", gaapCode=" + gaapCode +
            ", entityCode=" + entityCode +
            ", entityName=" + entityName +
            ", accCode=" + accCode +
            ", accName=" + accName +
            ", customTypeCode=" + customTypeCode +
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
            ", incomeDate=" + incomeDate +
            ", glDate=" + glDate +
            ", monthAmount=" + monthAmount +
            ", adjFlag=" + adjFlag +
            ", contractAmount=" + contractAmount +
            ", conPeriod=" + conPeriod +
            ", exeAmount=" + exeAmount +
            ", estimateRebate=" + estimateRebate +
            ", paymentRebate=" + paymentRebate +
            ", divCost=" + divCost +
            ", divRebate=" + divRebate +
            ", memo=" + memo +
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
