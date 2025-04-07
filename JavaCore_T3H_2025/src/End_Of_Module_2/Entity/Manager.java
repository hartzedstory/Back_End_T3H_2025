package End_Of_Module_2.Entity;

public class Manager extends Employee implements Workable {
    private String department;

    public Manager(String name, int age, Double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Depoartment Name: " + this.getDepartment());
    }

    @Override
    public void work() {
        System.out.println("Work as an Managing department: " + this.getDepartment());
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
