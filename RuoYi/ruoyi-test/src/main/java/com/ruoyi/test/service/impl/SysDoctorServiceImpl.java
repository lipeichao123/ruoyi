package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.SysDoctorMapper;
import com.ruoyi.test.domain.SysDoctor;
import com.ruoyi.test.service.ISysDoctorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 医生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-05-16
 */
@Service
public class SysDoctorServiceImpl implements ISysDoctorService 
{
    @Autowired
    private SysDoctorMapper sysDoctorMapper;

    /**
     * 查询医生信息
     * 
     * @param userId 医生信息ID
     * @return 医生信息
     */
    @Override
    public SysDoctor selectSysDoctorById(Long userId)
    {
        return sysDoctorMapper.selectSysDoctorById(userId);
    }

    /**
     * 查询医生信息列表
     * 
     * @param sysDoctor 医生信息
     * @return 医生信息
     */
    @Override
    public List<SysDoctor> selectSysDoctorList(SysDoctor sysDoctor)
    {
        return sysDoctorMapper.selectSysDoctorList(sysDoctor);
    }

    /**
     * 新增医生信息
     * 
     * @param sysDoctor 医生信息
     * @return 结果
     */
    @Override
    public int insertSysDoctor(SysDoctor sysDoctor)
    {
        return sysDoctorMapper.insertSysDoctor(sysDoctor);
    }

    /**
     * 修改医生信息
     * 
     * @param sysDoctor 医生信息
     * @return 结果
     */
    @Override
    public int updateSysDoctor(SysDoctor sysDoctor)
    {
        return sysDoctorMapper.updateSysDoctor(sysDoctor);
    }

    /**
     * 删除医生信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysDoctorByIds(String ids)
    {
        return sysDoctorMapper.deleteSysDoctorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除医生信息信息
     * 
     * @param userId 医生信息ID
     * @return 结果
     */
    @Override
    public int deleteSysDoctorById(Long userId)
    {
        return sysDoctorMapper.deleteSysDoctorById(userId);
    }
}
