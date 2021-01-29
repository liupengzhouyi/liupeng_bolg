package com.liupeng.liupeng_bolg.controller;

import com.liupeng.liupeng_bolg.entity.BlogTypes;
import com.liupeng.liupeng_bolg.service.BlogTypesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 博客类型(BlogTypes)表控制层
 *
 * @author makejava
 * @since 2021-01-29 18:33:41
 */
@RestController
@RequestMapping("blogTypes")
public class BlogTypesController {
    /**
     * 服务对象
     */
    @Resource
    private BlogTypesService blogTypesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BlogTypes selectOne(Integer id) {
        return this.blogTypesService.queryById(id);
    }

}