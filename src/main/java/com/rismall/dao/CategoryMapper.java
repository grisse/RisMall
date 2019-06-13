package com.rismall.dao;

import java.util.List;

import com.rismall.pojo.Category;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_category
     *
     * @mbggenerated Sun May 26 18:11:50 CST 2019
     */
    int updateByPrimaryKey(Category record);
    
    List<Category> selectCategoryChildrenByParentId(Integer parentId);
}