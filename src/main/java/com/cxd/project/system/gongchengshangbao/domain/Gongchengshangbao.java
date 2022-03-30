package com.cxd.project.system.gongchengshangbao.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 工程上报信息对象 gongchengshangbao
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Gongchengshangbao extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 施工队编号 */
    @Excel(name = "施工队编号")
    private String sgdbh;

    /** 施工人员 */
    @Excel(name = "施工人员")
    private String sgry;

    /** 现场情况是否良好 */
    @Excel(name = "现场情况是否良好")
    private Long xcqk;

    /** 现场照片 */
    private String xczp;

    /** 电缆长度 */
    @Excel(name = "电缆长度")
    private String dlcd;

    /** 起止位置 */
    @Excel(name = "起止位置")
    private String qswz;

    /** 抢修时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "抢修时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qxsj;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setSgdbh(String sgdbh)
    {
        this.sgdbh = sgdbh;
    }

    public String getSgdbh()
    {
        return sgdbh;
    }
    public void setSgry(String sgry)
    {
        this.sgry = sgry;
    }

    public String getSgry()
    {
        return sgry;
    }
    public void setXcqk(Long xcqk)
    {
        this.xcqk = xcqk;
    }

    public Long getXcqk()
    {
        return xcqk;
    }
    public void setXczp(String xczp)
    {
        this.xczp = xczp;
    }

    public String getXczp()
    {
        return xczp;
    }
    public void setDlcd(String dlcd)
    {
        this.dlcd = dlcd;
    }

    public String getDlcd()
    {
        return dlcd;
    }
    public void setQswz(String qswz)
    {
        this.qswz = qswz;
    }

    public String getQswz()
    {
        return qswz;
    }
    public void setQxsj(Date qxsj)
    {
        this.qxsj = qxsj;
    }

    public Date getQxsj()
    {
        return qxsj;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sgdbh", getSgdbh())
            .append("sgry", getSgry())
            .append("xcqk", getXcqk())
            .append("xczp", getXczp())
            .append("dlcd", getDlcd())
            .append("qswz", getQswz())
            .append("qxsj", getQxsj())
            .toString();
    }
}
