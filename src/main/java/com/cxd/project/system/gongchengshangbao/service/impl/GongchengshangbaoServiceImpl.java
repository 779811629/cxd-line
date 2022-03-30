package com.cxd.project.system.gongchengshangbao.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.gongchengshangbao.mapper.GongchengshangbaoMapper;
import com.cxd.project.system.gongchengshangbao.domain.Gongchengshangbao;
import com.cxd.project.system.gongchengshangbao.service.IGongchengshangbaoService;
import com.cxd.common.utils.text.Convert;

/**
 * 工程上报信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class GongchengshangbaoServiceImpl implements IGongchengshangbaoService 
{
    @Autowired
    private GongchengshangbaoMapper gongchengshangbaoMapper;

    /**
     * 查询工程上报信息
     * 
     * @param id 工程上报信息主键
     * @return 工程上报信息
     */
    @Override
    public Gongchengshangbao selectGongchengshangbaoById(String id)
    {
        return gongchengshangbaoMapper.selectGongchengshangbaoById(id);
    }

    /**
     * 查询工程上报信息列表
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 工程上报信息
     */
    @Override
    public List<Gongchengshangbao> selectGongchengshangbaoList(Gongchengshangbao gongchengshangbao)
    {
        return gongchengshangbaoMapper.selectGongchengshangbaoList(gongchengshangbao);
    }

    /**
     * 新增工程上报信息
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 结果
     */
    @Override
    public int insertGongchengshangbao(Gongchengshangbao gongchengshangbao)
    {
        gongchengshangbao.setId(UUID.randomUUID().toString());
        return gongchengshangbaoMapper.insertGongchengshangbao(gongchengshangbao);
    }

    /**
     * 修改工程上报信息
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 结果
     */
    @Override
    public int updateGongchengshangbao(Gongchengshangbao gongchengshangbao)
    {
        return gongchengshangbaoMapper.updateGongchengshangbao(gongchengshangbao);
    }

    /**
     * 批量删除工程上报信息
     * 
     * @param ids 需要删除的工程上报信息主键
     * @return 结果
     */
    @Override
    public int deleteGongchengshangbaoByIds(String ids)
    {
        return gongchengshangbaoMapper.deleteGongchengshangbaoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工程上报信息信息
     * 
     * @param id 工程上报信息主键
     * @return 结果
     */
    @Override
    public int deleteGongchengshangbaoById(String id)
    {
        return gongchengshangbaoMapper.deleteGongchengshangbaoById(id);
    }
}
