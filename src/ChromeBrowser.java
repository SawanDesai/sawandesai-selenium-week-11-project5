import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //launch URL
        driver.get(baseurl);

        //Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("page title is " + title);

        //Get current URL
        System.out.println("current URL " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source " + driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("sawan123@gmail.com");

        //Find password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("desai123");

        //close the browser
       // driver.close();
    }
}