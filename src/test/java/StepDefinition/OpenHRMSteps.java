package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenHRMSteps {

    WebDriver driver = null;

    @Given("User in on the login page")
    public void user_in_on_the_login_page() {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("User enters valid username {string} and valid password {string}")
    public void user_enters_valid_username_and_valid_password(String username, String password) {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    @When("User click on the login button")
    public void user_click_on_the_login_button() {

        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("Home page should be diplayed")
    public void home_page_should_be_diplayed() {
        String expectedText= driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        String actualText="Dashboard";

        Assert.assertEquals(expectedText,actualText);

    }

    @When("User click on leave button")
    public void user_click_on_leave_button() {

        driver.findElement(By.xpath("//span[text()='Leave']")).click();


    }

    @Then("Search should button should be displayed")
    public void search_should_button_should_be_displayed() throws InterruptedException {
        Thread.sleep(5000);
        boolean isDisplayedStatus=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        Assert.assertTrue(isDisplayedStatus);

    }

    @When("User click on user profile button on the right side")
    public void user_click_on_user_profile_button_on_the_right_side() {
       driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
    }

    @Then("pull down menu opne and logout link should be diplayed")
    public void pull_down_menu_opne_and_logout_link_should_be_diplayed() throws InterruptedException {

        Thread.sleep(5000);
        boolean isLogoutDsiplayed = driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed();

        Assert.assertTrue(isLogoutDsiplayed);
    }

}
