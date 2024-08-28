package com.PetShopAPI.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDomainDTO {

    private Integer productId;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Integer productStock;
    private Integer productCategoryId;
    private CategoryDomainDTO categoryDomainDTO;
}
