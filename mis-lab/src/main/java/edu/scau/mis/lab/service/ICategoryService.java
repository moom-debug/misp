package edu.scau.mis.lab.service;

import edu.scau.mis.lab.entity.LabCategory;

import java.util.List;

/**
 * (Type)表服务接口
 */
public interface ICategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param categoryId 主键
     * @return 实例对象
     */
    LabCategory queryById(Integer categoryId);

    /**
     * 查询指定行数据
     *
     * @param labCategory 筛选条件
     * @return 查询结果
     */
    List<LabCategory> queryAll(LabCategory labCategory);

    /**
     * 新增数据
     *
     * @param labCategory 实例对象
     * @return 实例对象
     */
    void insert(LabCategory labCategory);

    /**
     * 修改数据
     *
     * @param labCategory 实例对象
     * @return 实例对象
     */
    void update(LabCategory labCategory);

    /**
     * 通过主键删除数据
     *
     * @param CategoryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer CategoryId);

}