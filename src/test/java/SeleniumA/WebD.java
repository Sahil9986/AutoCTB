package SeleniumA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebD {

    @Test
    public void test() {
        System.out.println("First test case");
    }
    @Test
    public void test2() {
        System.out.println("Second test case");
    }
    @Test
    public void test3() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
//        driver.quit();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com");
        Thread.sleep(7000);
//        driver.quit();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.myntra.com");
//        driver.quit();
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com");
        System.out.println(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
    }
}
