public class Dog extends Animal implements Trained{
    public Dog(){
        super(5, 20000);
    }

    @Override
    public String sound(){
        return "voff";
    }
    public void track(String prey){
        IO.println("Tracking " + prey);
    }

    public void sit(){
        IO.println("sit");
    }
    public void fetch(){
        IO.println("fetch");
    }
    public void come(){
        IO.println("come");
    }
}
