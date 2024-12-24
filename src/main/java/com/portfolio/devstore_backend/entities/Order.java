package com.portfolio.devstore_backend.entities;

import com.portfolio.devstore_backend.enums.OrderStatus;

import lombok.*;
import jakarta.persistence.*;

import java.util.Set;
import java.io.Serial;
import java.util.List;
import java.time.Instant;
import java.util.HashSet;
import java.io.Serializable;
import java.util.stream.Collectors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "moment", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant instant;

    @Column(name = "status")
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User user;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> orderItems = new HashSet<>();

    private List<Product> getProducts() {
        return orderItems.stream().map(OrderItem::getProduct).collect(Collectors.toList());
    }
}
