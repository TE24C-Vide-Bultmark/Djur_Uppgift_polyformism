public class Mouse extends Animal{
    public Mouse(){
        super(1, 5000);
    }
    @Override 
    public String sound(){
        return "squeak";
    }
    void climb(){
        IO.println("Mouse is climbing");
    }
}
