public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    //Returns the employee's salary.**
    public double getSalary() {
        return salary;
    }

    //Sets the employee's salary.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    //Sets the position of the employee.
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public String toString() {
        return String.format("%s earns %,.2f tg",super.toString(), salary);
    }
}
