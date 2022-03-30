package com.cxd.project.system.shudianguzhang.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.shudianguzhang.mapper.ShudianguzhangMapper;
import com.cxd.project.system.shudianguzhang.domain.Shudianguzhang;
import com.cxd.project.system.shudianguzhang.service.IShudianguzhangService;
import com.cxd.common.utils.text.Convert;

/**
 * 输电故障信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class ShudianguzhangServiceImpl implements IShudianguzhangService 
{
    @Autowired
    private ShudianguzhangMapper shudianguzhangMapper;

    /**
     * 查询输电故障信息
     * 
     * @param id 输电故障信息主键
     * @return 输电故障信息
     */
    @Override
    public Shudianguzhang selectShudianguzhangById(String id)
    {
        return shudianguzhangMapper.selectShudianguzhangById(id);
    }

    /**
     * 查询输电故障信息列表
     * 
     * @param shudianguzhang 输电故障信息
     * @return 输电故障信息
     */
    @Override
    public List<Shudianguzhang> selectShudianguzhangList(Shudianguzhang shudianguzhang)
    {
        return shudianguzhangMapper.selectShudianguzhangList(shudianguzhang);
    }

    /**
     * 新增输电故障信息
     * 
     * @param shudianguzhang 输电故障信息
     * @return 结果
     */
    @Override
    public int insertShudianguzhang(Shudianguzhang shudianguzhang)
    {
        shudianguzhang.setId(UUID.randomUUID().toString());
        return shudianguzhangMapper.insertShudianguzhang(shudianguzhang);
    }

    /**
     * 修改输电故障信息
     * 
     * @param shudianguzhang 输电故障信息
     * @return 结果
     */
    @Override
    public int updateShudianguzhang(Shudianguzhang shudianguzhang)
    {
        return shudianguzhangMapper.updateShudianguzhang(shudianguzhang);
    }

    /**
     * 批量删除输电故障信息
     * 
     * @param ids 需要删除的输电故障信息主键
     * @return 结果
     */
    @Override
    public int deleteShudianguzhangByIds(String ids)
    {
        return shudianguzhangMapper.deleteShudianguzhangByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除输电故障信息信息
     * 
     * @param id 输电故障信息主键
     * @return 结果
     */
    @Override
    public int deleteShudianguzhangById(String id)
    {
        return shudianguzhangMapper.deleteShudianguzhangById(id);
    }
}
