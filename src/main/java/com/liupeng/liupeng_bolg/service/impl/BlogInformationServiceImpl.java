package com.liupeng.liupeng_bolg.service.impl;

import com.liupeng.liupeng_bolg.dao.BlogInformationDao;
import com.liupeng.liupeng_bolg.entity.BlogInformation;
import com.liupeng.liupeng_bolg.service.BlogInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客内容(BlogInformation)表服务实现类
 *
 * @author liupeng
 * @since 2021-01-29 20:32:32
 */
@Service("blogInformationService")
public class BlogInformationServiceImpl implements BlogInformationService {
    @Resource
    private BlogInformationDao blogInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BlogInformation queryById(Integer id) {
        return this.blogInformationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogInformation> queryAllByLimit(int offset, int limit) {
        return this.blogInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<BlogInformation> queryAll() {
        return this.blogInformationDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param blogInformation 实例对象
     * @return 实例对象
     */
    @Override
    public BlogInformation insert(BlogInformation blogInformation) {
        this.blogInformationDao.insert(blogInformation);
        return blogInformation;
    }

    /**
     * 修改数据
     *
     * @param blogInformation 实例对象
     * @return 实例对象
     */
    @Override
    public BlogInformation update(BlogInformation blogInformation) {
        this.blogInformationDao.update(blogInformation);
        return this.queryById(blogInformation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.blogInformationDao.deleteById(id) > 0;
    }
}