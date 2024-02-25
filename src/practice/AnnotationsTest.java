package practice;

import org.testng.annotations.*;

public class AnnotationsTest {

    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @BeforeClass(alwaysRun = true)
    public static void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @BeforeTest(alwaysRun = true)
    public static void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @BeforeMethod(alwaysRun = true)
    public static void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @AfterClass(alwaysRun = true)
    public static void afterClass() {
        System.out.println("@AfterClass");
    }

    @AfterTest(alwaysRun = true)
    public static void afterTest() {
        System.out.println("@AfterTest");
    }

    @AfterMethod(alwaysRun = true)
    public static void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }
}
