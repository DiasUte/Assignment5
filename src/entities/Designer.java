package entities;

// DESIGNER is subclass of Employee and implements from IProgrammer
public class Designer extends Employee implements repositories.IProgrammer {
    private final int Salary = 5500;
    // Constant salary for Designer

    // Constructor 1
    public Designer(String name, int age,String experience, String department) {
        super();
        super.setName(name);
        super.setAge(age);
        super.setExperience(experience);
        super.setDepartment(department);
    }
    // Get salary
    public int gettingSalary() {
        return Salary;
    }


    public String programs() {
        return super.getName() + " design in " + super.getDepartment() + " department";
    }

    public String work() {
        return super.getName() + " works in IT company as Game Designer.";
    }

    public String getSalary() {
        return "He gets salary " + gettingSalary() + "$ per month.";
    }

    public String write(){
        return "He makes game design by Photoshop, Unity, 3dMax and etc.";
    }

    // Show information about the employee
    public void DesignerInfo(){
        System.out.println(work());
        System.out.println(programs());
        System.out.println(getSalary());
        System.out.println(write());
    }
}