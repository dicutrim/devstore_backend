package com.portfolio.devstore_backend.services.impl;

import com.portfolio.devstore_backend.mapper.ProductMapper;
import com.portfolio.devstore_backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.devstore_backend.dto.ProductDTO;
import com.portfolio.devstore_backend.services.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ProductDTO> getAll() {
        return productRepository
                .findAll()
                .stream()
                .map(ProductMapper::fromEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO getOne(Long id) {
        return null;
    }

    @Override
    public ProductDTO insert(ProductDTO dto) {
        return null;
    }

    @Override
    public ProductDTO update(Long id, ProductDTO dto) {
        return null;
    }
}
