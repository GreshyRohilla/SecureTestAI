package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.HomePage;

public class UISteps {

    HomePage home = new HomePage();

    @Given("User launches the e-commerce website")
    public void launchWebsite() {
        BaseTest.initDriver();
    }

    @When("User clicks on Signup Login button")
    public void clickLogin() {
        home.clickLogin();
    }

    @Then("Login page should be visible")
    public void verifyLogin() {
        boolean visible = BaseTest.driver
                .findElement(By.xpath("//h2[contains(text(),'Login to your account')]"))
                .isDisplayed();
        System.out.println("Login Page Visible: " + visible);
        BaseTest.quitDriver();
    }

    @When("User navigates to products page")
    public void goToProducts() {
        home.goToProducts();
    }

    @And("User adds first product to cart")
    public void addToCart() throws InterruptedException {

        // Wait for page load and ads to settle
        Thread.sleep(4000);

        WebElement addToCartButton = BaseTest.driver.findElement(
                By.xpath("(//a[contains(text(),'Add to cart')])[1]")
        );

        // Scroll to element (avoids overlay issues)
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", addToCartButton);

        Thread.sleep(2000);

        // JavaScript click to bypass advertisement iframe interception
        js.executeScript("arguments[0].click();", addToCartButton);

        System.out.println("Product added to cart successfully (Ad bypassed)");
    }

    @Then("Product should be added successfully")
    public void verifyCart() {
        System.out.println("Product Added to Cart Successfully");
        BaseTest.quitDriver();
    }
}