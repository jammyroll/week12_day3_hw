package managment;

public class Director extends Manager{
    private double budget;

    public Director(String name,String NInumber,int salary,String deptName,double budget){
        super(name,NInumber,salary,deptName);
        this.budget=budget;
    }

    public int payBonus() {
        return (int) (getSalary() * 0.02);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
