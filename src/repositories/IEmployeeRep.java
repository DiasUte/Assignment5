package repositories;

import entities.Designer;
import entities.Developer;
import entities.Employee;
import entities.Manager;

import java.util.List;

public interface IEmployeeRep {
    boolean addEmployee(Employee med);
    List<Employee> showEmployees(int p_id);
    Employee showEmp(int id);
    Developer showDev(int id);
    Designer showDes(int id);
    Manager showMan(int id);
}
