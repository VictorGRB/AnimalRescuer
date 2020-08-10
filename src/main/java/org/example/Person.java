package org.example;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed(Animal animal,Food food){
        System.out.println(this.name+" just gave "+animal.getName()+" "+food.getName()+" for eating.");
        int hungerLevel= animal.getHunger();
        hungerLevel--;
        animal.setHunger(hungerLevel);

        if(food.getName().equals(animal.getFavFood())){

            animal.setSpirit(animal.getSpirit()+1);
            System.out.println(animal.getName()+"'s "+"Hunger is at " +animal.getHunger());
        }
    }

    public void activity(Animal animal, Activity activity){
        System.out.println(this.name+" just did the following activity with "+animal.getName()+":"+" "+activity.getName()+".");

        int increment;
        if (activity.getName().equals(animal.getFavActivity()) ){
            increment =2;
        }
        else {
            increment =1;
        }
        animal.setSpirit(animal.getSpirit()+increment);

        System.out.println(animal.getName()+"'s "+"Spirit is at "+animal.getSpirit());

    }
}
