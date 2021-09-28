package edu.scau.mis.lab.mapper;

import edu.scau.mis.lab.entity.LabCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (LabCategory)表数据库访问层
 */
@Mapper
@Repository

public interface CategoryMapper {/**
 * 通过ID查询单条数据
 *
 * @param categoryId 主键
 * @return 实例对象
 */
LabCategory queryById(Integer categoryId);

    /**
     * 查询指定行数据
     *
     * @param labCategory 查询条件
     * @return 对象列表
     */
    List<LabCategory> queryAll(LabCategory labCategory);

    /**
     * 统计总行数
     *
     * @param labCategory 查询条件
     * @return 总行数
     */
    long count(LabCategory labCategory);

    /**
     * 新增数据
     *
     * @param labCategory 实例对象
     * @return 影响行数
     */
    int insert(LabCategory labCategory);


    /**
     * 修改数据
     *
     * @param labCategory 实例对象
     * @return 影响行数
     */
    int update(LabCategory labCategory);

    /**
     * 通过主键删除数据
     *
     * @param categoryId 主键
     * @return 影响行数
     */
    int deleteById(Integer categoryId);
}
