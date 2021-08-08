package ca.ciccc.wmad202.proyect.problem2;

public class Transformers {
    protected int strength;
    protected int intelligent;
    protected int speed;
    protected int endurance;
    protected int rank;
    protected int courage;
    protected int firepower;
    protected int skill;
    protected int overallRating;
    protected String name;
    protected String nameClass;

    public Transformers(String name,int strength, int intelligent, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        this.name = name;
        this.strength = strength;
        this.intelligent = intelligent;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;
        this.nameClass = nameClass;
    }

    //Functions
    public void calcOverallRating(){
        overallRating = strength+intelligent+speed+endurance+rank+courage+firepower+skill;
    }

    //Getters and Setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getFirepower() {
        return firepower;
    }

    public void setFirepower(int firepower) {
        this.firepower = firepower;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name+
                "', strength=" + strength +
                ", intelligent=" + intelligent +
                ", speed=" + speed +
                ", endurance=" + endurance +
                ", rank=" + rank +
                ", courage=" + courage +
                ", firepower=" + firepower +
                ", skill=" + skill +
                ", overallRating=" + overallRating +
                + '\'' +
                '}';
    }
}
