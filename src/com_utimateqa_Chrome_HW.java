import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class com_utimateqa_Chrome_HW {

    /**
     * 1. Setup chrome browser
     * 2. Open URL
     * 3. Print the title of the page
     * 4. Print the current url
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */

    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();

        // For Enter Login details need to Maximise the page
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Currunt URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.2 Enter the email to email field (need to find "Where to login") Step 1.
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("komalspatel@prime.com");

        // 7 Enter the password to password field
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("LalaHula@.com");

        // 8. Close the browser
        driver.close();
    }
}
