package repositories;

import entities.Designer;
import entities.Developer;
import entities.Employee;
import entities.Manager;

import java.util.List;

public interface IEmployeeRep {
    // Add emplyee to DBMS
    boolean addEmployee(Employee med);
    // Show employee from DBMS
    List<Employee> showEmployees(int p_id);
    // Show employee by id
    Employee showEmp(int id);
    // Show employee whos job title is Unity developer
    Developer showDev(int id);
    // Show employee whos job title is Designer
    Designer showDes(int id);
    // Show employee whos job title is manager
    Manager showMan(int id);
}
