package com.cxd.project.system.shigongrenyuan.mapper;

import java.util.List;
import com.cxd.project.system.shigongrenyuan.domain.Shigongrenyuan;

/**
 * 施工人员信息Mapper接口
 * 
 * @author cxd
 * @date 2022-03-19
 */
public interface ShigongrenyuanMapper 
{
    /**
     * 查询施工人员信息
     * 
     * @param id 施工人员信息主键
     * @return 施工人员信息
     */
    public Shigongrenyuan selectShigongrenyuanById(String id);

    /**
     * 查询施工人员信息列表
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 施工人员信息集合
     */
    public List<Shigongrenyuan> selectShigongrenyuanList(Shigongrenyuan shigongrenyuan);

    /**
     * 新增施工人员信息
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 结果
     */
    public int insertShigongrenyuan(Shigongrenyuan shigongrenyuan);

    /**
     * 修改施工人员信息
     * 
     * @param shigongrenyuan 施工人员信息
     * @return 结果
     */
    public int updateShigongrenyuan(Shigongrenyuan shigongrenyuan);

    /**
     * 删除施工人员信息
     * 
     * @param id 施工人员信息主键
     * @return 结果
     */
    public int deleteShigongrenyuanById(String id);

    /**
     * 批量删除施工人员信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShigongrenyuanByIds(String[] ids);
}
