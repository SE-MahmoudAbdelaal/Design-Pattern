package observer;

public class Executor {
    public static void main(String[] args) {
        Course java = new Course("python Course");

        Student malik = new Student("Malik");
        Student mohammed = new Student("Mohammed");
        Student sami = new Student("Sami");
        Student rami = new Student("Rami");

        java.subscribe(malik);
        java.unsubscribe(mohammed);
        java.subscribe(sami);
        java.unsubscribe(rami);

        java.setAvailability(true);
    }
}
