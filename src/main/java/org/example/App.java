package org.example;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Dog dog =new Dog();
        dog.setName("Rex");
        dog.setAge(5);
        dog.setHealth(9);
        dog.setHunger(4);
        dog.setSpirit(8);
        dog.setFavFood("Biscuit");
        dog.setFavActivity("Fetch");
        dog.setBreed("Husky");
        dog.setHasTail(true);
        dog.setNoisy(false);
        dog.setColor("Grey");
        dog.setHowlsAtMoon(false);
        dog.setBarkIntensity(5);

        Horse horse =new Horse();
        horse.setName("Thunder");
        horse.setAge(15);
        horse.setHealth(8);
        horse.setHunger(7);
        horse.setSpirit(9);
        horse.setFavFood("Carrot");
        horse.setFavActivity("Gallop");
        horse.setBreed("Frisian");
        horse.setHasTail(true);
        horse.setNoisy(true);
        horse.setColor("Black");
        horse.setHoovesClean(true);
        horse.setManeLength("Long");
        horse.setTailLength("Medium");
        horse.setRidingCompetitions(3);
        horse.setBraidedMane(false);

        Adopter person1=new Adopter();
        person1.setName("Maria");
        person1.setMoney(300);
        person1.setAge(40);
        person1.setFamilyMembers(3);
        person1.setHasYard(true);
        person1.setAddress("Queensland");


        Food food =new Food("Chow");
        food.setPrice(5);
        food.setStock(true);
        food.setQuantity(10);
        food.setExpDate(new Date(02,03,2021));


        Food veggies =new Food("Carrots");
        veggies.setPrice(3);
        veggies.setQuantity(20);
        veggies.setStock(true);
        veggies.setExpDate(new Date(07,07,2020));

        Vet vet=new Vet();
        vet.setName("Jody");
        vet.setAge(45);
        vet.setSpecilization("Small Animals");
        vet.setHasPractice(true);
        vet.setYearsExperience(20);

        Vet secVet=new Vet();
        secVet.setName("Julie");
        secVet.setAge(35);
        secVet.setYearsExperience(10);
        secVet.setHasPractice(true);
        secVet.setSpecilization("Horses");

        Toy toy=new Toy();
        toy.setName("Ball");
        toy.setPrice(5);
        toy.setColor("Red");
        toy.setSqueaks(false);
        toy.setBouncy(true);

        Toy saddle=new Toy();
        saddle.setName("English Saddle");
        saddle.setPrice(300);
        saddle.setColor("Brown");
        saddle.setSqueaks(false);
        saddle.setBouncy(false);

        Activity activity =new Activity("Fetch");
        activity.setDuration(30);
        activity.setOutside(true);
        activity.setToyNeeded(true);
        activity.setPlayToy(toy);

        Activity riding =new Activity("Gallop");
        riding.setToyNeeded(true);
        riding.setOutside(true);
        riding.setDuration(120);
        riding.setPlayToy(saddle);

        CareSupplies brush= new CareSupplies();
        brush.setName("Brush");
        brush.setPrice(10);
        brush.setPurpose("Grooming");
        brush.setQuantity(5);
        brush.setStoreName("Pets4ever");

        CareSupplies shampoo=new CareSupplies();
        shampoo.setName("Petshampoo");
        shampoo.setPrice(7);
        shampoo.setPurpose("Washing animal hair");
        shampoo.setQuantity(3);
        shampoo.setStoreName("Pets4ever");



        Game game=new Game();
        game.setAdopter(person1);
        game.setAnimal(dog);
        game.setVet(vet);


    }
}
