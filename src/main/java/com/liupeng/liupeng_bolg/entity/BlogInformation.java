package com.liupeng.liupeng_bolg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 博客内容(BlogInformation)实体类
 *
 * @author liupeng
 * @since 2021-01-29 20:32:27
 */
@ApiModel(value = "BlogInformation")
public class BlogInformation implements Serializable {
    private static final long serialVersionUID = -48928764787934714L;
    /**
     * 自增ID
     */
    @ApiModelProperty(value = "自增ID", notes = "自增ID")
    private Integer id;
    /**
     * 博客ID
     */
    @ApiModelProperty(value = "博客ID", notes = "博客ID")
    private Integer blogId;
    /**
     * 博客内容（一行）
     */
    @ApiModelProperty(value = "博客内容（一行）", notes = "博客内容（一行）")
    private String information;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

}