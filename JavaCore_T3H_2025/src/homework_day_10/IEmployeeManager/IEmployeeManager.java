package homework_day_10.IEmployeeManager;

import homework_day_10.Exception.EmployeeException;
import homework_day_10.Model.Engineer;
import homework_day_10.Model.Manager;
import homework_day_10.Model.Officer;

public interface IEmployeeManager {
    default void initDefaultEmployee() {
        //PRAMA MARK: KHOI TAO MAC DINH 3 NHAN VIEN
        Officer officer = new Officer();
        Engineer engineer = new Engineer();
        Manager manager = new Manager();

        officer.setName("Nguyen Van A");
        officer.setId("001");
        officer.setAge(30);
        officer.setSalary(5000000);
        officer.setWorkedDay(20);

        engineer.setName("Nguyen Van A");
        engineer.setId("002");
        engineer.setAge(30);
        engineer.setSalary(7000000);
        engineer.setField("CNTT");

        manager.setName("Le Quang Dao");
        manager.setId("003");
        manager.setAge(35);
        manager.setSalary(10000000);
        manager.setMultiplier((int) 1.5);

    };
    void addEmployee() throws EmployeeException;
    void showEmployeeList();
    void calculateAllSalary();
    void searchHighestPaid();
    void searchById(String id);
    void sortEmployeeListAlphabetically();
    void sortEmployeeOPaidDescending();
}
