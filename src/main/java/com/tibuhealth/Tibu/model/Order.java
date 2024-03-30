package com.tibuhealth.Tibu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer order_id;

    private Integer customer_id;

    @Column(name = "order_date")
    private Integer order_date;

    @Column(name = "status")
    private String status;
}
