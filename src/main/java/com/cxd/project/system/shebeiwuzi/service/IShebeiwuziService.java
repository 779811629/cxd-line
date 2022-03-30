package com.cxd.project.system.shebeiwuzi.service;

import java.util.List;
import com.cxd.project.system.shebeiwuzi.domain.Shebeiwuzi;

/**
 * 设备物资信息Service接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface IShebeiwuziService 
{
    /**
     * 查询设备物资信息
     * 
     * @param id 设备物资信息主键
     * @return 设备物资信息
     */
    public Shebeiwuzi selectShebeiwuziById(String id);

    /**
     * 查询设备物资信息列表
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 设备物资信息集合
     */
    public List<Shebeiwuzi> selectShebeiwuziList(Shebeiwuzi shebeiwuzi);

    /**
     * 新增设备物资信息
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 结果
     */
    public int insertShebeiwuzi(Shebeiwuzi shebeiwuzi);

    /**
     * 修改设备物资信息
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 结果
     */
    public int updateShebeiwuzi(Shebeiwuzi shebeiwuzi);

    /**
     * 批量删除设备物资信息
     * 
     * @param ids 需要删除的设备物资信息主键集合
     * @return 结果
     */
    public int deleteShebeiwuziByIds(String ids);

    /**
     * 删除设备物资信息信息
     * 
     * @param id 设备物资信息主键
     * @return 结果
     */
    public int deleteShebeiwuziById(String id);
}
