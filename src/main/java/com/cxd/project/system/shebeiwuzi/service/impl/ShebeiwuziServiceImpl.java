package com.cxd.project.system.shebeiwuzi.service.impl;

import java.util.List;

import com.cxd.common.utils.uuid.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.shebeiwuzi.mapper.ShebeiwuziMapper;
import com.cxd.project.system.shebeiwuzi.domain.Shebeiwuzi;
import com.cxd.project.system.shebeiwuzi.service.IShebeiwuziService;
import com.cxd.common.utils.text.Convert;

/**
 * 设备物资信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class ShebeiwuziServiceImpl implements IShebeiwuziService 
{
    @Autowired
    private ShebeiwuziMapper shebeiwuziMapper;

    /**
     * 查询设备物资信息
     * 
     * @param id 设备物资信息主键
     * @return 设备物资信息
     */
    @Override
    public Shebeiwuzi selectShebeiwuziById(String id)
    {
        return shebeiwuziMapper.selectShebeiwuziById(id);
    }

    /**
     * 查询设备物资信息列表
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 设备物资信息
     */
    @Override
    public List<Shebeiwuzi> selectShebeiwuziList(Shebeiwuzi shebeiwuzi)
    {
        return shebeiwuziMapper.selectShebeiwuziList(shebeiwuzi);
    }

    /**
     * 新增设备物资信息
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 结果
     */
    @Override
    public int insertShebeiwuzi(Shebeiwuzi shebeiwuzi)
    {
        shebeiwuzi.setId(UUID.randomUUID().toString());
        return shebeiwuziMapper.insertShebeiwuzi(shebeiwuzi);
    }

    /**
     * 修改设备物资信息
     * 
     * @param shebeiwuzi 设备物资信息
     * @return 结果
     */
    @Override
    public int updateShebeiwuzi(Shebeiwuzi shebeiwuzi)
    {
        return shebeiwuziMapper.updateShebeiwuzi(shebeiwuzi);
    }

    /**
     * 批量删除设备物资信息
     * 
     * @param ids 需要删除的设备物资信息主键
     * @return 结果
     */
    @Override
    public int deleteShebeiwuziByIds(String ids)
    {
        return shebeiwuziMapper.deleteShebeiwuziByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备物资信息信息
     * 
     * @param id 设备物资信息主键
     * @return 结果
     */
    @Override
    public int deleteShebeiwuziById(String id)
    {
        return shebeiwuziMapper.deleteShebeiwuziById(id);
    }
}
