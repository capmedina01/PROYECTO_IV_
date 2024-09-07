package com.PetShopAPI.domain.repository;

import com.PetShopAPI.domain.Category;

import java.util.List;

public interface CategoryDomainRepository {

    Category CreateCategory(Category category);
    Category UpdateCategory(Category category);
    Category DeleteCategory(Category category);
    List<Category> GetAllCategories();
}
