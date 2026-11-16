public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[5];
        animals[0]=new Dog();
        animals[1]=new Dog();
        animals[2]=new Cat();
        animals[3]=new Cat();
        animals[4]=new Mouse();

        for (Animal a : animals) {
            IO.println(a.sound());
            if (a instanceof Dog t) {
                t.track("bunny");
            }
            if (a instanceof Cat c) {
                c.play("ball");
            }
            if (a instanceof Mouse m) {
                m.climb();
            }
        }
    }
}
