
public abstract class Animal {


    private static int counter;

    private static int idCounter;

    private String name;
    private int maxRun;
    private int maxSwim;

    private int id;

    public int getId() {
        return id;
    }

    public static int getCounter(){
        return counter;
    }

    public String getName() {

        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }


    {
        //System.out.println("Initializer");
        id = ++idCounter;
        counter++;
    }

    static {
        //System.out.println("Static Initializer");
        idCounter = 1000;
    }


    public Animal() {
        //System.out.println("Constructor");
        this.name = "Животное";
        this.maxRun = 50;
        this.maxSwim = 50;
    }

    public Animal(String name) {
        //System.out.println("Constructor");
        this.name = name;
        this.maxRun = 50;
        this.maxSwim = 50;
    }

    public Animal(String name, int maxRun, int maxSwim) {
       // System.out.println("Constructor");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    public void swim(int distance){
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }

    @Override
    public String toString() {
        return String.format("[%d] - %s", id, name);
    }
}
