package com.engeto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public List<Plant> importFromFile(File file)
    {
        List<Plant> plants = new ArrayList<>();
        // 10.1
        try {
            Files.readAllLines(file.toPath()).stream().forEach(line -> {
                String[] tokens = line.split("\t");
                if (tokens.length >= 5) { // Ensure there are enough tokens to avoid IndexOutOfBoundsException
                    Plant plant = new Plant(tokens[0]);
                    plant.setNotes(tokens[1]);
                    try {
                        plant.setFrequenceOfWateringInDays(Integer.valueOf(tokens[2]));
                    } catch (PlantException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        plant.setWatering(LocalDate.parse(tokens[3]));
                    } catch (PlantException e) {
                        throw new RuntimeException(e);
                    }
                    plant.setPlanted(LocalDate.parse(tokens[4]));

                    plants.add(plant);
                }
            });
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
         return plants;
    }
}
