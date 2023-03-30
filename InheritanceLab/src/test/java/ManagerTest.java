import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager=new Manager("James Ross","NGHJGTF4664",100000,"Database Management");
    }

    @Test
    public void hasName(){
        assertEquals("James Ross",manager.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000,manager.getSalary());
    }
    @Test
    public void hasNINumber(){
        assertEquals("NGHJGTF4664",manager.getNInumber());
    }
    @Test
    public void raiseSalery(){
        manager.raiseSalary(5.00);
        assertEquals(100005.00,manager.getSalary(),0.00);
    }

    @Test
    public void payBonus(){
        assertEquals(1000,manager.payBonus());
    }

//    @Test
//    public void changeme(){
//        assertEquals();
//    }
}
