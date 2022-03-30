package com.cxd.project.system.shudianguzhang.service;

import java.util.List;
import com.cxd.project.system.shudianguzhang.domain.Shudianguzhang;

/**
 * 输电故障信息Service接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface IShudianguzhangService 
{
    /**
     * 查询输电故障信息
     * 
     * @param id 输电故障信息主键
     * @return 输电故障信息
     */
    public Shudianguzhang selectShudianguzhangById(String id);

    /**
     * 查询输电故障信息列表
     * 
     * @param shudianguzhang 输电故障信息
     * @return 输电故障信息集合
     */
    public List<Shudianguzhang> selectShudianguzhangList(Shudianguzhang shudianguzhang);

    /**
     * 新增输电故障信息
     * 
     * @param shudianguzhang 输电故障信息
     * @return 结果
     */
    public int insertShudianguzhang(Shudianguzhang shudianguzhang);

    /**
     * 修改输电故障信息
     * 
     * @param shudianguzhang 输电故障信息
     * @return 结果
     */
    public int updateShudianguzhang(Shudianguzhang shudianguzhang);

    /**
     * 批量删除输电故障信息
     * 
     * @param ids 需要删除的输电故障信息主键集合
     * @return 结果
     */
    public int deleteShudianguzhangByIds(String ids);

    /**
     * 删除输电故障信息信息
     * 
     * @param id 输电故障信息主键
     * @return 结果
     */
    public int deleteShudianguzhangById(String id);
}
