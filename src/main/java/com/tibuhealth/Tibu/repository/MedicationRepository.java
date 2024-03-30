package com.tibuhealth.Tibu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Medication extends JpaRepository<com.tibuhealth.Tibu.model.Medication,Long> {
    //Accepts all crud databases
}
