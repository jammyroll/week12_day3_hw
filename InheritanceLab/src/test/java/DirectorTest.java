import managment.Director;
import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director=new Director("James Ross","NGHJGTF4664",100000,"Database Management",500.00);
    }

    @Test
    public void hasName(){
        assertEquals("James Ross",director.getName());
    }
    @Test
    public void setWrongName(){
        director.setName(null);
        assertEquals("James Ross",director.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000,director.getSalary());
    }
    @Test
    public void hasNINumber(){
        assertEquals("NGHJGTF4664",director.getNInumber());
    }
    @Test
    public void raiseSalery(){
        director.raiseSalary(5.00);
        assertEquals(100005.00,director.getSalary(),0.00);
    }
    @Test
    public void checkCantGoNegative(){
        director.raiseSalary(-1.00);
        assertEquals(100000,director.getSalary());
    }

    @Test
    public void payBonus(){
        assertEquals(2000,director.payBonus());
    }

    @Test
    public void hasBudget(){
        assertEquals(500,director.getBudget(),0.00);
    }

//    @Test
//    public void changeme(){
//        assertEquals();
//    }
}
