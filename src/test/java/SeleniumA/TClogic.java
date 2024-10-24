package SeleniumA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TClogic {

    @Test (description = "Test case to launch page", priority = 1)
    public void test() {
        System.out.println("Test case to launch page");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();

    }

    @Test(description = "Test case to open tab", priority = -2)
    public void test2() throws Exception {
        System.out.println("Test case to open tab");
        throw new Exception();
    }
    @Test (description = "Test case to perform action", dependsOnMethods = "test2")
    public void test3  ()  {
        System.out.println("Test case to perform action");
    }

}
