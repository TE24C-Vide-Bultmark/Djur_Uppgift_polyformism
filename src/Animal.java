public class Animal{
    protected float weight;
    protected int energy;
    protected boolean isAlive;
    int animalsCreated = 0;

    public Animal(float weight, int energy){
        this.weight = weight;
        this.energy = energy;
        this.isAlive = true;
        animalsCreated++;
    }

    public void eat(int energy){
        energy+= 10;
    }
    public void run(int meter){
        energy -= meter*weight;
    }
    public String sound(){
        return "The animal is making noises";
    }
}