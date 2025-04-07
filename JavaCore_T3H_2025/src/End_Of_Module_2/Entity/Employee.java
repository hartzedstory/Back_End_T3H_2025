package End_Of_Module_2.Entity;

public class Employee implements Workable {
    @Override
    public void work() {
        System.out.println("Work as an employee named " + this.getName());
    }

    private String name;
    private int age;
    private Double salary;

    public Employee(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge() + " Salary: " + this.getSalary());
    }

    public void updataSalary(Employee employee, double newSalary) throws IllegalArgumentException {
        if (newSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        } else {
            employee.setSalary(newSalary);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
