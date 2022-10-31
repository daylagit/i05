//package org.example;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginDemoSteps {
//    WebDriver driver=null;
//    @And("user clicks on login")
//    public void userClicksOnLogin() {
//
//    }
//
//    @Given("browser is open")
//    public void browserIsOpen() {
//        System.out.println("open browser");
//        String projectPath=System.getProperty("user.dir");
//        System.out.println("project path is : "+projectPath);
//        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//    }
//
//    @And("user is on login page")
//    public void userIsOnLoginPage() {
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @When("user enters (.*) and (.*)$")
//    public void userEntersUsernameAndPassword(String username,String password) {
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
//
//    @Then("user is navigated to the home page")
//    public void userIsNavigatedToTheHomePage() {
//    }
//}
