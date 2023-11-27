public class Dog extends Animal {
    String breed;
    static long numLegs = 4;

    public Dog(String name, long numLimbs) {
        super(name, numLimbs);
    }

    public Dog(String name, long numLimbs, String breed) {
        super(name, numLimbs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void sound() {
        System.out.println("Woff!!!");
    }
}
