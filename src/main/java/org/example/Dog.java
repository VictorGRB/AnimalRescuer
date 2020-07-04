package org.example;

public class Dog extends Animal {

    private int barkIntensity;
    private Boolean howlsAtMoon;

    public int getBarkIntensity() {
        return barkIntensity;
    }

    public void setBarkIntensity(int barkIntensity) {
        this.barkIntensity = barkIntensity;
    }

    public Boolean getHowlsAtMoon() {
        return howlsAtMoon;
    }

    public void setHowlsAtMoon(Boolean howlsAtMoon) {
        this.howlsAtMoon = howlsAtMoon;
    }
}
