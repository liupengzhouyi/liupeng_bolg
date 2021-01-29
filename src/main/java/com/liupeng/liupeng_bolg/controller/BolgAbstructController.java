package com.liupeng.liupeng_bolg.controller;

import com.liupeng.liupeng_bolg.entity.BolgAbstruct;
import com.liupeng.liupeng_bolg.service.BolgAbstructService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客概要(BolgAbstruct)表控制层
 *
 * @author liupeng
 * @since 2021-01-29 20:26:30
 */
@Api(tags = {"管理"})
@RestController
@RequestMapping("bolgAbstruct")
public class BolgAbstructController {
    /**
     * 服务对象
     */
    @Resource
    private BolgAbstructService bolgAbstructService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询一个")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BolgAbstruct selectOne(Integer id) {
        return this.bolgAbstructService.queryById(id);
    }

    /**
     * 查询所有数据
     *
     * @return List
     */
    @ApiOperation("查询所有")
    @RequestMapping(path = "selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<BolgAbstruct> selectAll() {
        return this.bolgAbstructService.queryAll();
    }

    /**
     * 添加一条数据
     *
     * @return List
     */
    @ApiOperation("添加一个")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BolgAbstruct addOne(BolgAbstruct bolgAbstruct) {
        return this.bolgAbstructService.insert(bolgAbstruct);
    }

    /**
     * 删除一条数据
     *
     * @return boolean
     */
    @ApiOperation("删除一个")
    @RequestMapping(path = "delOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean delOne(BolgAbstruct bolgAbstruct) {
        return this.bolgAbstructService.deleteById(bolgAbstruct.getId());
    }

    /**
     * 删除一条数据
     *
     * @return BolgAbstruct
     */
    @ApiOperation("更新数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public BolgAbstruct update(BolgAbstruct bolgAbstruct) {
        return this.bolgAbstructService.update(bolgAbstruct);
    }


}