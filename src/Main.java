
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Aibar", "Karimov", "Employee", 1000000));
        people.add(new Student("Asel", "Kenzhetay", 2.3));
        people.add(new Student("Edilim", "Myrzabekov", 3.7));
        people.add(new Employee("Maksat", "Karzhaubaev", "Employee", 2500000.00));

        Collections.sort(people, Comparator.comparing(Person::getName).reversed());

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
