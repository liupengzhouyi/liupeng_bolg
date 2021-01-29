package com.liupeng.liupeng_bolg.service;

import com.liupeng.liupeng_bolg.entity.BlogTypes;

import java.util.List;

/**
 * 博客类型(BlogTypes)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 18:33:05
 */
public interface BlogTypesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BlogTypes queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BlogTypes> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogTypes 实例对象
     * @return 实例对象
     */
    BlogTypes insert(BlogTypes blogTypes);

    /**
     * 修改数据
     *
     * @param blogTypes 实例对象
     * @return 实例对象
     */
    BlogTypes update(BlogTypes blogTypes);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}