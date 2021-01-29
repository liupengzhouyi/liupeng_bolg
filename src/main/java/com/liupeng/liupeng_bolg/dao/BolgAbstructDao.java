package com.liupeng.liupeng_bolg.dao;

import com.liupeng.liupeng_bolg.entity.BolgAbstruct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 博客概要(BolgAbstruct)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-29 20:26:25
 */
@Mapper
public interface BolgAbstructDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BolgAbstruct queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BolgAbstruct> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<BolgAbstruct> queryAll();

    /**
     * 新增数据
     *
     * @param bolgAbstruct 实例对象
     * @return 影响行数
     */
    int insert(BolgAbstruct bolgAbstruct);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BolgAbstruct> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BolgAbstruct> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BolgAbstruct> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<BolgAbstruct> entities);

    /**
     * 修改数据
     *
     * @param bolgAbstruct 实例对象
     * @return 影响行数
     */
    int update(BolgAbstruct bolgAbstruct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}