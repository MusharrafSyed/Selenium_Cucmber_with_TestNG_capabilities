package StepDefinition;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    WebDriver driver = null;

    @Given("user enables the feature flags")
    public void setupfeatureFlags(DataTable table){
        /*List<String> flags= table.asList();
        for(String s : flags){
            System.out.println("Flag name is " +s);
        }
        */
        List<List<String>> flags = table.asLists();

         for(List<String> row : flags){
             for(String cell : row) {
                 System.out.println(cell + "\t");
             }
             System.out.println();
         }
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @When("User enters username {string} and passoword {string}")
    public void user_enters_username_and_password(String username, String passoword) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(passoword);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User should be on home screen")
    public void user_should_be_on_home_screen() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(expectedUrl, currentUrl);
    }

}
