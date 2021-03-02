package entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Developer extends Employee implements repositories.IProgrammer {
    private int Salary = 6000;
    //private String level;

    public Developer(String name, int age, String experience, String department) {
        super();
        super.setName(name);
        super.setAge(age);
        super.setExperience(experience);
        super.setDepartment(department);
    }
    public Developer() {}

    public int gettingSalary() {
        return Salary;
    }

    public String programs() {
        return super.getName() + " programs in "+ super.getDepartment()+" department";
    }

    public String work() {
        return super.getName() + " works in IT company as Unity developer.";
    }

    public String getSalary() {
        return "He get salary "+gettingSalary()+"$ per month.";
    }


    public String write() {
        return "He writes C#";
    }


    public void BackendInfo() {
        System.out.println(work());
        System.out.print(programs());
        System.out.print(getSalary());
        System.out.println(write());
    }

}
