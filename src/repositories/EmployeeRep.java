package repositories;

import entities.*;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// EmployeeRep implements methods of IEmployeeRep
public class EmployeeRep implements IEmployeeRep {
    private final data.IDB db;

    // Database
    public EmployeeRep(data.IDB db) {
        this.db = db;
    }

    // This method adds employee to the database
    @Override
    public boolean addEmployee(Employee emp) {
       // Connection to the DBMS
        Connection con = null;
        Statement statement = null;
        // Try to connect
        try {
            con = db.getConnection();
            // SQL query, which add employee to dbms
                String value = "INSERT INTO employee(name,age,job_title,experience,department,project_id)" +
                        " " + "VALUES('" + emp.getName() + "'," + emp.getAge() + ",'" + emp.getJob_title() +
                        "','" + emp.getExperience() + "','" + emp.getDepartment() + "'," + emp.getProject_id() + ")";
            statement = con.createStatement();
            // Adds to DBMS
            statement.executeUpdate(value);
        } catch (SQLException | ClassNotFoundException e) {
            // If it doesn't connect, it shows ERROR
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return true;
    }
    // This method shows employees, by returning array
    @Override
    public List<Employee> showEmployees(int p_id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            // Connection to DBMS
            con = db.getConnection();
            statement = con.createStatement();
            // SQL Query
            rs = statement.executeQuery("SELECT * FROM employee WHERE project_id = " + p_id);
            LinkedList<Employee> emp = new LinkedList<>();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("age"),rs.getString("job_title"),
                        rs.getString("experience"), rs.getString("department"), rs.getInt("project_id")
                );
                // Adding employee to array
                emp.add(employee);
            }
            return emp;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    // This method shows exact employee by his id, and return the job title
    @Override
    public Employee showEmp(int id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = db.getConnection();
            statement = con.createStatement();
            // SQL Query
            rs = statement.executeQuery("SELECT job_title FROM employee where id =" + id);
            while (rs.next()) {
                Employee e = new Employee(//rs.getInt("id"), rs.getString("name"),
                        //rs.getInt("age"),
                        rs.getString("job_title")
                        //rs.getString("experience"), rs.getString("department")
                        );
                return e;
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    // Show the information of employee whos job title is Unity developer
    @Override
    public Developer showDev(int id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = db.getConnection();
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM employee where id =" + id);
            while (rs.next()) {
                Developer e = new Developer(rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("experience"), rs.getString("department")
                );
                return e;
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    // Show the information of employee whos job title is designer
    @Override
    public Designer showDes(int id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = db.getConnection();
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM employee where id =" + id);
            while (rs.next()) {
                Designer e = new Designer(rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("experience"), rs.getString("department")
                );
                return e;
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    // Show the information of employee whos job title is manager
    @Override
    public Manager showMan(int id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = db.getConnection();
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM employee where id =" + id);
            while (rs.next()) {
                Manager e = new Manager(rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("experience"), rs.getString("department")
                );
                return e;
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error to connecting to DBMS server");
        }finally {
            try {
                con.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
