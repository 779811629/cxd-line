package com.cxd.project.system.gongchengshangbao.controller;

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
import com.cxd.project.system.gongchengshangbao.domain.Gongchengshangbao;
import com.cxd.project.system.gongchengshangbao.service.IGongchengshangbaoService;
import com.cxd.framework.web.controller.BaseController;
import com.cxd.framework.web.domain.AjaxResult;
import com.cxd.common.utils.poi.ExcelUtil;
import com.cxd.framework.web.page.TableDataInfo;

/**
 * 工程上报信息Controller
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Controller
@RequestMapping("/system/gongchengshangbao")
public class GongchengshangbaoController extends BaseController
{
    private String prefix = "system/gongchengshangbao";

    @Autowired
    private IGongchengshangbaoService gongchengshangbaoService;

    @RequiresPermissions("system:gongchengshangbao:view")
    @GetMapping()
    public String gongchengshangbao()
    {
        return prefix + "/gongchengshangbao";
    }

    /**
     * 查询工程上报信息列表
     */
    @RequiresPermissions("system:gongchengshangbao:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Gongchengshangbao gongchengshangbao)
    {
        startPage();
        List<Gongchengshangbao> list = gongchengshangbaoService.selectGongchengshangbaoList(gongchengshangbao);
        return getDataTable(list);
    }

    /**
     * 导出工程上报信息列表
     */
    @RequiresPermissions("system:gongchengshangbao:export")
    @Log(title = "工程上报信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Gongchengshangbao gongchengshangbao)
    {
        List<Gongchengshangbao> list = gongchengshangbaoService.selectGongchengshangbaoList(gongchengshangbao);
        ExcelUtil<Gongchengshangbao> util = new ExcelUtil<Gongchengshangbao>(Gongchengshangbao.class);
        return util.exportExcel(list, "工程上报信息数据");
    }

    /**
     * 新增工程上报信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工程上报信息
     */
    @RequiresPermissions("system:gongchengshangbao:add")
    @Log(title = "工程上报信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Gongchengshangbao gongchengshangbao)
    {
        return toAjax(gongchengshangbaoService.insertGongchengshangbao(gongchengshangbao));
    }

    /**
     * 修改工程上报信息
     */
    @RequiresPermissions("system:gongchengshangbao:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Gongchengshangbao gongchengshangbao = gongchengshangbaoService.selectGongchengshangbaoById(id);
        mmap.put("gongchengshangbao", gongchengshangbao);
        return prefix + "/edit";
    }

    /**
     * 修改保存工程上报信息
     */
    @RequiresPermissions("system:gongchengshangbao:edit")
    @Log(title = "工程上报信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Gongchengshangbao gongchengshangbao)
    {
        return toAjax(gongchengshangbaoService.updateGongchengshangbao(gongchengshangbao));
    }

    /**
     * 删除工程上报信息
     */
    @RequiresPermissions("system:gongchengshangbao:remove")
    @Log(title = "工程上报信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gongchengshangbaoService.deleteGongchengshangbaoByIds(ids));
    }
}
