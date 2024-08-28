package com.PetShopAPI.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDomainDTO {

    private Integer categoryId;
    private String categoryName;
    private String description;
}
