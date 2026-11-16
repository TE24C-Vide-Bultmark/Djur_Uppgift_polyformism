public class Cat extends Animal{
    public Cat(){
        super(5, 10000);
    }
    @Override 
    public String sound(){
        return "meow";
    }
    public void play(String toy){
        IO.println("playing with " + toy);
    }
}
