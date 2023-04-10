package coursesultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CourseUltimateQaMultiBrowser {
    //Declaring global Variable
    static String browser = "Firefox";
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        //Declaring if else method to open browser as per input
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver =new FirefoxDriver();
        }else {
            System.out.println("Incorrect Browser type");
        }
        //After browser opens ensure it opens to the size of screen
        driver.manage().window().maximize();
        // Open URL using get method
        driver.get(baseUrl);
        //Printing Title of the page
        System.out.println(driver.getTitle());
        //Print Current URL
        System.out.println(" Current URL :" + driver.getCurrentUrl());
        //Print page source
        System.out.println(" Page Source :" + driver.getPageSource());
        //Locating Username clicking it and inputting email address
        driver.findElement(By.name("user[email]")).sendKeys("AB@Gmail.com");
        //Locating Password clicking it and inputting Password
        driver.findElement(By.name("user[password]")).sendKeys("ABC");
        //Closing driver
        driver.close();
    }
}



