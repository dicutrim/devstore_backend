package com.portfolio.devstore_backend.services.impl;

import org.springframework.stereotype.Service;
import com.portfolio.devstore_backend.dto.ProductDTO;
import com.portfolio.devstore_backend.mapper.ProductMapper;
import com.portfolio.devstore_backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.portfolio.devstore_backend.repositories.ProductRepository;
import com.portfolio.devstore_backend.Exceptions.ResourceNotFoundException;

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
    @Transactional(readOnly = true)
    public List<ProductDTO> getAll() {
        return productRepository.findAll().stream().map(ProductMapper::fromEntityToDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTO getOne(Long id) {
        var productOpt = productRepository.findById(id);
        if (productOpt.isEmpty()) throw new ResourceNotFoundException("Resource not found");
        return ProductMapper.fromEntityToDto(productOpt.get());
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
