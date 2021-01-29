package com.liupeng.liupeng_bolg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客概要(BolgAbstruct)实体类
 *
 * @author liupeng
 * @since 2021-01-29 20:26:22
 */
@ApiModel(value = "BolgAbstruct")
public class BolgAbstruct implements Serializable {
    private static final long serialVersionUID = -99313769940317058L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 博客名称
     */
    @ApiModelProperty(value = "博客名称", notes = "博客名称")
    private String blogName;
    /**
     * 博客类型1
     */
    @ApiModelProperty(value = "博客类型1", notes = "博客类型1")
    private Integer blogType1;
    /**
     * 博客类型2
     */
    @ApiModelProperty(value = "博客类型2", notes = "博客类型2")
    private Integer blogType2;
    /**
     * 博客类型3
     */
    @ApiModelProperty(value = "博客类型3", notes = "博客类型3")
    private Integer blogType3;
    /**
     * 博客类型4
     */
    @ApiModelProperty(value = "博客类型4", notes = "博客类型4")
    private Integer blogType4;
    /**
     * 博客类型5
     */
    @ApiModelProperty(value = "博客类型5", notes = "博客类型5")
    private Integer blogType5;
    /**
     * 添加日期
     */
    @ApiModelProperty(value = "添加日期", notes = "添加日期")
    private Date addDate;
    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除", notes = "是否删除")
    private Integer isDelete;
    /**
     * 删除时间
     */
    @ApiModelProperty(value = "删除时间", notes = "删除时间")
    private Date delDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Integer getBlogType1() {
        return blogType1;
    }

    public void setBlogType1(Integer blogType1) {
        this.blogType1 = blogType1;
    }

    public Integer getBlogType2() {
        return blogType2;
    }

    public void setBlogType2(Integer blogType2) {
        this.blogType2 = blogType2;
    }

    public Integer getBlogType3() {
        return blogType3;
    }

    public void setBlogType3(Integer blogType3) {
        this.blogType3 = blogType3;
    }

    public Integer getBlogType4() {
        return blogType4;
    }

    public void setBlogType4(Integer blogType4) {
        this.blogType4 = blogType4;
    }

    public Integer getBlogType5() {
        return blogType5;
    }

    public void setBlogType5(Integer blogType5) {
        this.blogType5 = blogType5;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

}