package com.liupeng.liupeng_bolg.service;

import com.liupeng.liupeng_bolg.entity.BolgAbstruct;

import java.util.List;

/**
 * 博客概要(BolgAbstruct)表服务接口
 *
 * @author liupeng
 * @since 2021-01-29 20:26:27
 */
public interface BolgAbstructService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BolgAbstruct queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BolgAbstruct> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    List<BolgAbstruct> queryAll();

    /**
     * 新增数据
     *
     * @param bolgAbstruct 实例对象
     * @return 实例对象
     */
    BolgAbstruct insert(BolgAbstruct bolgAbstruct);

    /**
     * 修改数据
     *
     * @param bolgAbstruct 实例对象
     * @return 实例对象
     */
    BolgAbstruct update(BolgAbstruct bolgAbstruct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}