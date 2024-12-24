package com.portfolio.devstore_backend.services;

import com.portfolio.devstore_backend.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    void delete(Long id);

    List<ProductDTO> getAll();

    ProductDTO getOne(Long id);

    ProductDTO insert(ProductDTO dto);

    ProductDTO update(Long id, ProductDTO dto);
}
