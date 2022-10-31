package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {

    WebDriver driver=null;
    loginPage login;


    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("open browser");
        String projectPath=System.getProperty("user.dir");
        System.out.println("project path is : "+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }
    @And("user clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
//         driver.findElement(By.id("login")).click();
    }
    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username,String password) throws InterruptedException {
        login=new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }


    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        login.checkLogOutlsDisplayed();
//        driver.findElement(By.id("logout")).isDisplayed();
        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
    }
}
