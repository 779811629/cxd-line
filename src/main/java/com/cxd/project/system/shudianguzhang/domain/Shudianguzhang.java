package com.cxd.project.system.shudianguzhang.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 输电故障信息对象 shudianguzhang
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Shudianguzhang extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 输送电故障区域 */
    @Excel(name = "输送电故障区域")
    private String ssdgzqy;

    /** 故障起止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "故障起止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gzqzsj;

    /** 故障原因 */
    @Excel(name = "故障原因")
    private String gzyy;

    /** 隶属变电站 */
    @Excel(name = "隶属变电站")
    private String ssbdz;

    /** 是否回复送电 */
    @Excel(name = "是否回复送电")
    private String sfhfsd;

    /** 检修人员签名 */
    @Excel(name = "检修人员签名")
    private String jxrrqm;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setSsdgzqy(String ssdgzqy)
    {
        this.ssdgzqy = ssdgzqy;
    }

    public String getSsdgzqy()
    {
        return ssdgzqy;
    }
    public void setGzqzsj(Date gzqzsj)
    {
        this.gzqzsj = gzqzsj;
    }

    public Date getGzqzsj()
    {
        return gzqzsj;
    }
    public void setGzyy(String gzyy)
    {
        this.gzyy = gzyy;
    }

    public String getGzyy()
    {
        return gzyy;
    }
    public void setSsbdz(String ssbdz)
    {
        this.ssbdz = ssbdz;
    }

    @Override
    public String toString() {
        return "Shudianguzhang{" +
                "id='" + id + '\'' +
                ", ssdgzqy='" + ssdgzqy + '\'' +
                ", gzqzsj=" + gzqzsj +
                ", gzyy='" + gzyy + '\'' +
                ", ssbdz='" + ssbdz + '\'' +
                ", sfhfsd='" + sfhfsd + '\'' +
                ", jxrrqm='" + jxrrqm + '\'' +
                '}';
    }

    public String getJxrrqm()
    {
        return jxrrqm;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSsbdz() {
        return ssbdz;
    }

    public String getSfhfsd() {
        return sfhfsd;
    }

    public void setSfhfsd(String sfhfsd) {
        this.sfhfsd = sfhfsd;
    }

    public void setJxrrqm(String jxrrqm) {
        this.jxrrqm = jxrrqm;
    }
}
