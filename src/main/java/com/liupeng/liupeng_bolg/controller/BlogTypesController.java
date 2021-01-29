package com.liupeng.liupeng_bolg.controller;

import com.liupeng.liupeng_bolg.entity.BlogTypes;
import com.liupeng.liupeng_bolg.service.BlogTypesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客类型(BlogTypes)表控制层
 *
 * @author liupeng
 * @since 2021-01-29 19:49:28
 */
@Api(tags = {"管理"})
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
    @ApiOperation("查询一个")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogTypes selectOne(Integer id) {
        return this.blogTypesService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<BlogTypes> selectAll() {
        return this.blogTypesService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogTypes addOne(BlogTypes blogTypes) {
        return this.blogTypesService.insert(blogTypes);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(BlogTypes blogTypes) {
        return this.blogTypesService.deleteById(blogTypes.getId());
    }

    /**
     * 删除一条数据
     *
     * @return BlogTypes
     */
    @ApiOperation("更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogTypes update(BlogTypes blogTypes) {
        return this.blogTypesService.update(blogTypes);
    }


}