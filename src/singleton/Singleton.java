package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Singleton {

    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    private List<String> data = Arrays.asList(LETTERS);

    private static Singleton instance;


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
        Collections.shuffle(data);
    }


    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

}
