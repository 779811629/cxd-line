package com.cxd.project.system.xianluxuncha.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.xianluxuncha.mapper.XianluxunchaMapper;
import com.cxd.project.system.xianluxuncha.domain.Xianluxuncha;
import com.cxd.project.system.xianluxuncha.service.IXianluxunchaService;
import com.cxd.common.utils.text.Convert;

/**
 * 线路巡查信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class XianluxunchaServiceImpl implements IXianluxunchaService 
{
    @Autowired
    private XianluxunchaMapper xianluxunchaMapper;

    /**
     * 查询线路巡查信息
     * 
     * @param id 线路巡查信息主键
     * @return 线路巡查信息
     */
    @Override
    public Xianluxuncha selectXianluxunchaById(String id)
    {
        return xianluxunchaMapper.selectXianluxunchaById(id);
    }

    /**
     * 查询线路巡查信息列表
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 线路巡查信息
     */
    @Override
    public List<Xianluxuncha> selectXianluxunchaList(Xianluxuncha xianluxuncha)
    {
        return xianluxunchaMapper.selectXianluxunchaList(xianluxuncha);
    }

    /**
     * 新增线路巡查信息
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 结果
     */
    @Override
    public int insertXianluxuncha(Xianluxuncha xianluxuncha)
    {
        xianluxuncha.setId(UUID.randomUUID().toString());
        return xianluxunchaMapper.insertXianluxuncha(xianluxuncha);
    }

    /**
     * 修改线路巡查信息
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 结果
     */
    @Override
    public int updateXianluxuncha(Xianluxuncha xianluxuncha)
    {
        return xianluxunchaMapper.updateXianluxuncha(xianluxuncha);
    }

    /**
     * 批量删除线路巡查信息
     * 
     * @param ids 需要删除的线路巡查信息主键
     * @return 结果
     */
    @Override
    public int deleteXianluxunchaByIds(String ids)
    {
        return xianluxunchaMapper.deleteXianluxunchaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除线路巡查信息信息
     * 
     * @param id 线路巡查信息主键
     * @return 结果
     */
    @Override
    public int deleteXianluxunchaById(String id)
    {
        return xianluxunchaMapper.deleteXianluxunchaById(id);
    }
}
