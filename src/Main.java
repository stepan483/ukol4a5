import com.engeto.*;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();

        String fileToLoad = "kvetiny.txt";
        String fileToSave = "text2.txt";
        List<Plant> allPlants = fileUtils.importFromFile(new File(fileToLoad));

        // 13
        allPlants.forEach(plant -> {
            System.out.println(plant.getName() + " " + plant.getWatering());

        });
        // 14
        allPlants.add(new Plant("Moje kytka 2", "Balalbalblab",7, LocalDate.now(), LocalDate.now()));
        allPlants.add(new Plant("Moje kytka", " ", 6, LocalDate.now(), LocalDate.now()));

        allPlants.remove(0);
        // 15
        // 10.2
        fileUtils.exportToFile(allPlants, new File(fileToSave));

    }
}
