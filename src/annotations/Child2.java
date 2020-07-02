package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child2 extends MainClass {

    @BeforeClass
    public void beforeClassChild2(){

        System.out.println("Child2 - BeforeClass");
    }
    @BeforeMethod
    public void beforeMethodChild2(){

        System.out.println("Child2 - BeforeMethod");
    }

    @Test
    public void test21(){

        System.out.println("--------- test21() --------");
    }

    @Test
    public void test22(){

        System.out.println("--------- test22() --------");
    }
}
