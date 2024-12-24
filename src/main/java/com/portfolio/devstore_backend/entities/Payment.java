package com.portfolio.devstore_backend.entities;

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
@Table(name = "tb_payment")
public class Payment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "moment", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant instant;

    @MapsId
    @OneToOne
    private Order order;
}
