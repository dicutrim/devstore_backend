package com.portfolio.devstore_backend.entities;

import com.portfolio.devstore_backend.enums.OrderStatus;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serial;
import java.time.Instant;
import java.io.Serializable;

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
}
