package entities;

public class Project {
    private int id;
    private String name;
    private int quantity;
    private double budget;
    private String description;

    public Project(){}
    public Project(String name) {
        setName(name);
    }
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
    public String toString() {
        return id + " " + name+" "+quantity+" "+budget+" "+description;
    }
    public String toName(){
        return name;
    }
}
