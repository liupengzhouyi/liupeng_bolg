package com.liupeng.liupeng_bolg.controller;

import com.liupeng.liupeng_bolg.entity.BlogInformation;
import com.liupeng.liupeng_bolg.service.BlogInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客内容(BlogInformation)表控制层
 *
 * @author liupeng
 * @since 2021-01-29 20:32:35
 */
@Api(tags = {"管理"})
@RestController
@RequestMapping("blogInformation")
public class BlogInformationController {
    /**
     * 服务对象
     */
    @Resource
    private BlogInformationService blogInformationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogInformation selectOne(Integer id) {
        return this.blogInformationService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<BlogInformation> selectAll() {
        return this.blogInformationService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogInformation addOne(BlogInformation blogInformation) {
        return this.blogInformationService.insert(blogInformation);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(BlogInformation blogInformation) {
        return this.blogInformationService.deleteById(blogInformation.getId());
    }

    /**
     * 删除一条数据
     *
     * @return BlogInformation
     */
    @ApiOperation("更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BlogInformation update(BlogInformation blogInformation) {
        return this.blogInformationService.update(blogInformation);
    }


}