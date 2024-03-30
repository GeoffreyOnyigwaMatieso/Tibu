package com.tibuhealth.Tibu.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer extends JpaRepository<com.tibuhealth.Tibu.model.Customer,Long> {
    //Accepts All Crud database method
}
