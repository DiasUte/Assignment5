package entities;

public class Project {
    private int id;

    // id of the project, also project_id of employee

    private String name;
    // Name of project
    private int quantity;
    // The amount of participants
    private double budget;
    // Budget of the project
    private String description;
    // Description of project

    // Empty constructor
    public Project(){}
    // Constructor which contain only name of project
    public Project(String name) {
        setName(name);
    }
    // Constructor 3
    public Project (int id,String name, int quantity, double budget, String description) {
        setId(id);
        setName(name);
        setQuantity(quantity);
        setBudget(budget);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    // to show all data of project
    public String toString() {
        return id + " " + name+" "+quantity+" "+budget+" "+description;
    }

    // Return name of project
    public String toName(){
        return name;
    }
}
