package SetUp;

import PageObject.DashboardPage;
import PageObject.SignInpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends SignInpageTest {
    public DashboardPageTest(WebDriver driver) {
    }

    @Test(priority = 2)
    public void testLoginPopup() throws InterruptedException {
        Thread.sleep(3000);
        DashboardPage.verifySignInPopup();
    }

    @Test(priority = 3)
    public void assertPageURL() throws InterruptedException {
        String URL = "https://www.konga.com/";
        Assert.assertEquals(DashboardPage.driver.getCurrentUrl(), URL, "You are not on login page");
        Thread.sleep(4000);
    }


    @Test(priority = 4)
    public void assertName() throws InterruptedException {
        DashboardPage.clickMyAccount();
        Thread.sleep(8000);
        if (DashboardPage.driver.getPageSource().contains("Oluwatosin")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test (priority = 5)
    public void getPageTitle() throws InterruptedException{



        DashboardPage.clickCategoriesBtn();
        String pageTitle = DashboardPage.driver.getTitle();
        System.out.println("PageTitle is " +pageTitle);
    }



    @Test(priority = 6)
    public void assert5Items() throws InterruptedException {
        Thread.sleep(20000);

        //Find if element contains Notebooks
        if (DashboardPage.driver.getPageSource().contains("Notebooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Hybrid Computers
        if (DashboardPage.driver.getPageSource().contains("Hybrid Computers")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Ultrabooks
        if (DashboardPage.driver.getPageSource().contains("Ultrabooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains mini laptops and netbooks
        if (DashboardPage.driver.getPageSource().contains("Mini Laptops and Netbooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Apple MacBooks
        if (DashboardPage.driver.getPageSource().contains("Apple MacBooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }



    @Test(priority = 7)
    public void clickLogout() throws InterruptedException {
        DashboardPage.extraButtons();
        DashboardPage.clickMyAccount();
        Thread.sleep(10000);
        DashboardPage.clickLogout();
        Thread.sleep(15000);
        System.out.println("The logout was successful. Page URL is " + DashboardPage.driver.getCurrentUrl());
    }


}

