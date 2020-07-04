package org.example;

public class Toy {
    private String name;
    private String color;
    private int price;
    private Boolean squeaks;
    private Boolean bouncy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getSqueaks() {
        return squeaks;
    }

    public void setSqueaks(Boolean squeaks) {
        this.squeaks = squeaks;
    }

    public Boolean getBouncy() {
        return bouncy;
    }

    public void setBouncy(Boolean bouncy) {
        this.bouncy = bouncy;
    }
}
