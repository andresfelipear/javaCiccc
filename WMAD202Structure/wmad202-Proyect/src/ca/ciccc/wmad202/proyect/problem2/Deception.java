package ca.ciccc.wmad202.proyect.problem2;

public class Deception extends Transformers {

    public Deception(String name, int strength, int intelligent, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        super(name, strength, intelligent, speed, endurance, rank, courage, firepower, skill);
        super.nameClass = "Decepticons";
    }

    @Override
    public String toString() {
        return "Deception" + super.toString();
    }
}
