package com.ruoyi.Recycle.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 旧衣物回收申请对象 recycle_application
 * 
 * @author ruoyi
 * @date 2025-02-25
 */
public class RecycleApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 申请ID，主键 */
    private Long id;

    /** 用户ID，关联到用户表 */
    @Excel(name = "用户ID，关联到用户表")
    private Long userId;

    /** 衣物类型（多个类型用逗号分隔） */
    @Excel(name = "衣物类型", readConverterExp = "多=个类型用逗号分隔")
    private String clothesType;

    /** 预估重量（公斤） */
    @Excel(name = "预估重量", readConverterExp = "公=斤")
    private BigDecimal estimatedWeight;

    /** 预约上门时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预约上门时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date appointmentTime;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String address;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String contactName;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String contactPhone;

    /** 申请状态（PENDING-待处理, PROCESSING-处理中, COMPLETED-已完成, CANCELED-已取消） */
    @Excel(name = "申请状态", readConverterExp = "P=ENDING-待处理,,P=ROCESSING-处理中,,C=OMPLETED-已完成,,C=ANCELED-已取消")
    private String status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setClothesType(String clothesType) 
    {
        this.clothesType = clothesType;
    }

    public String getClothesType() 
    {
        return clothesType;
    }
    public void setEstimatedWeight(BigDecimal estimatedWeight) 
    {
        this.estimatedWeight = estimatedWeight;
    }

    public BigDecimal getEstimatedWeight() 
    {
        return estimatedWeight;
    }
    public void setAppointmentTime(Date appointmentTime) 
    {
        this.appointmentTime = appointmentTime;
    }

    public Date getAppointmentTime() 
    {
        return appointmentTime;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }
    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("clothesType", getClothesType())
            .append("estimatedWeight", getEstimatedWeight())
            .append("appointmentTime", getAppointmentTime())
            .append("address", getAddress())
            .append("contactName", getContactName())
            .append("contactPhone", getContactPhone())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
