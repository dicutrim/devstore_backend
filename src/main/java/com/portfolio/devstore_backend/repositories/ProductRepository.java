package com.portfolio.devstore_backend.repositories;

import org.springframework.stereotype.Repository;
import com.portfolio.devstore_backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
