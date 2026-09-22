package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1Steps {
    ChromeDriver chromeDriver;
    @Given("Chrome Driver object is needed")
    public void chrome_driver_object_is_needed() {
        // Write code here that turns the phrase above into concrete actions
        chromeDriver = new ChromeDriver();
    }
    @When("Enter username")
    public void enter_username() {
        // Write code here that turns the phrase above into concrete actions
        chromeDriver.navigate().to("http://localhost:3010");
        chromeDriver.findElement(By.name("u")).sendKeys("admin");
    }
    @When("Enter password")
    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
        chromeDriver.findElement(By.name("p")).sendKeys("admin");
    }
    @When("press enter")
    public void press_enter() {
        // Write code here that turns the phrase above into concrete actions
        chromeDriver.findElement(By.name("p")).sendKeys(Keys.ENTER);
    }
    @Then("Assert received string")
    public void assert_received_string() {
        // Write code here that turns the phrase above into concrete actions
        Boolean val = chromeDriver.getPageSource().contains("Login successful");
        assertEquals(true,val);
    }

}
