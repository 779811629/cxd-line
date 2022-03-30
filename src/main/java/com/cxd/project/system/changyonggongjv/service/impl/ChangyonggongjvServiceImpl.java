package com.cxd.project.system.changyonggongjv.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cxd.project.system.changyonggongjv.mapper.ChangyonggongjvMapper;
import com.cxd.project.system.changyonggongjv.domain.Changyonggongjv;
import com.cxd.project.system.changyonggongjv.service.IChangyonggongjvService;
import com.cxd.common.utils.text.Convert;

/**
 * 常用工具信息Service业务层处理
 * 
 * @author cxd
 * @date 2022-03-19
 */
@Service
public class ChangyonggongjvServiceImpl implements IChangyonggongjvService 
{
    @Autowired
    private ChangyonggongjvMapper changyonggongjvMapper;

    /**
     * 查询常用工具信息
     * 
     * @param id 常用工具信息主键
     * @return 常用工具信息
     */
    @Override
    public Changyonggongjv selectChangyonggongjvById(String id)
    {
        return changyonggongjvMapper.selectChangyonggongjvById(id);
    }

    /**
     * 查询常用工具信息列表
     * 
     * @param changyonggongjv 常用工具信息
     * @return 常用工具信息
     */
    @Override
    public List<Changyonggongjv> selectChangyonggongjvList(Changyonggongjv changyonggongjv)
    {
        return changyonggongjvMapper.selectChangyonggongjvList(changyonggongjv);
    }

    /**
     * 新增常用工具信息
     * 
     * @param changyonggongjv 常用工具信息
     * @return 结果
     */
    @Override
    public int insertChangyonggongjv(Changyonggongjv changyonggongjv)
    {
        changyonggongjv.setId(UUID.randomUUID().toString());
        return changyonggongjvMapper.insertChangyonggongjv(changyonggongjv);
    }

    /**
     * 修改常用工具信息
     * 
     * @param changyonggongjv 常用工具信息
     * @return 结果
     */
    @Override
    public int updateChangyonggongjv(Changyonggongjv changyonggongjv)
    {
        return changyonggongjvMapper.updateChangyonggongjv(changyonggongjv);
    }

    /**
     * 批量删除常用工具信息
     * 
     * @param ids 需要删除的常用工具信息主键
     * @return 结果
     */
    @Override
    public int deleteChangyonggongjvByIds(String ids)
    {
        return changyonggongjvMapper.deleteChangyonggongjvByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除常用工具信息信息
     * 
     * @param id 常用工具信息主键
     * @return 结果
     */
    @Override
    public int deleteChangyonggongjvById(String id)
    {
        return changyonggongjvMapper.deleteChangyonggongjvById(id);
    }
}
