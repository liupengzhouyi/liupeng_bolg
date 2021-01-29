package com.liupeng.liupeng_bolg.service.impl;

import com.liupeng.liupeng_bolg.dao.BolgAbstructDao;
import com.liupeng.liupeng_bolg.entity.BolgAbstruct;
import com.liupeng.liupeng_bolg.service.BolgAbstructService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客概要(BolgAbstruct)表服务实现类
 *
 * @author liupeng
 * @since 2021-01-29 20:26:28
 */
@Service("bolgAbstructService")
public class BolgAbstructServiceImpl implements BolgAbstructService {
    @Resource
    private BolgAbstructDao bolgAbstructDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BolgAbstruct queryById(Integer id) {
        return this.bolgAbstructDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BolgAbstruct> queryAllByLimit(int offset, int limit) {
        return this.bolgAbstructDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<BolgAbstruct> queryAll() {
        return this.bolgAbstructDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param bolgAbstruct 实例对象
     * @return 实例对象
     */
    @Override
    public BolgAbstruct insert(BolgAbstruct bolgAbstruct) {
        this.bolgAbstructDao.insert(bolgAbstruct);
        return bolgAbstruct;
    }

    /**
     * 修改数据
     *
     * @param bolgAbstruct 实例对象
     * @return 实例对象
     */
    @Override
    public BolgAbstruct update(BolgAbstruct bolgAbstruct) {
        this.bolgAbstructDao.update(bolgAbstruct);
        return this.queryById(bolgAbstruct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bolgAbstructDao.deleteById(id) > 0;
    }
}