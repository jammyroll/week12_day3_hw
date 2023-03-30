package techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {
    private String name;
    private String NInumber;
    private int salary;
    private String deptName;

    public DatabaseAdmin(String name, String NInumber,int salary ){
        super(name,NInumber,salary);
    }

}
