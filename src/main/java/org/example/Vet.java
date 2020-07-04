package org.example;

public class Vet extends Person{

    private String specilization;
    private Boolean hasPractice;
    private int yearsExperience;

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    public Boolean getHasPractice() {
        return hasPractice;
    }

    public void setHasPractice(Boolean hasPractice) {
        this.hasPractice = hasPractice;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
