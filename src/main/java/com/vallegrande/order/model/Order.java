package com.vallegrande.order.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "venta")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",length = 50, nullable = false)
    private String name;

    @Column(name = "amount",length = 50, nullable = false)
    private String amount;

    @Column(name = "subtotal",length = 50, nullable = false)
    private String subtotal;

}
