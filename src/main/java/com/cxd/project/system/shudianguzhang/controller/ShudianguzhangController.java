package com.cxd.project.system.shudianguzhang.controller;

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
import com.cxd.project.system.shudianguzhang.domain.Shudianguzhang;
import com.cxd.project.system.shudianguzhang.service.IShudianguzhangService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 输电故障信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/shudianguzhang")
public class ShudianguzhangController extends BaseController
{
    private String prefix = "system/shudianguzhang";

    @Autowired
    private IShudianguzhangService shudianguzhangService;

    @RequiresPermissions("system:shudianguzhang:view")
    @GetMapping()
    public String shudianguzhang()
    {
        return prefix + "/shudianguzhang";
    }

    /**
     * 查询输电故障信息列表
     */
    @RequiresPermissions("system:shudianguzhang:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Shudianguzhang shudianguzhang)
    {
        startPage();
        List<Shudianguzhang> list = shudianguzhangService.selectShudianguzhangList(shudianguzhang);
        return getDataTable(list);
    }

    /**
     * 导出输电故障信息列表
     */
    @RequiresPermissions("system:shudianguzhang:export")
    @Log(title = "输电故障信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shudianguzhang shudianguzhang)
    {
        List<Shudianguzhang> list = shudianguzhangService.selectShudianguzhangList(shudianguzhang);
        ExcelUtil<Shudianguzhang> util = new ExcelUtil<Shudianguzhang>(Shudianguzhang.class);
        return util.exportExcel(list, "输电故障信息数据");
    }

    /**
     * 新增输电故障信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存输电故障信息
     */
    @RequiresPermissions("system:shudianguzhang:add")
    @Log(title = "输电故障信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Shudianguzhang shudianguzhang)
    {
        return toAjax(shudianguzhangService.insertShudianguzhang(shudianguzhang));
    }

    /**
     * 修改输电故障信息
     */
    @RequiresPermissions("system:shudianguzhang:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Shudianguzhang shudianguzhang = shudianguzhangService.selectShudianguzhangById(id);
        mmap.put("shudianguzhang", shudianguzhang);
        return prefix + "/edit";
    }

    /**
     * 修改保存输电故障信息
     */
    @RequiresPermissions("system:shudianguzhang:edit")
    @Log(title = "输电故障信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Shudianguzhang shudianguzhang)
    {
        return toAjax(shudianguzhangService.updateShudianguzhang(shudianguzhang));
    }

    /**
     * 删除输电故障信息
     */
    @RequiresPermissions("system:shudianguzhang:remove")
    @Log(title = "输电故障信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shudianguzhangService.deleteShudianguzhangByIds(ids));
    }
}
