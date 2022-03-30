package com.cxd.project.system.xianluxuncha.mapper;

import java.util.List;
import com.cxd.project.system.xianluxuncha.domain.Xianluxuncha;

/**
 * 线路巡查信息Mapper接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface XianluxunchaMapper 
{
    /**
     * 查询线路巡查信息
     * 
     * @param id 线路巡查信息主键
     * @return 线路巡查信息
     */
    public Xianluxuncha selectXianluxunchaById(String id);

    /**
     * 查询线路巡查信息列表
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 线路巡查信息集合
     */
    public List<Xianluxuncha> selectXianluxunchaList(Xianluxuncha xianluxuncha);

    /**
     * 新增线路巡查信息
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 结果
     */
    public int insertXianluxuncha(Xianluxuncha xianluxuncha);

    /**
     * 修改线路巡查信息
     * 
     * @param xianluxuncha 线路巡查信息
     * @return 结果
     */
    public int updateXianluxuncha(Xianluxuncha xianluxuncha);

    /**
     * 删除线路巡查信息
     * 
     * @param id 线路巡查信息主键
     * @return 结果
     */
    public int deleteXianluxunchaById(String id);

    /**
     * 批量删除线路巡查信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXianluxunchaByIds(String[] ids);
}
