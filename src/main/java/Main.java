import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for(Animal animal : Animal.values()) {
            animal.addNum(10);
            System.out.println(animal);
        }

        Random random = new Random();
        int randomIndex = random.nextInt(Animal.values().length);
        Animal randomAnimal = Animal.values()[randomIndex];
        System.out.println(randomAnimal.getNum());
    }
}
