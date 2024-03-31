package com.tibuhealth.Tibu.model;

import jakarta.persistence.*;

import java.util.Date;


@Table(name = "Transaction")
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaction_id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

    @Column(name = "transaction_date")
    private Date transaction_date;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "payment_status")
    private String payment_status;
}
