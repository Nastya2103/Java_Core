import java.sql.SQLOutput;
import java.util.*;

public class HomeWork4_1 {
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Tiger", "Lion", "Fox", "Wolf", "Bear", "Chicken", "Penguin", "Panther", "Rabbit", "Bear", "Fox", "Tiger", "Snake", "Dog"};

        Set<String> uniqueAnimal = new HashSet<>(Arrays.asList(animals));
        System.out.println(uniqueAnimal + "\n");

        Map<String, Integer> animalMap = new HashMap<>();

/*        for (int i = 0; i < animals.length; i++) {
            if (animalMap.containsKey(animals[i]))
                animalMap.put(animals[i], animalMap.get(animals[i]) + 1);
            else
                animalMap.put(animals[i], 1);
        }
        System.out.println(animalMap + "\n")*/;

        for (String animal : animals) {
            animalMap.put(animal, animalMap.getOrDefault(animal, 0) + 1);
        }
        System.out.println(animalMap + "\n");
    }
}