package com.cxd.project.system.shebeiwuzi.controller;

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
import com.cxd.framework.aspectj.lang.annotation.Log;
import com.cxd.framework.aspectj.lang.enums.BusinessType;
import com.cxd.project.system.shebeiwuzi.domain.Shebeiwuzi;
import com.cxd.project.system.shebeiwuzi.service.IShebeiwuziService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 设备物资信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/shebeiwuzi")
public class ShebeiwuziController extends BaseController
{
    private String prefix = "system/shebeiwuzi";

    @Autowired
    private IShebeiwuziService shebeiwuziService;

    @RequiresPermissions("system:shebeiwuzi:view")
    @GetMapping()
    public String shebeiwuzi()
    {
        return prefix + "/shebeiwuzi";
    }

    /**
     * 查询设备物资信息列表
     */
    @RequiresPermissions("system:shebeiwuzi:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Shebeiwuzi shebeiwuzi)
    {
        startPage();
        List<Shebeiwuzi> list = shebeiwuziService.selectShebeiwuziList(shebeiwuzi);
        return getDataTable(list);
    }

    /**
     * 导出设备物资信息列表
     */
    @RequiresPermissions("system:shebeiwuzi:export")
    @Log(title = "设备物资信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shebeiwuzi shebeiwuzi)
    {
        List<Shebeiwuzi> list = shebeiwuziService.selectShebeiwuziList(shebeiwuzi);
        ExcelUtil<Shebeiwuzi> util = new ExcelUtil<Shebeiwuzi>(Shebeiwuzi.class);
        return util.exportExcel(list, "设备物资信息数据");
    }

    /**
     * 新增设备物资信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备物资信息
     */
    @RequiresPermissions("system:shebeiwuzi:add")
    @Log(title = "设备物资信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Shebeiwuzi shebeiwuzi)
    {
        return toAjax(shebeiwuziService.insertShebeiwuzi(shebeiwuzi));
    }

    /**
     * 修改设备物资信息
     */
    @RequiresPermissions("system:shebeiwuzi:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Shebeiwuzi shebeiwuzi = shebeiwuziService.selectShebeiwuziById(id);
        mmap.put("shebeiwuzi", shebeiwuzi);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备物资信息
     */
    @RequiresPermissions("system:shebeiwuzi:edit")
    @Log(title = "设备物资信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Shebeiwuzi shebeiwuzi)
    {
        return toAjax(shebeiwuziService.updateShebeiwuzi(shebeiwuzi));
    }

    /**
     * 删除设备物资信息
     */
    @RequiresPermissions("system:shebeiwuzi:remove")
    @Log(title = "设备物资信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shebeiwuziService.deleteShebeiwuziByIds(ids));
    }
}
