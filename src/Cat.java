public class Cat extends Animal {
    String suit;

    public Cat(String name, long numLimbs, String suit) {
        super(name, numLimbs);
        this.suit = suit;
    }

    public Cat(String name, long numLimbs) {
        super(name, numLimbs);
    }
}
