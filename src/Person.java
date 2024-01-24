public class Person implements Payable, Comparable<Person> {
    private String name;
    private String surname;
    private final int id;
    private static int counter = 1;

    public Person() {
        this.id = counter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

}