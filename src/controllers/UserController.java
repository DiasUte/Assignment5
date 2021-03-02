package controllers;


import entities.*;
import repositories.IEmployeeRep;
import repositories.IProjectRep;

import java.util.List;

public class UserController {
    private final IEmployeeRep repo;
    private final IProjectRep pro;

    public  UserController(IEmployeeRep repo, IProjectRep pro){
        this.repo = repo;
        this.pro = pro;
    }
    public String addEmployee(String name, int age, String job_title, String experience,String department, int project_id){
        Employee emp = new Employee(name, age, job_title, experience, department, project_id);
        boolean created = repo.addEmployee(emp);
        return (created ? "Employee was added!" : "Employee hasn't added! ");
    }
    public String showAllProject() {
        List<Project> project = pro.showAllProjects();
        return project.toString().replace("[", "").replace("]", "").replace(",", "");
    }

    public String addProject(int id,String name, int quantity, double budget, String description) {
        Project proj = new Project(id,name,quantity,budget,description);
        boolean created = pro.addProject(proj);
        return (created ? "Project was added!" : "Project hasn't added! ");
    }
    public String showEmployees(int id) {
        List<Employee> emp = repo.showEmployees(id);
        return emp.toString().replace("[", "").replace("]", "").replace(",", "");
    }
    public String showOneProject(int id) {
        Project proj = pro.showOneProject(id);
        return (proj == null ? "Not found!" : proj.toName());
    }
    public String showEmp(int id) {
        Employee proj = repo.showEmp(id);
        return (proj == null ? "Not found!" : proj.getJob_title());
    }
    public void showDev(int id) {
        Developer dev = repo.showDev(id);
        dev.BackendInfo();
    }
    public void showDes(int id) {
        Designer dev = repo.showDes(id);
        dev.DesignerInfo();
    }
    public void showMan(int id) {
        Manager dev = repo.showMan(id);
        dev.ManagerInfo();
    }
}