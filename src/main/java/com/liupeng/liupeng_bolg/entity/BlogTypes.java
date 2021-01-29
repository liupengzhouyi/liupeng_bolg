package com.liupeng.liupeng_bolg.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客类型(BlogTypes)实体类
 *
 * @author liupeng
 * @since 2021-01-29 19:17:36
 */
public class BlogTypes implements Serializable {
    private static final long serialVersionUID = -73776304772898885L;
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 添加日期
     */
    private Date addDate;
    /**
     * 删除日期
     */
    private Date delDate;
    /**
     * 是否删除
     */
    private Integer isDelete;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}