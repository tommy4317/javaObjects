package com.classo;

public class Guitar {
    private String name;
    private int  numberOfStrings;
    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Guitar(String name, int numberOfStrings, String color) {
        this.name = name;
        this.numberOfStrings= 12;
        this.color = color;
    }

    public Guitar() {
        name = "Unknown";
        numberOfStrings= 0;
        color = "Unknown";
    }

    public Guitar(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public boolean tooMany() {
        return this.numberOfStrings > 12;
    }

    public String rock() {
        return "Good Rocking Tonight";
    }

    public static void readyForStage() {
        Guitar guitar = new Guitar("Epiphone", 6, "Sunburst");
        System.out.println(guitar);
    }

}
