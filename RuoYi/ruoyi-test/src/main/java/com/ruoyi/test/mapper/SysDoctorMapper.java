package com.ruoyi.test.mapper;

import java.util.List;
import com.ruoyi.test.domain.SysDoctor;

/**
 * 医生信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-05-16
 */
public interface SysDoctorMapper 
{
    /**
     * 查询医生信息
     * 
     * @param userId 医生信息ID
     * @return 医生信息
     */
    public SysDoctor selectSysDoctorById(Long userId);

    /**
     * 查询医生信息列表
     * 
     * @param sysDoctor 医生信息
     * @return 医生信息集合
     */
    public List<SysDoctor> selectSysDoctorList(SysDoctor sysDoctor);

    /**
     * 新增医生信息
     * 
     * @param sysDoctor 医生信息
     * @return 结果
     */
    public int insertSysDoctor(SysDoctor sysDoctor);

    /**
     * 修改医生信息
     * 
     * @param sysDoctor 医生信息
     * @return 结果
     */
    public int updateSysDoctor(SysDoctor sysDoctor);

    /**
     * 删除医生信息
     * 
     * @param userId 医生信息ID
     * @return 结果
     */
    public int deleteSysDoctorById(Long userId);

    /**
     * 批量删除医生信息
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysDoctorByIds(String[] userIds);
}
