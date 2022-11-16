import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // launch URL
        driver.get(baseurl);

        // Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("page tilte is " + title);

        //Get current url
        System.out.println("Current url " + driver.getCurrentUrl());

        //get page source
        System.out.println("page source " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("sawan123@gmail.com");

        //Find the password field element
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("desai123");

        //close the browser
        driver.close();
    }
}
