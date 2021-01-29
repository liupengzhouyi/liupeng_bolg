package com.liupeng.liupeng_bolg.service.impl;

import com.liupeng.liupeng_bolg.dao.BlogTypesDao;
import com.liupeng.liupeng_bolg.entity.BlogTypes;
import com.liupeng.liupeng_bolg.service.BlogTypesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客类型(BlogTypes)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 18:33:08
 */
@Service("blogTypesService")
public class BlogTypesServiceImpl implements BlogTypesService {
    @Resource
    private BlogTypesDao blogTypesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BlogTypes queryById(Integer id) {
        return this.blogTypesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogTypes> queryAllByLimit(int offset, int limit) {
        return this.blogTypesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogTypes 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTypes insert(BlogTypes blogTypes) {
        this.blogTypesDao.insert(blogTypes);
        return blogTypes;
    }

    /**
     * 修改数据
     *
     * @param blogTypes 实例对象
     * @return 实例对象
     */
    @Override
    public BlogTypes update(BlogTypes blogTypes) {
        this.blogTypesDao.update(blogTypes);
        return this.queryById(blogTypes.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.blogTypesDao.deleteById(id) > 0;
    }
}