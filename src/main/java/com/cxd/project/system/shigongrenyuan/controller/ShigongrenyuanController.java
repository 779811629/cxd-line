package com.cxd.project.system.shigongrenyuan.controller;

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
import com.cxd.project.system.shigongrenyuan.domain.Shigongrenyuan;
import com.cxd.project.system.shigongrenyuan.service.IShigongrenyuanService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 施工人员信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/shigongrenyuan")
public class ShigongrenyuanController extends BaseController
{
    private String prefix = "system/shigongrenyuan";

    @Autowired
    private IShigongrenyuanService shigongrenyuanService;

    @RequiresPermissions("system:shigongrenyuan:view")
    @GetMapping()
    public String shigongrenyuan()
    {
        return prefix + "/shigongrenyuan";
    }

    /**
     * 查询施工人员信息列表
     */
    @RequiresPermissions("system:shigongrenyuan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Shigongrenyuan shigongrenyuan)
    {
        startPage();
        List<Shigongrenyuan> list = shigongrenyuanService.selectShigongrenyuanList(shigongrenyuan);
        return getDataTable(list);
    }

    /**
     * 导出施工人员信息列表
     */
    @RequiresPermissions("system:shigongrenyuan:export")
    @Log(title = "施工人员信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shigongrenyuan shigongrenyuan)
    {
        List<Shigongrenyuan> list = shigongrenyuanService.selectShigongrenyuanList(shigongrenyuan);
        ExcelUtil<Shigongrenyuan> util = new ExcelUtil<Shigongrenyuan>(Shigongrenyuan.class);
        return util.exportExcel(list, "施工人员信息数据");
    }

    /**
     * 新增施工人员信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存施工人员信息
     */
    @RequiresPermissions("system:shigongrenyuan:add")
    @Log(title = "施工人员信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Shigongrenyuan shigongrenyuan)
    {
        return toAjax(shigongrenyuanService.insertShigongrenyuan(shigongrenyuan));
    }

    /**
     * 修改施工人员信息
     */
    @RequiresPermissions("system:shigongrenyuan:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Shigongrenyuan shigongrenyuan = shigongrenyuanService.selectShigongrenyuanById(id);
        mmap.put("shigongrenyuan", shigongrenyuan);
        return prefix + "/edit";
    }

    /**
     * 修改保存施工人员信息
     */
    @RequiresPermissions("system:shigongrenyuan:edit")
    @Log(title = "施工人员信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Shigongrenyuan shigongrenyuan)
    {
        return toAjax(shigongrenyuanService.updateShigongrenyuan(shigongrenyuan));
    }

    /**
     * 删除施工人员信息
     */
    @RequiresPermissions("system:shigongrenyuan:remove")
    @Log(title = "施工人员信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shigongrenyuanService.deleteShigongrenyuanByIds(ids));
    }
}
