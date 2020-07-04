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
    }

    public void activity(Animal animal, Activity activity){
        System.out.println(this.name+" just did the following activity with "+animal.getName()+":"+" "+activity.getName()+".");
    }
}
