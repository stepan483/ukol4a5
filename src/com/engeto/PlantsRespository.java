package com.engeto;

import java.util.List;



public class PlantsRespository {

    public PlantsRespository(List<Plant> plants) {
        this.plants = plants;
    }

    public Plant getPlantOnIndex(Integer index)
    {
        return plants.get(index);
    }
    public void addPlant(Plant plant)
    {
        plants.add(plant);
    }
    public void removePlant(Plant plant)
    {
        plants.remove(plant);
    }


    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    private List<Plant> plants;
}
