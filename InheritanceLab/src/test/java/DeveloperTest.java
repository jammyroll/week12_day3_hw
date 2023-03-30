import managment.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Devoloper;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Devoloper devoloper;

    @Before
    public void before(){
        devoloper=new Devoloper("James Ross","NGHJGTF4664",100000);
    }

    @Test
    public void hasName(){
        assertEquals("James Ross",devoloper.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000,devoloper.getSalary());
    }
    @Test
    public void hasNINumber(){
        assertEquals("NGHJGTF4664",devoloper.getNInumber());
    }
    @Test
    public void raiseSalery(){
        devoloper.raiseSalary(5.00);
        assertEquals(100005.00,devoloper.getSalary(),0.00);
    }

    @Test
    public void payBonus(){
        assertEquals(1000,devoloper.payBonus());
    }

//    @Test
//    public void changeme(){
//        assertEquals();
//    }
}
