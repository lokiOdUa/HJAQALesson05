// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String myString = "12345";

    public static void main(String[] args) {
        String string1;

        Cat pushok = new Cat("Pushok", 4);
        Cat barsik = new Cat("Barsik", 4, "Od.Ua");
        Dog may = new Dog("May Silk Beauty Viva DeLuxe", 4);
        Dog mary = new Yorkee("Mary Berry Grace", 4);

        System.out.println("Pushok is saying:");
        pushok.sound();
        System.out.println("May is saying:");
        may.sound();

        System.out.println("Who is May?");
        System.out.println(may instanceof Animal);
        System.out.println(may instanceof Dog);
        System.out.println(may instanceof Yorkee);

        System.out.println("Who is Mary?");
        System.out.println(mary instanceof Animal);
        System.out.println(mary instanceof Dog);
        System.out.println(mary instanceof Yorkee);

//        System.out.println(may instanceof Cat);
    }
}
