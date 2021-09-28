package edu.scau.mis.lab.service.impl;

import edu.scau.mis.lab.entity.LabCategory;
import edu.scau.mis.lab.mapper.CategoryMapper;
import edu.scau.mis.lab.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (LabCategory)表服务实现类
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param categoryId 主键
     * @return 实例对象
     */
    @Override
    public LabCategory queryById(Integer categoryId) {
        return this.categoryMapper.queryById(categoryId);
    }

    /**
     * 查询指定行数据
     *
     * @param labCategory 筛选条件
     * @return 查询结果
     */
    @Override
    public List<LabCategory> queryAll(LabCategory labCategory) {
        return this.categoryMapper.queryAll(labCategory);
    }

    /**
     * 新增数据
     * @param labCategory 实例对象
     */
    @Override
    public void insert(LabCategory labCategory) {
        this.categoryMapper.insert(labCategory);
    }

    /**
     * 修改数据
     *
     * @param labCategory 实例对象
     */
    @Override
    public void update(LabCategory labCategory) {
        this.categoryMapper.update(labCategory);
    }

    /**
     * 通过主键删除数据
     *
     * @param categoryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer categoryId) {
        return this.categoryMapper.deleteById(categoryId) > 0;
    }
}