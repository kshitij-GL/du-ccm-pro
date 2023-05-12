package com.testng.selenium.v2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginLogoutTest {
    private static final String timeout = null;
	WebDriver driver;
    String baseUrl = "http://localhost/loginpage/";
    String username = "kshitij";
    String password = "abcd";

    @BeforeTest
    @Parameters({ "browser" })
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\Users\deepak.varshney\Downloads\chromedriver_win32\chromedriver.exe");
       // driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(5000);

       driver.findElement(By.xpath("/html/body/div/form/button")).click();
      
    }

    @Test(priority = 2)
    public void logoutTest() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
    }
        
   @Test(priority=3)
  // Run | Debug
 public void userregister() throws InterruptedException {
    	
    driver.get("https://www.instagram.com/accounts/emailsignup/");
    Thread.sleep(5000);
        driver.findElement(By.name("emailOrPhone")).sendKeys("imkshitij9.58@gmail.com");
      driver.findElement(By.name("fullName")).sendKeys("Kshitij");
      driver.findElement(By.name("username")).sendKeys("kshitij958");  
       driver.findElement(By.name("password")).sendKeys("abcde");
   }
   
    }
