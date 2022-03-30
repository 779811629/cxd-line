package com.cxd.project.system.shigongrenyuan.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.shigongrenyuan.mapper.ShigongrenyuanMapper;
import com.cxd.project.system.shigongrenyuan.domain.Shigongrenyuan;
import com.cxd.project.system.shigongrenyuan.service.IShigongrenyuanService;
import com.cxd.common.utils.text.Convert;

/**
 * 施工人员信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class ShigongrenyuanServiceImpl implements IShigongrenyuanService 
{
    @Autowired
    private ShigongrenyuanMapper shigongrenyuanMapper;

    /**
     * 查询施工人员信息
     * 
     * @param id 施工人员信息主键
     * @return 施工人员信息
     */
    @Override
    public Shigongrenyuan selectShigongrenyuanById(String id)
    {
        return shigongrenyuanMapper.selectShigongrenyuanById(id);
    }

    /**
     * 查询施工人员信息列表
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 施工人员信息
     */
    @Override
    public List<Shigongrenyuan> selectShigongrenyuanList(Shigongrenyuan shigongrenyuan)
    {
        return shigongrenyuanMapper.selectShigongrenyuanList(shigongrenyuan);
    }

    /**
     * 新增施工人员信息
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 结果
     */
    @Override
    public int insertShigongrenyuan(Shigongrenyuan shigongrenyuan)
    {
        shigongrenyuan.setId(UUID.randomUUID().toString());
        return shigongrenyuanMapper.insertShigongrenyuan(shigongrenyuan);
    }

    /**
     * 修改施工人员信息
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 结果
     */
    @Override
    public int updateShigongrenyuan(Shigongrenyuan shigongrenyuan)
    {
        return shigongrenyuanMapper.updateShigongrenyuan(shigongrenyuan);
    }

    /**
     * 批量删除施工人员信息
     * 
     * @param ids 需要删除的施工人员信息主键
     * @return 结果
     */
    @Override
    public int deleteShigongrenyuanByIds(String ids)
    {
        return shigongrenyuanMapper.deleteShigongrenyuanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除施工人员信息信息
     * 
     * @param id 施工人员信息主键
     * @return 结果
     */
    @Override
    public int deleteShigongrenyuanById(String id)
    {
        return shigongrenyuanMapper.deleteShigongrenyuanById(id);
    }
}
