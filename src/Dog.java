public class Dog extends Animal {
    String breed;

    public Dog(String name, long numLimbs) {
        super(name, numLimbs);
    }

    @Override
    void sound() {
        System.out.println("Woff!!!");
    }
}
