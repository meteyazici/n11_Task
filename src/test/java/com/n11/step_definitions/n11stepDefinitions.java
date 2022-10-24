package com.n11.step_definitions;

import com.n11.AccountInformation.accountInformation;
import com.n11.pages.N11webElementsPages;
import com.n11.utilities.Driver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class n11stepDefinitions {

        N11webElementsPages n11webElementsPages = new N11webElementsPages();
        accountInformation accountInformation = new accountInformation();
        Actions actions = new Actions(Driver.getDriver());
        TakesScreenshot srcShot = ((TakesScreenshot) Driver.getDriver());
        Scenario scenario ;

        @AfterStep
    public void screenShot(Scenario scenario){
        byte [] screenshotAs = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshotAs,"image/png","ScreenShot");
    }


    @Given("N11 website opens")
    public void n11_website_opens() throws InterruptedException  {
        Driver.getDriver().get("https://www.n11.com/");
        Thread.sleep(2000);
        n11webElementsPages.acceptCokkie.click();
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() throws InterruptedException {
        Thread.sleep(1000);
        n11webElementsPages.loginButton.click();

    }
    @Then("user should see login page")
    public void user_should_see_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Giriş"));

    }
    @When("user enters username")
    public void user_enters_username() {
       n11webElementsPages.userNameBox.sendKeys(accountInformation.getUserName());
    }
    @When("user enters password")
    public void user_enters_password() {
        n11webElementsPages.passwordBox.sendKeys(accountInformation.getPassword(),Keys.ENTER);
    }
    @Then("user should see homepage")
    public void user_should_see_homepage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("n11 - Hayat"));
    }
    @When("user enters {string} keyword on the search box")
    public void user_enters_keyword_on_the_search_box(String model) throws InterruptedException {
        n11webElementsPages.searchBox.sendKeys(model, Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("user should see search result page")
    public void user_should_see_search_result_page() {
       Driver.getDriver().getTitle();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Iphone"));
    }
    @When("user goes to page2")
    public void user_goes_to_page2() {
        JavascriptExecutor Scrool = (JavascriptExecutor) Driver.getDriver();
        Scrool.executeScript("arguments[0].scrollIntoView(true);", n11webElementsPages.lastElementOfFirstPage );
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Scrool.executeScript("window.scrollBy(0,100)");
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }
    @When("user enter the third element on the second page")
    public void user_goes_to_third_element_on_the_second_page() {
        actions.moveToElement(n11webElementsPages.thirdElementonPageSecond);
    }
    @When("user click to favorite button on the element")
    public void user_click_to_favorite_button_on_the_element()  {
        n11webElementsPages.addToFavorite.click();

        try {
        n11webElementsPages.alertAccept.click();
        }catch (NoSuchElementException e){
            System.out.println("Favorilerde yok");
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @When("user goes to my favorites button in my account button")
    public void user_goes_to_my_favorites_button_in_my_account_button() throws InterruptedException {
        actions.moveToElement(n11webElementsPages.userMenu).build().perform();

    }
    @When("user click to favorites button")
    public void user_click_to_favorites_button()  throws InterruptedException {

        try {
            Thread.sleep(2000);
            n11webElementsPages.clickToFavoritesAndLists.click();
        } catch (NoSuchElementException e) {
            System.out.println("******");
        }
    }
    @Then("user should see My favorites page")
    public void user_should_see_my_favorites_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Listem"));
    }
    @When("user clik to My favorites are")
    public void user_clik_to_my_favorites_are() {
        n11webElementsPages.clicktoMyFavorites.click();
    }
    @When("user click to delete button under the add cart word")
    public void user_click_to_delete_button_under_the_add_cart_word() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        n11webElementsPages.deleteButton.click();
        Thread.sleep(2000);
        n11webElementsPages.deleteCokkieAccept.click();
    }
    @Then("user should't see the last deleted Iphone")
    public void user_should_t_see_the_ıphone() {
        System.out.println("Take screen shoot");
    }
    @When("user goes to my account tab")
    public void user_goes_to_my_account_tab() throws InterruptedException {
        Thread.sleep(2000);
        actions.moveToElement(n11webElementsPages.userMenu).build().perform();
    }
    @When("user click to exit button")
    public void user_click_to_exit_button() throws InterruptedException {
        try {
            Thread.sleep(2000);
            n11webElementsPages.logOutButton.click();
            Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (ElementNotInteractableException e) {
            System.out.println("******");
        }

    }
    @AfterAll
    public static void afterFeature(){
        Driver.closeDriver();
    }


}
