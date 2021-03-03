import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final controllers.UserController controller;
    private final Scanner in;

    public MyApplication(controllers.UserController controller){
        this.controller = controller;
        in = new Scanner(System.in);
    }

    public void start(){
        // OPTIONS TO SELECT IN CONSOLE TO USER
        while(true){
            System.out.println();
            System.out.println("Select option: (1-5)");
            System.out.println("1. Get the information of company");
            System.out.println("2. Add project");
            System.out.println("3. Show all projects");
            System.out.println("4. Show the team of specific project");
            System.out.println("5. Show the information about employee by ID");
            System.out.println("0. Exit");
            System.out.println();
            try {
                int option = in.nextInt();
                if(option==1){
                    // Description of company :D
                    System.out.println("Name of the company: I want 100% for the assignment 5\n" +
                            "CEO,Genius, billionaire, playboy, philanthropist: Dias Utebayev\n" +
                            "The purpose of company: Making games on mobile, desktop platforms by Unity\n " +
                            "The budget of the company: More than 1.000 tenge");
                }
                // Selecting options from above, from 1 - 5
                else if(option == 2){
                    addProject();
                }
                else if(option == 3) {
                    showAllProjects();
                }
                else if(option == 4) {
                    showEmployees();
                }
                else if(option == 5) {
                    showEmp();
                }
                else{
                    break;
                }
            } catch (InputMismatchException e) {
                // Input must be integer
                System.out.println("Input must be integer");
                in.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("*******************************");
        }
    }

    // ADD PROJECT AND ALSO ADD EMPLOYEES
    public void addProject(){
        System.out.print("Project id: ");
        int project_id = in.nextInt();
        System.out.print("Please, write the name of your project: ");
        String p_name = in.next();
        System.out.print("Please write the amount of participants to the project: ");
        int p_amount = in.nextInt();
        System.out.println("What is the budget of project? ");
        double p_budget = in.nextDouble();
        System.out.println("Write a small definition of your project: ");
        String p_def = in.next();

        // Information of project
        System.out.println("Your project: ");
        System.out.println("Name: " + p_name);
        System.out.println("Participants: " + p_amount);
        System.out.println("Budget: " +  p_budget);
        System.out.println("Description: " + p_def);

        // Checking the correctness of data
        System.out.println("Information is correct?");
        String p_check = in.next();
        int k = 0;
        if(p_check.equals("Yes")) {
            // Sending project to DBMS
            String res = controller.addProject(project_id, p_name, p_amount, p_budget, p_def);
            System.out.println(res);
        while(k != p_amount) {
            // k ++ until it won't be equal to amount of participant of project
            // Adding employees to project
            System.out.println("Name of Employee: ");
            String name = in.next();
            System.out.println("Age: ");
            int age = in.nextInt();
            System.out.println("Choose department:\n1. Coding\n2. Designing\n3. Management");
            int dep_int;
            while (true) {
                if (in.hasNext()) {
                    dep_int = in.nextInt();
                    if (dep_int == 1 || dep_int == 2 || dep_int == 3) {
                        break;
                    }
                } else {
                    in.next();
                }
                System.out.println("Please, choose 1-3");
            }
            String department = null;
            if(dep_int == 1) { department= "Coding";}
            else if(dep_int == 2) {department = "Designing";}
            else if(dep_int == 3) {department = "Management";}

            System.out.println("Choose one of this job title:\n1: Unity Developer\n2: Game Designer\n3: Manager");
            int job_int;
            while (true) {
                if (in.hasNext()) {
                    job_int = in.nextInt();
                    if (job_int == 1 || job_int == 2 || job_int == 3) {
                        break;
                    }
                } else {
                    in.next();
                }
                System.out.println("Please, choose 1-3");
            }
            String job_title = null;
            if(job_int == 1) {job_title = "Unity developer";}
            else if(job_int == 2) {job_title = "Game designer";}
            else if(job_int == 3) {job_title = "Manager";}
            System.out.println("Experience: ( 2y 7m ) ");
            String experience = in.next();
            k++;
            // SENDING EMPLOYEE TO DBMS
            String response = controller.addEmployee(name, age, job_title, experience, department, project_id);
            System.out.println(response);
        }
        }
        k = 0;
    }

    // Showing all projects method
    public void showAllProjects(){
        System.out.println("All projects of the company:");
        String responce = controller.showAllProject();
        System.out.println(responce);
    }

    // Show employees of the specific project
    public void showEmployees(){
        System.out.print("Write the id of the project, to show who works to it: ");
        int id = in.nextInt();
        String rep = controller.showOneProject(id);
        System.out.println(rep);
        String responce = controller.showEmployees(id);
        System.out.println(responce);
    }

    // Show employee by ID, and information of him
    public void showEmp(){
        System.out.println("ID of employee: ");
        int id = in.nextInt();
        String rep = controller.showEmp(id);
        if(rep.equals("Unity developer")) {
            controller.showDev(id);
        }
        else if(rep.equals("Game designer")) {
            controller.showDes(id);
        }
        else {
            controller.showMan(id);
        }

    }

}