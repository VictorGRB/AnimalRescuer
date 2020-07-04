package org.example;

public class Adopter extends Person {

    private int money;
    private String address;
    private Boolean hasYard;
    private int familyMembers;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getHasYard() {
        return hasYard;
    }

    public void setHasYard(Boolean hasYard) {
        this.hasYard = hasYard;
    }

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }
    public void ride(Person person,Animal animal, Activity activity){
        System.out.println(person.getName()+" just rode "+ animal.getName()+" and it was "+activity.getName()+".");
    }



}
