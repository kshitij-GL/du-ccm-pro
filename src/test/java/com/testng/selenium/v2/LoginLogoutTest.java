package com.testng.selenium.v2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginLogoutTest {
    WebDriver driver;
    String baseUrl = "http://localhost/loginpage/";
    String username = "kshitij";
    String password = "abcd";

    @BeforeTest
    @Parameters({ "browser" })
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kshitij.1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
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
      //  String expectedTitle = "Welcome to Instagram.com";
      //  String actualTitle = driver.getTitle();
      //  Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2)
    public void logoutTest() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
    }
        
  //  @AfterTest()
  //  Run | Debug
 //  public void userregister() throws InterruptedException {
    	
    //driver.get("https://www.instagram.com/accounts/emailsignup/");
    //    driver.findElement(By.name("Mobile Number or Email")).sendKeys("imkshitij9.58@gmail.com");
     //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[3]/div/label/span")).click();

    //  driver.findElement(By.name("Fullname")).sendKeys("Kshitij");
      //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[4]/div/label/input")).click();

    //    driver.findElement(By.name("Username")).sendKeys("kshitij958");
     // driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[5]/div/label/input")).click();

        
    //   driver.findElement(By.name("Password")).sendKeys("abcde");
      // driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[6]/div/label/input")).click();



        // Fill out the registration form fields
      //  WebElement emailField = driver.findElement(By.name("Mobile Number or Email"));
   //     emailField.sendKeys("imkshitij9.58@gmail.com");
      //  WebElement fullnameField = driver.findElement(By.name("Fullname"));
      //  fullnameField.sendKeys("Kshitij");
      //  WebElement usernameField = driver.findElement(By.name("Username"));
     //   usernameField.sendKeys("kshitij9.58");
     //   WebElement passwordField = driver.findElement(By.name("Password"));
     //   passwordField.sendKeys("12345678");

        // Submit the registration form
       // WebElement registerButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div[7]/div/button"));
      //  registerButton.click();

        // Check if registration was successful
   //     if (driver.getCurrentUrl().equals("https://www.instagram.com/dashboard")) {
   //         System.out.println("Registration successful!");
   //     } else {
    //        System.out.println("Registration failed!");
       // }

        // Close the WebDriver
        

   // }
    }



    
     //   String expectedTitle = "Login | Instagram.com";
     //   String actualTitle = driver.getTitle();
     //   Assert.assertEquals(actualTitle, expectedTitle);
    



