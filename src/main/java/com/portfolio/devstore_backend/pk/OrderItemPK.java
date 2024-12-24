package com.portfolio.devstore_backend.pk;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import com.portfolio.devstore_backend.entities.Order;
import com.portfolio.devstore_backend.entities.Product;

@Data
@NoArgsConstructor

@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
