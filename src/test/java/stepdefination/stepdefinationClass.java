package stepdefination;

import hooks.hooksclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinationClass {

    WebDriver driver= hooksclass.driver;

    @Given("User navigates to elearning registration page")
    public void user_navigates_to_elearning_registration_page() {
        System.out.println("user is navigating to the elearning registration page");
        driver.get("http://elearningm1.upskills.in/index.php");
        driver.findElement(By.xpath("//a[@href=\"http://elearningm1.upskills.in/main/auth/inscription.php\"]")).click();
        driver.findElement(By.name("firstname")).sendKeys("abc");
        driver.findElement(By.name("lastname")).sendKeys("xyz");
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("username")).sendKeys("practice_123");
        driver.findElement(By.id("pass1")).sendKeys("practice_pass");
        driver.findElement(By.id("pass2")).sendKeys("practice_pass");
        driver.findElement(By.name("submit")).click();
    }

    @When("user enters the required details")
    public void user_enters_the_required_details() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user Signed up successfully")
    public void user_Signed_up_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("User navigates to elearning login page")
    public void user_navigates_to_elearning_login_page() {
        driver.get("http://elearningm1.upskills.in/index.php");
        driver.findElement(By.id("login")).sendKeys("practice_123");
        driver.findElement(By.id("password")).sendKeys("practice_pass");
        driver.findElement(By.name("submitAuth")).click();
        driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("abc");
        driver.findElement(By.name("title")).sendKeys("testing");
        driver.findElement(By.name("compose")).click();


    }

    @When("user enters the credentials")
    public void user_enters_the_credentials() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user logged in successfully")
    public void user_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
}