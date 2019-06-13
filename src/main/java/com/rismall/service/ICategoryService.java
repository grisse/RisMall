package com.rismall.service;

import java.util.List;

import com.rismall.common.ServerResponse;
import com.rismall.pojo.Category;

public interface ICategoryService {
	ServerResponse addCategory(String categoryName,Integer parentId);
	ServerResponse updateCategoryName(Integer categoryId,String categoryName);
	ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
	ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
