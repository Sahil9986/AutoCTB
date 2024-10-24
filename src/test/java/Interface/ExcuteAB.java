package Interface;

import com.sun.net.httpserver.Authenticator;

import java.sql.SQLOutput;

public class ExcuteAB implements InterA{
    @Override
    public void security() {
        System.out.println("Application is fully secured");
    }

    @Override
    public void GUI() {
        System.out.println("Application has good GUI");
    }

    @Override
    public void Application() {
        System.out.println("Application has good features");
    }

    @Override
    public void payment() {
        System.out.println("Payment is successful");
    }
}
