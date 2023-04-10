package coursesultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoursesUltimateQaChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Chrome browser launch
        WebDriver driver = new ChromeDriver();
       //Opening URL command
        driver.get(baseUrl);
        // Once URl is open it fits the relevant screen
        driver.manage().window().maximize();
        //Acquiring title and printing title of the page
        System.out.println("title of the page:" + driver.getTitle());
        //Acquiring URl and printing URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        //Acquiring page source printing
        System.out.println("Page Source:" + driver.getPageSource());
        //Acquiring Email element clicking in the field and inputting email in the field
        driver.findElement(By.name("user[email]")).sendKeys("AB@Gmail.com");
        //Acquiring Password element clicking in the field and inputting password in the field
        driver.findElement(By.name("user[password]")).sendKeys("A1B2C");
        //closing driver
        driver.close();
    }
}
