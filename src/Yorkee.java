public class Yorkee extends Dog {
    static String myYorkString = "12345";

    public static String getMyYorkString() {
        return myYorkString;
    }

    public static void setMyYorkString(String myYorkString) {
        Yorkee.myYorkString = myYorkString;
    }

    public Yorkee(String name, long numLimbs) {
        super(name, numLimbs);
    }

    @Override
    void sound() {
        System.out.println(getMyYorkString());
        super.sound();
    }
}
