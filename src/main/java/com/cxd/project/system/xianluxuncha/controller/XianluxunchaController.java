package com.cxd.project.system.xianluxuncha.controller;

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
import com.cxd.project.system.xianluxuncha.domain.Xianluxuncha;
import com.cxd.project.system.xianluxuncha.service.IXianluxunchaService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 线路巡查信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/xianluxuncha")
public class XianluxunchaController extends BaseController
{
    private String prefix = "system/xianluxuncha";

    @Autowired
    private IXianluxunchaService xianluxunchaService;

    @RequiresPermissions("system:xianluxuncha:view")
    @GetMapping()
    public String xianluxuncha()
    {
        return prefix + "/xianluxuncha";
    }

    /**
     * 查询线路巡查信息列表
     */
    @RequiresPermissions("system:xianluxuncha:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Xianluxuncha xianluxuncha)
    {
        startPage();
        List<Xianluxuncha> list = xianluxunchaService.selectXianluxunchaList(xianluxuncha);
        return getDataTable(list);
    }

    /**
     * 导出线路巡查信息列表
     */
    @RequiresPermissions("system:xianluxuncha:export")
    @Log(title = "线路巡查信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Xianluxuncha xianluxuncha)
    {
        List<Xianluxuncha> list = xianluxunchaService.selectXianluxunchaList(xianluxuncha);
        ExcelUtil<Xianluxuncha> util = new ExcelUtil<Xianluxuncha>(Xianluxuncha.class);
        return util.exportExcel(list, "线路巡查信息数据");
    }

    /**
     * 新增线路巡查信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存线路巡查信息
     */
    @RequiresPermissions("system:xianluxuncha:add")
    @Log(title = "线路巡查信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Xianluxuncha xianluxuncha)
    {
        return toAjax(xianluxunchaService.insertXianluxuncha(xianluxuncha));
    }

    /**
     * 修改线路巡查信息
     */
    @RequiresPermissions("system:xianluxuncha:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Xianluxuncha xianluxuncha = xianluxunchaService.selectXianluxunchaById(id);
        mmap.put("xianluxuncha", xianluxuncha);
        return prefix + "/edit";
    }

    /**
     * 修改保存线路巡查信息
     */
    @RequiresPermissions("system:xianluxuncha:edit")
    @Log(title = "线路巡查信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Xianluxuncha xianluxuncha)
    {
        return toAjax(xianluxunchaService.updateXianluxuncha(xianluxuncha));
    }

    /**
     * 删除线路巡查信息
     */
    @RequiresPermissions("system:xianluxuncha:remove")
    @Log(title = "线路巡查信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xianluxunchaService.deleteXianluxunchaByIds(ids));
    }
}
