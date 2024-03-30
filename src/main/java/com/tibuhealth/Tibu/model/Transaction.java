package com.tibuhealth.Tibu.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transaction_id;
    private Integer order_id;

    @Column(name = "transaction_date")
    private Date transaction_date;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "payment_status")
    private String payment_status;
}
