package tests;

public class TestRunner {

    public static void run() {
        //Instances of test classes
        UserTest testUsers = new UserTest();
        //AlerterTest testAlert = new AlerterTest();

        // Test class Calls
        testUsers.test();
    }

}
