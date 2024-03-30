package com.tibuhealth.Tibu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Order extends JpaRepository<com.tibuhealth.Tibu.model.Order,Long> {
    //Accepts all crud databases method
}
