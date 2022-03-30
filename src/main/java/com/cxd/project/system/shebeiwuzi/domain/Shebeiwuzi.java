package com.cxd.project.system.shebeiwuzi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 设备物资信息对象 shebeiwuzi
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Shebeiwuzi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 物资名称 */
    @Excel(name = "物资名称")
    private String wzmc;

    /** 个数 */
    @Excel(name = "个数")
    private Long gs;

    /** 电压等级（kv） */
    @Excel(name = "电压等级", readConverterExp = "k=v")
    private Long dydj;

    /** 额定容量（kvar） */
    @Excel(name = "额定容量", readConverterExp = "k=var")
    private String derl;

    /** 单台容量（kvar） */
    @Excel(name = "单台容量", readConverterExp = "k=var")
    private String dtrl;

    /** 额定电流（A） */
    @Excel(name = "额定电流", readConverterExp = "A=")
    private String dedl;

    /** 接地开关数 */
    @Excel(name = "接地开关数")
    private Long jdkgs;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setWzmc(String wzmc)
    {
        this.wzmc = wzmc;
    }

    public String getWzmc()
    {
        return wzmc;
    }
    public void setGs(Long gs)
    {
        this.gs = gs;
    }

    public Long getGs()
    {
        return gs;
    }
    public void setDydj(Long dydj)
    {
        this.dydj = dydj;
    }

    public Long getDydj()
    {
        return dydj;
    }
    public void setDerl(String derl)
    {
        this.derl = derl;
    }

    public String getDerl()
    {
        return derl;
    }
    public void setDtrl(String dtrl)
    {
        this.dtrl = dtrl;
    }

    public String getDtrl()
    {
        return dtrl;
    }
    public void setDedl(String dedl)
    {
        this.dedl = dedl;
    }

    public String getDedl()
    {
        return dedl;
    }
    public void setJdkgs(Long jdkgs)
    {
        this.jdkgs = jdkgs;
    }

    public Long getJdkgs()
    {
        return jdkgs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wzmc", getWzmc())
            .append("gs", getGs())
            .append("dydj", getDydj())
            .append("derl", getDerl())
            .append("dtrl", getDtrl())
            .append("dedl", getDedl())
            .append("jdkgs", getJdkgs())
            .toString();
    }
}
