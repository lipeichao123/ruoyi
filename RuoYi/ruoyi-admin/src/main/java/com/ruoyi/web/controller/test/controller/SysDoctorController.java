package com.ruoyi.web.controller.test.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.domain.SysDoctor;
import com.ruoyi.test.service.ISysDoctorService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生信息Controller
 *
 * @author ruoyi
 * @date 2020-05-16
 */
@Controller
@RequestMapping("/test/doctor")
public class SysDoctorController extends BaseController
{
    private String prefix = "test/doctor";

    @Autowired
    private ISysDoctorService sysDoctorService;

    @RequiresPermissions("test:doctor:view")
    @GetMapping()
    public String doctor()
    {
        return prefix + "/doctor";
    }

    /**
     * 查询医生信息列表
     */
    @RequiresPermissions("test:doctor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysDoctor sysDoctor)
    {
        startPage();
        List<SysDoctor> list = sysDoctorService.selectSysDoctorList(sysDoctor);
        return getDataTable(list);
    }

    /**
     * 导出医生信息列表
     */
    @RequiresPermissions("test:doctor:export")
    @Log(title = "医生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysDoctor sysDoctor)
    {
        List<SysDoctor> list = sysDoctorService.selectSysDoctorList(sysDoctor);
        ExcelUtil<SysDoctor> util = new ExcelUtil<SysDoctor>(SysDoctor.class);
        return util.exportExcel(list, "doctor");
    }

    /**
     * 新增医生信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存医生信息
     */
    @RequiresPermissions("test:doctor:add")
    @Log(title = "医生信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysDoctor sysDoctor)
    {
        return toAjax(sysDoctorService.insertSysDoctor(sysDoctor));
    }

    /**
     * 修改医生信息
     */
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        SysDoctor sysDoctor = sysDoctorService.selectSysDoctorById(userId);
        mmap.put("sysDoctor", sysDoctor);
        return prefix + "/edit";
    }

    /**
     * 修改保存医生信息
     */
    @RequiresPermissions("test:doctor:edit")
    @Log(title = "医生信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysDoctor sysDoctor)
    {
        return toAjax(sysDoctorService.updateSysDoctor(sysDoctor));
    }

    /**
     * 删除医生信息
     */
    @RequiresPermissions("test:doctor:remove")
    @Log(title = "医生信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysDoctorService.deleteSysDoctorByIds(ids));
    }
}
