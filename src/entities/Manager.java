package entities;

// Manager is subclass of Employee and implements from INonProgrammer
public class Manager extends Employee implements repositories.INonProgrammer  {
    private int salary = 6500;
    // Salary for all manager

    //Constructor 1
    public Manager(String name, int age, String experience, String department){
        super();
        super.setName(name);
        super.setAge(age);
        super.setExperience(experience);
        super.setDepartment(department);
    }
    public int gettingSalary(){
        return salary;
    }
    public String manage(){
        return super.getName()+ " manage the department "+super.getDepartment();
    }
    public String work(){
        return super.getName()+ " works in IT company as manager";
    }
    public String getSalary(){
        return "He get salary "+gettingSalary()+"$ permonth.";
    }

   // Show information about employee ( manager )
    public void ManagerInfo(){
        System.out.println(work());
        System.out.println(getSalary());
        System.out.println(manage());
    }
}