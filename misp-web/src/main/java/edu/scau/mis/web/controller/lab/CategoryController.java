package edu.scau.mis.web.controller.lab;


import edu.scau.mis.lab.entity.LabCategory;
import edu.scau.mis.lab.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (LabCategory)表控制层
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Autowired
    private ICategoryService categoryService;

    /**
     * 分页查询
     *
     * @param labCategory 筛选条件
     * @return 查询结果
     */
    @GetMapping("/list")
    public List<LabCategory> list(LabCategory labCategory) {
        return this.categoryService.queryAll(labCategory);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param categoryId 主键
     * @return 单条数据
     */
    @GetMapping("{categoryId}")
    public LabCategory getById(@PathVariable("categoryId") Integer categoryId) {
        return this.categoryService.queryById(categoryId);
    }

    /**
     * 新增数据
     *
     * @param labCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public String add(@RequestBody LabCategory labCategory) {
        this.categoryService.insert(labCategory);
        return "ok";
    }

    /**
     * 编辑数据
     * @param labCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public String edit(@RequestBody LabCategory labCategory) {
        this.categoryService.update(labCategory);
        return "ok";
    }

    /**
     * 删除数据
     *
     * @param categoryId 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/delete/{categoryId}")
    public Boolean deleteById(@PathVariable Integer categoryId) {
        return this.categoryService.deleteById(categoryId);
    }

}