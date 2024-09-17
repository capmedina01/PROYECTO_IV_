package com.PetShopAPI.domain.repository;

import com.PetShopAPI.domain.Category;

import java.util.List;

public interface CategoryDomainRepository {

    Category createCategory(Category category);
    Category updateCategory(Category category);
    Category deleteCategory(Category category);
    List<Category> getAllCategories();
}
