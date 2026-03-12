package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class HomePage {

    By loginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    By productsBtn = By.xpath("//a[contains(text(),'Products')]");

    public void clickLogin() {
        BaseTest.driver.findElement(loginBtn).click();
    }

    public void goToProducts() {
        BaseTest.driver.findElement(productsBtn).click();
    }
}