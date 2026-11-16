public class Dog extends Animal{
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
}
