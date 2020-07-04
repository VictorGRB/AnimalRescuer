package org.example;

public class Horse extends Animal{

    private String maneLength;
    private String tailLength;
    private Boolean hoovesClean;
    private Boolean braidedMane;
    private int ridingCompetitions;

    public String getManeLength() {
        return maneLength;
    }

    public void setManeLength(String maneLength) {
        this.maneLength = maneLength;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public Boolean getHoovesClean() {
        return hoovesClean;
    }

    public void setHoovesClean(Boolean hoovesClean) {
        this.hoovesClean = hoovesClean;
    }

    public Boolean getBraidedMane() {
        return braidedMane;
    }

    public void setBraidedMane(Boolean braidedMane) {
        this.braidedMane = braidedMane;
    }

    public int getRidingCompetitions() {
        return ridingCompetitions;
    }

    public void setRidingCompetitions(int ridingCompetitions) {
        this.ridingCompetitions = ridingCompetitions;
    }
}
