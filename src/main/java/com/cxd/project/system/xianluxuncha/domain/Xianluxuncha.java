package com.cxd.project.system.xianluxuncha.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 线路巡查信息对象 xianluxuncha
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Xianluxuncha extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 编号 */
    @Excel(name = "编号")
    private String bianhao;

    /** 线路名称 */
    @Excel(name = "线路名称")
    private String luxianmingcheng;

    /** 线路长度 */
    @Excel(name = "线路长度")
    private String luxianchengdu;

    /** 电线杆总数 */
    @Excel(name = "电线杆总数")
    private Long dianxianganzongshu;

    /** 巡查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "巡查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date xunchashijian;

    /** 巡查次数 */
    @Excel(name = "巡查次数")
    private Long xunchacishu;

    /** 巡查人数 */
    @Excel(name = "巡查人数")
    private String xuncharenshu;

    /** 线路状态 */
    @Excel(name = "线路状态")
    private String xianluzhuangtai;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setBianhao(String bianhao)
    {
        this.bianhao = bianhao;
    }

    public String getBianhao()
    {
        return bianhao;
    }
    public void setLuxianmingcheng(String luxianmingcheng)
    {
        this.luxianmingcheng = luxianmingcheng;
    }

    public String getLuxianmingcheng()
    {
        return luxianmingcheng;
    }
    public void setLuxianchengdu(String luxianchengdu)
    {
        this.luxianchengdu = luxianchengdu;
    }

    public String getLuxianchengdu()
    {
        return luxianchengdu;
    }
    public void setDianxianganzongshu(Long dianxianganzongshu)
    {
        this.dianxianganzongshu = dianxianganzongshu;
    }

    public Long getDianxianganzongshu()
    {
        return dianxianganzongshu;
    }
    public void setXunchashijian(Date xunchashijian)
    {
        this.xunchashijian = xunchashijian;
    }

    public Date getXunchashijian()
    {
        return xunchashijian;
    }
    public void setXunchacishu(Long xunchacishu)
    {
        this.xunchacishu = xunchacishu;
    }

    public Long getXunchacishu()
    {
        return xunchacishu;
    }
    public void setXuncharenshu(String xuncharenshu)
    {
        this.xuncharenshu = xuncharenshu;
    }

    public String getXuncharenshu()
    {
        return xuncharenshu;
    }
    public void setXianluzhuangtai(String xianluzhuangtai)
    {
        this.xianluzhuangtai = xianluzhuangtai;
    }

    public String getXianluzhuangtai()
    {
        return xianluzhuangtai;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bianhao", getBianhao())
            .append("luxianmingcheng", getLuxianmingcheng())
            .append("luxianchengdu", getLuxianchengdu())
            .append("dianxianganzongshu", getDianxianganzongshu())
            .append("xunchashijian", getXunchashijian())
            .append("xunchacishu", getXunchacishu())
            .append("xuncharenshu", getXuncharenshu())
            .append("xianluzhuangtai", getXianluzhuangtai())
            .toString();
    }
}
