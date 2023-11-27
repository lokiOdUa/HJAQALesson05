public class Animal {
    private final String name;
    private long numLimbs;

    public Animal(String name, long numLimbs) {
        this.name = name;
        setNumLimbs(numLimbs);
    }

    public String getName() {
        return name;
    }

    public long getNumLimbs() {
        return numLimbs;
    }

    public void setNumLimbs(long numLimbs) {
        //  Scientists have discovered a millipede with 1,306 legs - the most of any known
        // animal - and say it is a "marvel of evolution"
        if (numLimbs < 0 || numLimbs > 1306) {
            throw new IllegalArgumentException("Number of legs is incorrect");
        } else {
            this.numLimbs = numLimbs;
        }
    }

    void sound() {
        System.out.println("Silence...");
    }
}
