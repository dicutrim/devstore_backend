package com.portfolio.devstore_backend.entities;

import lombok.*;
import jakarta.persistence.*;

import java.util.Set;
import java.io.Serial;
import java.util.List;
import java.util.HashSet;
import java.io.Serializable;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Double price;

    @Column(name = "image_url")
    private String imgUrl;

    @Setter(AccessLevel.NONE)
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private Set<Category> categories = new HashSet<>();

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "id.product")
    private Set<OrderItem> orderItems = new HashSet<>();

    private List<Order> getOrders() {
        return orderItems.stream().map(OrderItem::getOrder).collect(Collectors.toList());
    }
}
