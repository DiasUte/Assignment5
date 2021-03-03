package entities;

public class Employee {
    private int id;
    // id of Employee
    private String name;
    // Name of employee
    private int age;
    // age of employee
    private String job_title;
    // job title, like CEO, developer and etc
    private String experience;
    // Experience, fortam 2y 6m
    private String department;
    // Department where employee works
    private int project_id;
    // Id of the project where employee works

    // CONSTRUCTOR 1
    public Employee(int id,String name, int age, String job_title, String experience,String department, int project_id) {
        setId(id);
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
        setProject_id(project_id);
    }

    // CONSTRUCTOR 2
    public Employee(int id,String name, int age, String job_title, String experience,String department) {
        setId(id);
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
    }

    // CONSTRUCTOR 3
    public Employee(String job_title) {
        setJob_title(job_title);
    }

    // CONSTRUCTOR 4
    public Employee(String name, int age, String job_title, String experience,String department, int project_id) {
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
        setProject_id(project_id);
    }

    // CONSTRUCTOR 5( Empty )
    public Employee (){}

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getJob_title() {
        return job_title;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    // This override returns all the data of  employee
    @Override
    public String toString() {
        return id+" "+" "+name+" "+" "+age+" "+job_title+" "+experience+" "+department+"\n";
    }
    // This string return all, without project_id
    public String toEmp() {return id+","+name+","+age+","+job_title+","+experience+","+department;}

}
