package com.cxd.project.system.gongchengshangbao.service;

import java.util.List;
import com.cxd.project.system.gongchengshangbao.domain.Gongchengshangbao;

/**
 * 工程上报信息Service接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface IGongchengshangbaoService 
{
    /**
     * 查询工程上报信息
     * 
     * @param id 工程上报信息主键
     * @return 工程上报信息
     */
    public Gongchengshangbao selectGongchengshangbaoById(String id);

    /**
     * 查询工程上报信息列表
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 工程上报信息集合
     */
    public List<Gongchengshangbao> selectGongchengshangbaoList(Gongchengshangbao gongchengshangbao);

    /**
     * 新增工程上报信息
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 结果
     */
    public int insertGongchengshangbao(Gongchengshangbao gongchengshangbao);

    /**
     * 修改工程上报信息
     * 
     * @param gongchengshangbao 工程上报信息
     * @return 结果
     */
    public int updateGongchengshangbao(Gongchengshangbao gongchengshangbao);

    /**
     * 批量删除工程上报信息
     * 
     * @param ids 需要删除的工程上报信息主键集合
     * @return 结果
     */
    public int deleteGongchengshangbaoByIds(String ids);

    /**
     * 删除工程上报信息信息
     * 
     * @param id 工程上报信息主键
     * @return 结果
     */
    public int deleteGongchengshangbaoById(String id);
}
