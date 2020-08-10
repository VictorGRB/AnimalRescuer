package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Vet vet;
    private List<Food> availableFood=new ArrayList<>();
    private Activity [] availableActivities =new Activity[5];
    private static final int MAX_LEVEL = 10;
    private static final int MIN_LEVEL = 7;
    private static final int MAX_ITERATIONS = 20;

    private void initFood(){
        Food dogFood=new Food("Chow");
        Food dogFood2=new Food("Bone");
        Food horseFood=new Food("Carrots");
        Food horseFood2=new Food("Hay");
        availableFood.add(dogFood);
        availableFood.add(dogFood2);
        availableFood.add(horseFood);
        availableFood.add(horseFood2);
    }

    private void initActivity(){
        Activity activity1 = new Activity("Fetch");
        Activity activity2 = new Activity("Chase squirrel");
        Activity activity3 = new Activity("Trot");
        Activity activity4 = new Activity("Gallop");
        availableActivities[0]=activity1;
        availableActivities[1]=activity2;
        availableActivities[2]=activity3;
        availableActivities[3]=activity4;


    }
    private void initAnimal() {
        animal = new Dog();
        animal.setAge(1);
        animal.setFavActivity("Running");
        animal.setFavFood("Purina");
        animal.setHunger(MAX_LEVEL - 1);
        animal.setSpirit(1);
    }
    private void initRescuer() {
        adopter = new Adopter();
        adopter.setMoney(100);
        adopter.setName(readRescuerName());
    }
    private String readRescuerName() {
        System.out.println("Please type your name and press Enter.");

        Scanner scanner = new Scanner(System.in);
        String rescuerName = scanner.nextLine();

        System.out.println("Welcome,  " + rescuerName);
        System.out.println("***********");

        return rescuerName;
    }
    private String readActivityName() {
        System.out.println("Please select activity...");

        Scanner scanner = new Scanner(System.in);
        String activityName = scanner.nextLine();

        System.out.println("Selected:  " + activityName);

        List<String> availableActivityNames = new ArrayList<>();

        for (Activity activity : availableActivities) {
            if (activity != null) {
                availableActivityNames.add(activity.getName());
            }
        }

        if (!availableActivityNames.contains(activityName)) {
            System.out.println(activityName + " is not available as an activity in this game.");
            return readActivityName();
        }

        System.out.println("***********");

        return activityName;
    }
    private void displayAvailableFood() {
        System.out.println("Available food:");
        for (Food food : availableFood) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }
    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }}
    private void requireActivity() throws Exception {
        System.out.println(animal.getName() + "'s happiness level is: " + animal.getSpirit() + ". Please select entertainment activity.");

        displayAvailableActivities();

        String activityName = readActivityName();

        Activity activity = new Activity(activityName);

        adopter.activity(animal, activity);

        System.out.println("***********");
    }

    private String readFoodName() {
        System.out.println("Please select food...");

        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();

        System.out.println("Selected:  " + foodName);

        List<String> availableFoodNames = new ArrayList<>();

        for (Food food : availableFood) {
            availableFoodNames.add(food.getName());
        }

        if (!availableFoodNames.contains(foodName)) {
            System.out.println(foodName + " is not available as a food type in this game.");
            return readFoodName();
        }

        System.out.println("***********");

        return foodName;
    }
    private void requireFeeding() throws Exception {
        System.out.println(animal.getName() + "'s hunger level is: " + animal.getHunger() + ". Please select food.");

        displayAvailableFood();

        String foodName = readFoodName();
        Food food = new Food(foodName);

        adopter.feed(animal, food);

        System.out.println("***********");
    }

    private void nameAnimal() {
        System.out.println("Please give a name for your rescued pet...");

        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        System.out.println(animalName + " says thanks.");
        System.out.println("***********");
    }

    /*public void start() {
        initFood();
        initActivity();

        displayAvailableFood();
        displayAvailableActivities();
    }

    private void displayAvailableFood() {
        System.out.println("Available food:");
        for (Food food : availableFood) {
            if (food != null) {
                System.out.println(food.getName());
            }
        }
    }

    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }}


    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }*/

    public void start() throws Exception {
        initAnimal();
        initActivity();
        initFood();
        initRescuer();

        nameAnimal();

        for (int i = 1; i <= MAX_ITERATIONS; i++) {
            requireActivity();
            requireFeeding();

            if (i % 3 == 0) {
                animal.setHunger(animal.getHunger() + 1);
                animal.setSpirit(animal.getSpirit() - 1);
                System.out.println("***********");
                System.out.println(animal.getName() + " is getting hungry and bored.");
                System.out.println("Hunger level: " + animal.getHunger());
                System.out.println("Happiness level: " + animal.getSpirit());
                System.out.println("***********");
            }

            if (i == MAX_ITERATIONS) {
                if (MIN_LEVEL < animal.getHunger()) {
                    throw new RuntimeException("Game over. " + animal.getName() + " is too poorly fed.");
                }

                if (MIN_LEVEL < animal.getSpirit()) {
                    throw new RuntimeException("Game over. " + animal.getName() + " is too poorly entertained.");
                }

                System.out.println("Congratulations! " + animal.getName() + " has been fed and entertained well enough.");
            }
        }

}}
