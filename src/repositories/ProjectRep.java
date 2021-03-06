package repositories;

import entities.Project;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// ProjectRep implements methods from IProjectRep
public class ProjectRep implements IProjectRep {
    private final data.IDB db;
    public ProjectRep(data.IDB db) {
        this.db = db;
    }


    // This method adding Project to DBMS
    @Override
    public boolean addProject(Project pro) {
        // Connection to DBMS
        Connection con = null;
        Statement statement = null;
        try {
            con = db.getConnection();
            String value = "INSERT INTO project(id,name,quantity,budget,description)" +
                    " " + "VALUES(" + pro.getId() + ",'" + pro.getName() + "'," + pro.getQuantity() +
                    "," + pro.getBudget() + ",'" + pro.getDescription() + "')";
            statement = con.createStatement();
            statement.executeUpdate(value);
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
        return true;
    }

    // This method shows projects from DBMS
    @Override
    public List<Project> showAllProjects() {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            //Connection to DBMS
            con = db.getConnection();
            statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM project");
            LinkedList<Project> pros = new LinkedList<>();
            while (rs.next()) {
                Project project = new Project(rs.getInt("id"), rs.getString("name"),
                rs.getInt("quantity"),rs.getDouble("budget"), rs.getString("description")
                );
                pros.add(project);
            }
            return pros;
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

    // Method to show one project by ID
    @Override
    public Project showOneProject(int id) {
        Scanner in = new Scanner(System.in);
        Statement statement = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            // Connection to DBMS
            con = db.getConnection();
            statement = con.createStatement();
            // SQL Query
            rs = statement.executeQuery("SELECT name FROM project where id =" + id);
            while (rs.next()) {
                Project project = new Project(rs.getString("name"));
               return project;
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

