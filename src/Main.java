import controllers.UserController;
import repositories.IEmployeeRep;
import repositories.IProjectRep;

public class Main {

    public static void main(String[] args) {
        // Database
        data.IDB db = new data.SQL();
        // Employee methods
        IEmployeeRep repo = new repositories.EmployeeRep(db);
        // Project methods
        IProjectRep pro = new repositories.ProjectRep(db);
        // User Controller, where work with all methods
        UserController controller = new UserController(repo, pro);

        // Application works with console, calling methods
        MyApplication app = new MyApplication(controller);

        // Start the method
        app.start();
    }
}