import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdmin {

    techStaff.DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin=new techStaff.DatabaseAdmin("James Ross","NGHJGTF4664",100000);
    }

    @Test
    public void hasName(){
        assertEquals("James Ross",databaseAdmin.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000,databaseAdmin.getSalary());
    }
    @Test
    public void hasNINumber(){
        assertEquals("NGHJGTF4664",databaseAdmin.getNInumber());
    }
    @Test
    public void raiseSalery(){
        databaseAdmin.raiseSalary(5.00);
        assertEquals(100005.00,databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void payBonus(){
        assertEquals(1000,databaseAdmin.payBonus());
    }

//    @Test
//    public void changeme(){
//        assertEquals();
//    }
}
