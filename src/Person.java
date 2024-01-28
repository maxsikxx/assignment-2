import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Студент";
    }

    @Override
    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), id, name, surname);
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        // Comparison based on first name, then last name if the names are identical
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return this.surname.compareTo(other.surname);
    }
}
