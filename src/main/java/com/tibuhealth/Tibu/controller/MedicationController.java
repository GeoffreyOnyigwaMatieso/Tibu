package com.tibuhealth.Tibu.controller;

import com.tibuhealth.Tibu.exception.ResourceNotFoundException;
import com.tibuhealth.Tibu.model.Medication;
import com.tibuhealth.Tibu.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @RequestMapping("/api/v1/medication")
    public List<Medication> getAllMedication(){return medicationService.getAllMedication();}

    @PostMapping("/api/v1/medications")
    public Medication addMedication(@RequestBody Medication medication){
        return medicationService.addMedication(medication);
    }

    //build updated medication REST API
    @PutMapping("{id}")
    public ResponseEntity<Medication> updateMedication(@PathVariable long id, @RequestBody Medication medicationdetails){
        try{
            medicationService.updateMedication(id,medicationdetails);

            return ResponseEntity.ok(medicationdetails);
        } catch (ResourceNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    // build delete Medication REST API
    @DeleteMapping("{id}")
    public  ResponseEntity<HttpEntity> deletedMedication(@PathVariable Medication id){
        Medication medication = medicationService.deleteMedication(id);
        //delete medication details from the database
        medicationService.deleteMedication(medication);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
