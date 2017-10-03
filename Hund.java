package Hundpaketet;

public class Hund {

    //namn:str vikt:int ålder:int ras:str
    private String name;
    private int weight;
    private int age;
    private String race;
    private double tailLength;

    public Hund(String name, int weight, int age, String race) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.race = race;
        if (race.equalsIgnoreCase("Tax")) {
            this.tailLength = 3.7;
        } else {
            this.tailLength = (age * weight) / 10;
        }
    }

    @Override
    public String toString() {
        return " heter " + name + " och är " +  age + " år gammal. Den väger " + weight + " Kg och är av rasen " + race + " med en svanslängd på " + tailLength;
    }

    public String getName() {
        return name;
    }

    public double getTail() {
        return tailLength;
    }

    public String getRace() {
        return race;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }
}
