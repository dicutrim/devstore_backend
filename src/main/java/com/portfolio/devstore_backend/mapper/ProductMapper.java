package com.portfolio.devstore_backend.mapper;

import com.portfolio.devstore_backend.dto.ProductDTO;
import com.portfolio.devstore_backend.entities.Product;

public class ProductMapper {

    public static ProductDTO fromEntityToDto(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .imgUrl(product.getImgUrl())
                .build();
    }

    public static Product fromDtoToEntity(ProductDTO dto) {
        return Product.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .imgUrl(dto.getImgUrl())
                .build();
    }
}
