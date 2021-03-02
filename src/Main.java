import controllers.UserController;
import repositories.IEmployeeRep;
import repositories.IProjectRep;

public class Main {

    public static void main(String[] args) {
        data.IDB db = new data.SQL();
        IEmployeeRep repo = new repositories.EmployeeRep(db);
        IProjectRep pro = new repositories.ProjectRep(db);
        UserController controller = new UserController(repo, pro);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}