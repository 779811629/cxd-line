package com.cxd.project.system.changyonggongjv.service;

import java.util.List;
import com.cxd.project.system.changyonggongjv.domain.Changyonggongjv;

/**
 * 常用工具信息Service接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface IChangyonggongjvService 
{
    /**
     * 查询常用工具信息
     * 
     * @param id 常用工具信息主键
     * @return 常用工具信息
     */
    public Changyonggongjv selectChangyonggongjvById(String id);

    /**
     * 查询常用工具信息列表
     * 
     * @param changyonggongjv 常用工具信息
     * @return 常用工具信息集合
     */
    public List<Changyonggongjv> selectChangyonggongjvList(Changyonggongjv changyonggongjv);

    /**
     * 新增常用工具信息
     * 
     * @param changyonggongjv 常用工具信息
     * @return 结果
     */
    public int insertChangyonggongjv(Changyonggongjv changyonggongjv);

    /**
     * 修改常用工具信息
     * 
     * @param changyonggongjv 常用工具信息
     * @return 结果
     */
    public int updateChangyonggongjv(Changyonggongjv changyonggongjv);

    /**
     * 批量删除常用工具信息
     * 
     * @param ids 需要删除的常用工具信息主键集合
     * @return 结果
     */
    public int deleteChangyonggongjvByIds(String ids);

    /**
     * 删除常用工具信息信息
     * 
     * @param id 常用工具信息主键
     * @return 结果
     */
    public int deleteChangyonggongjvById(String id);
}
