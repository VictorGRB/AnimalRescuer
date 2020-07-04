package org.example;

public class Activity {
    private String name;
    private Boolean outside;
    private int duration;
    private Boolean toyNeeded;
    private Toy playToy;

    public Activity(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOutside() {
        return outside;
    }

    public void setOutside(Boolean outside) {
        this.outside = outside;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Boolean getToyNeeded() {
        return toyNeeded;
    }

    public void setToyNeeded(Boolean toyNeeded) {
        this.toyNeeded = toyNeeded;
    }

    public Toy getPlayToy() {
        return playToy;
    }

    public void setPlayToy(Toy playToy) {
        this.playToy = playToy;
    }
}
