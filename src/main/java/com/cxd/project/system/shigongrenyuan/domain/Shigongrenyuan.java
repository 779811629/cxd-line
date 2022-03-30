package com.cxd.project.system.shigongrenyuan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 施工人员信息对象 shigongrenyuan
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Shigongrenyuan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 年龄 */
    @Excel(name = "年龄")
    private String nl;

    /** 性别 */
    @Excel(name = "性别")
    private Long xb;

    /** 职位 */
    @Excel(name = "职位")
    private String zw;

    /** 所在分队 */
    @Excel(name = "所在分队")
    private String szfd;

    /** 外出情况 */
    @Excel(name = "外出情况")
    private Long wcqk;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 作业证名称 */
    @Excel(name = "作业证名称")
    private String zyzmc;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setXm(String xm)
    {
        this.xm = xm;
    }

    public String getXm()
    {
        return xm;
    }
    public void setNl(String nl)
    {
        this.nl = nl;
    }

    public String getNl()
    {
        return nl;
    }
    public void setXb(Long xb)
    {
        this.xb = xb;
    }

    public Long getXb()
    {
        return xb;
    }
    public void setZw(String zw)
    {
        this.zw = zw;
    }

    public String getZw()
    {
        return zw;
    }
    public void setSzfd(String szfd)
    {
        this.szfd = szfd;
    }

    public String getSzfd()
    {
        return szfd;
    }
    public void setWcqk(Long wcqk)
    {
        this.wcqk = wcqk;
    }

    public Long getWcqk()
    {
        return wcqk;
    }
    public void setLxfs(String lxfs)
    {
        this.lxfs = lxfs;
    }

    public String getLxfs()
    {
        return lxfs;
    }
    public void setZyzmc(String zyzmc)
    {
        this.zyzmc = zyzmc;
    }

    public String getZyzmc()
    {
        return zyzmc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("nl", getNl())
            .append("xb", getXb())
            .append("zw", getZw())
            .append("szfd", getSzfd())
            .append("wcqk", getWcqk())
            .append("lxfs", getLxfs())
            .append("zyzmc", getZyzmc())
            .toString();
    }
}
