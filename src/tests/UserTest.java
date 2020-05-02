package tests;
import models.User;
import utils.Printer;

public class UserTest {

    public static void test(){
        //Create Printer
        Printer p = new Printer();

        //Create users for tests
        User u1 = new User("User 1: Elon Musk");
        User u2 = new User("User 2: Steve Jobs");

        //Print results to Console
        p.setVal(u1.getName());
        p.print();

        p.setVal(u2.getName());
        p.print();


    }
}
