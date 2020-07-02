package org.example;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        Animal dog =new Animal();
        dog.name = "Rex";
        dog.age=5;
        dog.health=9;
        dog.hunger=4;
        dog.spirit=8;
        dog.favFood = "Biscuit";
        dog.favActivity="Fetch";
        dog.breed="Husky";
        dog.hasTail=true;
        dog.noisy=false;
        dog.color="Grey";

        Animal horse =new Animal();
        horse.name = "Thunder";
        horse.age=15;
        horse.health=8;
        horse.hunger=7;
        horse.spirit=9;
        horse.favFood = "Carrot";
        horse.favActivity="Gallop";
        horse.breed="Frisian";
        horse.hasTail=true;
        horse.noisy=true;
        horse.color="Black";

        Adopter person1=new Adopter();
        person1.name="Steve";
        person1.money=300;
        person1.age=40;
        person1.familyMembers=3;
        person1.hasYard=true;
        person1.address="Queensland";


        Food food =new Food();
        food.name="Chow";
        food.price=5;
        food.stock=true;
        food.quantity=10;
        food.expDate= new Date(02,03,2021);


        Food veggies =new Food();
        veggies.name="Carrots";
        veggies.price=3;
        veggies.quantity=20;
        veggies.stock=true;
        veggies.expDate =new Date(07,07,2020);

        Vet vet=new Vet();
        vet.name="Jody";
        vet.age=45;
        vet.specilization="small animals";
        vet.hasPractice=true;
        vet.yearsExperience=20;

        Vet secVet=new Vet();
        secVet.name="Julie";
        secVet.age=35;
        secVet.yearsExperience=10;
        secVet.hasPractice=true;
        secVet.specilization="horses";

        Toy toy=new Toy();
        toy.name="Ball";
        toy.price=5;
        toy.color="red";
        toy.squeaks=false;
        toy.bouncy=true;

        Toy saddle=new Toy();
        saddle.name="English Saddle";
        saddle.price = 300;
        saddle.color="brown";
        saddle.squeaks=false;
        saddle.bouncy=false;

        Activity activity =new Activity();
        activity.name="Fetch";
        activity.duration=30;
        activity.outside=true;
        activity.toyNeeded=true;
        activity.playToy= toy;

        Activity riding =new Activity();
        riding.name="Gallop";
        riding.toyNeeded=true;
        riding.outside=true;
        riding.duration=120;
        riding.playToy=saddle;

        CareSupplies brush= new CareSupplies();
        brush.name="Brush";
        brush.price=10;
        brush.purpose="Grooming";
        brush.quantity=5;
        brush.storeName="Pets4ever";

        CareSupplies shampoo=new CareSupplies();
        shampoo.name="PetShampoo";
        shampoo.price=7;
        shampoo.purpose="Washing animal hair";
        shampoo.quantity=3;
        shampoo.storeName="Pets4ever";



        Game game=new Game();
        game.adopter=person1;
        game.animal=dog;
        game.vet=vet;


    }
}
