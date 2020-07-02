package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Child1 extends MainClass {

    @BeforeClass
    public void beforeClassChild1(){

        System.out.println("Child1 - BeforeClass");
    }
    @BeforeMethod
    public void beforeMethodChild1(){

        System.out.println("Child1 - BeforeMethod");
    }

    @Test
    public void test11(){
        System.out.println("--------- test11() --------");
    }

    @Test
    public void test12(){
        System.out.println("--------- test12() --------");
    }
}
