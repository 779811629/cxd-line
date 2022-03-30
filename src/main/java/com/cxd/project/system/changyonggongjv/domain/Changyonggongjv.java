package com.cxd.project.system.changyonggongjv.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cxd.framework.aspectj.lang.annotation.Excel;
import com.cxd.framework.web.domain.BaseEntity;

/**
 * 常用工具信息对象 changyonggongjv
 * 
 * @author cxd
 * @date 2022-03-19
 */
public class Changyonggongjv extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 安全帽数量 */
    @Excel(name = "安全帽数量")
    private Long anmsl;

    /** 螺丝刀数量 */
    @Excel(name = "螺丝刀数量")
    private Long lsdsl;

    /** 绝缘鞋数量 */
    @Excel(name = "绝缘鞋数量")
    private Long jyxsl;

    /** 绝缘手套数量 */
    @Excel(name = "绝缘手套数量")
    private Long jyst;

    /** 测电器数量 */
    @Excel(name = "测电器数量")
    private Long cdq;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setAnmsl(Long anmsl)
    {
        this.anmsl = anmsl;
    }

    public Long getAnmsl()
    {
        return anmsl;
    }
    public void setLsdsl(Long lsdsl)
    {
        this.lsdsl = lsdsl;
    }

    public Long getLsdsl()
    {
        return lsdsl;
    }
    public void setJyxsl(Long jyxsl)
    {
        this.jyxsl = jyxsl;
    }

    public Long getJyxsl()
    {
        return jyxsl;
    }
    public void setJyst(Long jyst)
    {
        this.jyst = jyst;
    }

    public Long getJyst()
    {
        return jyst;
    }
    public void setCdq(Long cdq)
    {
        this.cdq = cdq;
    }

    public Long getCdq()
    {
        return cdq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("anmsl", getAnmsl())
            .append("lsdsl", getLsdsl())
            .append("jyxsl", getJyxsl())
            .append("jyst", getJyst())
            .append("cdq", getCdq())
            .toString();
    }
}
