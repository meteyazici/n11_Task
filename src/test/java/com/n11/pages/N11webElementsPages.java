package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11webElementsPages {

    public N11webElementsPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[@class='btnSignIn']")
    public WebElement loginButton;

    @FindBy (xpath = "//span[.='Tümünü Kabul Et']")
    public WebElement acceptCokkie;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = " //input[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@data-position='24']")
    public WebElement lastElementOfFirstPage;

    @FindBy(xpath = "//div[@data-position='27']")
    public WebElement thirdElementonPageSecond;

    @FindBy(xpath = "(//div[@data-position='27']//span)[1]")
    public WebElement addToFavorite;

    @FindBy(xpath = "//span[@class='closeBtn']")
    public WebElement alertAccept;

    @FindBy(xpath = "//a[@class='user']")
    public WebElement userMenu;

    @FindBy(xpath = "//a[.='Favorilerim / Listelerim']")
    public WebElement clickToFavoritesAndLists;

    @FindBy(xpath = "(//h4[@class='listItemTitle'])[1]")
    public WebElement clicktoMyFavorites;

    @FindBy(xpath = "(//span[@class='deleteProFromFavorites'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement deleteCokkieAccept;

    @FindBy(xpath = "//a[@class='logoutBtn']")
    public WebElement logOutButton;





}
