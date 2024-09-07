package com.PetShopAPI.domain;

import lombok.Data;

@Data
public class Category {
    private int categoryId;
    private String categoryName;
    private String categoryDescription;
}
