package entities;


// Developer is subclass of Employee and implements from IProgrammer
public class Developer extends Employee implements repositories.IProgrammer {
    private int Salary = 6000;
    //Salary of Developer;

    // CONSTRUCTOR 1
    public Developer(String name, int age, String experience, String department) {
        super();
        super.setName(name);
        super.setAge(age);
        super.setExperience(experience);
        super.setDepartment(department);
    }

    // CONSTRUCTOR 2
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


    // Information about employee
    public void BackendInfo() {
        System.out.println(work());
        System.out.print(programs());
        System.out.print(getSalary());
        System.out.println(write());
    }

}
