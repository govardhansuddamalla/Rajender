package com.org.project.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by rajender.koyyeda on 25-01-2022.
 */
public class SaucePage {

    public static String price = null;

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOut;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;

    @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement errorMessage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement goToCart;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    WebElement itemPrice;

    @FindBy(id = "checkout")
    WebElement checkOut;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueToNext;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    WebElement checkOutPrice;

    @FindBy(id = "finish")
    WebElement finish;

    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement successMessage;


    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
    WebElement priceOfFirstProduct;


    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    WebElement priceOfcheckout;

    public String getPriceOfFirstProduct() {
        price = priceOfFirstProduct.getText().trim();
        return price;
    }

    public String getPriceOfCheckoutPage() {
        String priceCheckout = priceOfcheckout.getText().trim();
        return priceCheckout;
    }

    @FindBy(id = "a")
    List<WebElement> mylists;

    WebDriver driver;

    public SaucePage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
        PageFactory.initElements(factory, this);
    }


    public void enterUser(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        login.click();
    }

    public void clickaddtocart() {
        addToCart.click();
    }

    public void clickgotocart() {
        goToCart.click();
    }


    public void clickMenu() {
        menu.click();
    }

    public void clickLogout() {
        logOut.click();
    }

    public String getErrorMessage() {
        String actualError = errorMessage.getText();
        return actualError;
    }

    public String getitemPrice() {
        String actualPrice = itemPrice.getText();
        return actualPrice;
    }

    public void clickCheckout() {
        checkOut.click();
    }

    public void enterFirstname(String fname) {
        firstName.sendKeys(fname);
    }

    public void enterLastname(String lname) {
        lastName.sendKeys(lname);
    }

    public void enterPostalcode(String pcode) {
        postalCode.sendKeys(pcode);
    }

    public void clickcontinue() {
        continueToNext.click();
    }

    public String getcheckoutPrice() {
        String finalPrice = checkOutPrice.getText();
        return finalPrice;
    }

    public void clickFinish() {
        finish.click();
    }

    public String getsuccessMessage() {
        String ThankUmessage = successMessage.getText().trim();
        return ThankUmessage;
    }

}