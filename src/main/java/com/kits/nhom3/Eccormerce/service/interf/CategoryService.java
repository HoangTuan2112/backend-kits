package com.kits.nhom3.Eccormerce.service.interf;

import com.kits.nhom3.Eccormerce.dto.CategoryDto;
import com.kits.nhom3.Eccormerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
