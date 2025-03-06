public class Singleton{
 
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {

            instance = new Singleton();
        }
        return instance;
    }
}

public class Main{
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        

        Singleton singleton2 = Singleton.getInstance();


        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances.");
        }
    }
}
