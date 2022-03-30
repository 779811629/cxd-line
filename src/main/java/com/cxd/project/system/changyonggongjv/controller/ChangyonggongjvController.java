package com.cxd.project.system.changyonggongjv.controller;

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
import com.cxd.project.system.changyonggongjv.domain.Changyonggongjv;
import com.cxd.project.system.changyonggongjv.service.IChangyonggongjvService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 常用工具信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/changyonggongjv")
public class ChangyonggongjvController extends BaseController
{
    private String prefix = "system/changyonggongjv";

    @Autowired
    private IChangyonggongjvService changyonggongjvService;

    @RequiresPermissions("system:changyonggongjv:view")
    @GetMapping()
    public String changyonggongjv()
    {
        return prefix + "/changyonggongjv";
    }

    /**
     * 查询常用工具信息列表
     */
    @RequiresPermissions("system:changyonggongjv:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Changyonggongjv changyonggongjv)
    {
        startPage();
        List<Changyonggongjv> list = changyonggongjvService.selectChangyonggongjvList(changyonggongjv);
        return getDataTable(list);
    }

    /**
     * 导出常用工具信息列表
     */
    @RequiresPermissions("system:changyonggongjv:export")
    @Log(title = "常用工具信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Changyonggongjv changyonggongjv)
    {
        List<Changyonggongjv> list = changyonggongjvService.selectChangyonggongjvList(changyonggongjv);
        ExcelUtil<Changyonggongjv> util = new ExcelUtil<Changyonggongjv>(Changyonggongjv.class);
        return util.exportExcel(list, "常用工具信息数据");
    }

    /**
     * 新增常用工具信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存常用工具信息
     */
    @RequiresPermissions("system:changyonggongjv:add")
    @Log(title = "常用工具信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Changyonggongjv changyonggongjv)
    {
        return toAjax(changyonggongjvService.insertChangyonggongjv(changyonggongjv));
    }

    /**
     * 修改常用工具信息
     */
    @RequiresPermissions("system:changyonggongjv:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Changyonggongjv changyonggongjv = changyonggongjvService.selectChangyonggongjvById(id);
        mmap.put("changyonggongjv", changyonggongjv);
        return prefix + "/edit";
    }

    /**
     * 修改保存常用工具信息
     */
    @RequiresPermissions("system:changyonggongjv:edit")
    @Log(title = "常用工具信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Changyonggongjv changyonggongjv)
    {
        return toAjax(changyonggongjvService.updateChangyonggongjv(changyonggongjv));
    }

    /**
     * 删除常用工具信息
     */
    @RequiresPermissions("system:changyonggongjv:remove")
    @Log(title = "常用工具信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(changyonggongjvService.deleteChangyonggongjvByIds(ids));
    }
}
