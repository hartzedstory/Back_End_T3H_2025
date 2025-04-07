package End_Of_Module_2.Entity;

public interface SalaryCalculator {
     default void calculateSalary(Employee employee) {

         System.out.println("Salary calculated");
    };
}
