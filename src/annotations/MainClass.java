package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class MainClass {
    @BeforeSuite
    public void beforeSuiteMainClass(){
        System.out.println("MainClass - BeforeSuite");
    }
    @BeforeClass
    public void beforeClassMainClass(){
        System.out.println("MainClass - BeforeClass");
    }
    @BeforeMethod
    public void beforeMethodMainClass(){
        System.out.println("MainClass - BeforeMethod");
    }
}
