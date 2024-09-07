package com.PetShopAPI.domain;

import lombok.Data;

@Data
public class Product {

    private int productId;

    private String name;

    private String description;

    private double price;

    private int stock;

    private int categoryId;

    private Category category;
}
