package entities;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String job_title;
    private String experience;
    private String department;
    private int project_id;

    public Employee(int id,String name, int age, String job_title, String experience,String department, int project_id) {
        setId(id);
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
        setProject_id(project_id);
    }
    public Employee(int id,String name, int age, String job_title, String experience,String department) {
        setId(id);
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
    }
    public Employee(String job_title) {
        setJob_title(job_title);
    }
    public Employee(String name, int age, String job_title, String experience,String department, int project_id) {
        setName(name);
        setAge(age);
        setJob_title(job_title);
        setExperience(experience);
        setDepartment(department);
        setProject_id(project_id);
    }
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

    @Override
    public String toString() {
        return id+" "+" "+name+" "+" "+age+" "+job_title+" "+experience+" "+department+"\n";
    }
    public String toEmp() {return id+","+name+","+age+","+job_title+","+experience+","+department;}

}
