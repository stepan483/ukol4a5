package com.engeto;

import java.time.LocalDate;

public class Plant {

    // ukol 1

    private String name;
    private String notes;
    private LocalDate planted;
    private LocalDate Watering;
    private Integer frequenceOfWateringInDays;

    // ukol 2

    public Plant(String name, String notes,Integer frequenceOfWatering, LocalDate watering,  LocalDate planted) {
        this.name = name;
        if(String.valueOf(notes).isEmpty()) {
            this.notes = " ";
        }
        else
        {
            this.notes = notes;
        }
        this.planted = planted;
        this.Watering = watering;
        this.frequenceOfWateringInDays = frequenceOfWatering;
    }

    public Plant(String name) {
        this.name = name;
        this.notes = " ";
        this.Watering = LocalDate.now();
        this.planted = LocalDate.now();
        this.frequenceOfWateringInDays = 7;
    }

    public Plant(String name, LocalDate planted, Integer frequenceOfWatering) {
        this.name = name;
        this.planted = planted;
        this.notes = " ";
        this.Watering = LocalDate.now();
        this.frequenceOfWateringInDays = frequenceOfWatering;
    }
}
