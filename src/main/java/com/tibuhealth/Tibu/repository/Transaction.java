package com.tibuhealth.Tibu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Transaction extends JpaRepository<com.tibuhealth.Tibu.model.Transaction,Long> {
    //Accepts all crud database methods
}
