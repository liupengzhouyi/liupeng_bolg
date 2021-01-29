package com.liupeng.liupeng_bolg.service;

import com.liupeng.liupeng_bolg.entity.BlogInformation;

import java.util.List;

/**
 * 博客内容(BlogInformation)表服务接口
 *
 * @author liupeng
 * @since 2021-01-29 20:32:31
 */
public interface BlogInformationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BlogInformation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BlogInformation> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<BlogInformation> queryAll();

    /**
     * 新增数据
     *
     * @param blogInformation 实例对象
     * @return 实例对象
     */
    BlogInformation insert(BlogInformation blogInformation);

    /**
     * 修改数据
     *
     * @param blogInformation 实例对象
     * @return 实例对象
     */
    BlogInformation update(BlogInformation blogInformation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}