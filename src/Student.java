public class Student extends Person {
    private double gpa;
    private static final double step = 41898.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? step : 0;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tg";
    }
}
