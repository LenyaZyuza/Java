package Homework.HW3;

import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();

        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Земля");
    
        for (String planet : planets) {
            int count = 0;
            for (String p : planets) {
                if (planet.equals(p)) {
                    count++;
                }
            }
            System.out.printf("%s - %d%n", planet, count);
        }
    }
}
