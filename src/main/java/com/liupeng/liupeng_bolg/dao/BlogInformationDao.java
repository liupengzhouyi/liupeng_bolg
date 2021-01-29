package com.liupeng.liupeng_bolg.dao;

import com.liupeng.liupeng_bolg.entity.BlogInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 博客内容(BlogInformation)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-29 20:32:29
 */
@Mapper
public interface BlogInformationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BlogInformation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BlogInformation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过所有
     *
     * @return 对象列表
     */
    List<BlogInformation> queryAll();

    /**
     * 新增数据
     *
     * @param blogInformation 实例对象
     * @return 影响行数
     */
    int insert(BlogInformation blogInformation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BlogInformation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BlogInformation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BlogInformation> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<BlogInformation> entities);

    /**
     * 修改数据
     *
     * @param blogInformation 实例对象
     * @return 影响行数
     */
    int update(BlogInformation blogInformation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}