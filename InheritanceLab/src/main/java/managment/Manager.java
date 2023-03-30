package managment;


import staff.Employee;

public class Manager extends Employee {
    private String name;
    private String NInumber;
    private int salary;
    private String deptName;

    public Manager(String name,String NInumber,int salary,String deptName){
        super(name,NInumber,salary);
        this.deptName=deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
