package com.ruoyi.test.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生信息对象 sys_doctor
 * 
 * @author ruoyi
 * @date 2020-05-16
 */
public class SysDoctor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生Id */
    private Long userId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String doctorName;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long doctorAge;

    /** 性别 */
    @Excel(name = "性别")
    private Integer sex;

    /** 身份证 */
    @Excel(name = "身份证")
    private String certId;

    /** 部门 */
    @Excel(name = "部门")
    private String department;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 介绍 */
    @Excel(name = "介绍")
    private String text;

    /** 是否为专家 */
    @Excel(name = "是否为专家")
    private Long expert;

    /** 是否注册 */
    @Excel(name = "是否注册")
    private Integer register;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDoctorName(String doctorName) 
    {
        this.doctorName = doctorName;
    }

    public String getDoctorName() 
    {
        return doctorName;
    }
    public void setDoctorAge(Long doctorAge) 
    {
        this.doctorAge = doctorAge;
    }

    public Long getDoctorAge() 
    {
        return doctorAge;
    }
    public void setSex(Integer sex) 
    {
        this.sex = sex;
    }

    public Integer getSex() 
    {
        return sex;
    }
    public void setCertId(String certId) 
    {
        this.certId = certId;
    }

    public String getCertId() 
    {
        return certId;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setText(String text) 
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }
    public void setExpert(Long expert) 
    {
        this.expert = expert;
    }

    public Long getExpert() 
    {
        return expert;
    }
    public void setRegister(Integer register) 
    {
        this.register = register;
    }

    public Integer getRegister() 
    {
        return register;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("doctorName", getDoctorName())
            .append("doctorAge", getDoctorAge())
            .append("sex", getSex())
            .append("certId", getCertId())
            .append("department", getDepartment())
            .append("address", getAddress())
            .append("text", getText())
            .append("expert", getExpert())
            .append("register", getRegister())
            .toString();
    }
}
