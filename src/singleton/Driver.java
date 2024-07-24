package singleton;


public class Driver {

    public static void main(String[] args) {

//        Test First Usage (Singleton)
        testSingleton();

        //Test Second Usage (Thread Safe)
//        testThreadSafeSingleton();

    }


    private static void testSingleton() {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();

        System.out.println(inst1.hashCode());
        inst1.printData();

        System.out.println(inst2.hashCode());
        inst2.printData();
    }


    private static void testThreadSafeSingleton() {
        new DataPrinter().start();

        new DataPrinter().start();

    }
}


/**
 * Dummy Thread that calls the getInstance and printData method
 */
class DataPrinter extends Thread {
    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
