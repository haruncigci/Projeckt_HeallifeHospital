package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class HomepageStepdefinition {

    HomePage homePage=new HomePage();

//================================TC01===================================
    @Given("Type homeUrl in the Address Bar and press enter.")
    public void type_HttpsWwwHeallifehospitalComInTheAddressBarAndPressEnter() {
        Driver.getDriver().get(ConfigReader.getProperty("homeUrl"));
    }
    @And("Closed the browser")
    public void closedTheBrowser() {
        Driver.getDriver().close();
    }

    @Given("Go to homeUrl")
    public void goToHomeUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("homeUrl"));
    }

    @And("Detect if the page is visible")
    public void detectIfThePageIsAccessible() {
        Assert.assertTrue(homePage.homePage_Healife_TExt.isDisplayed());
    }

    @Then("Detect existing Insurance Plans board")
    public void detectExistingInstruncePlansBoard() {
        Assert.assertTrue(homePage.homePage_InsurancePlans_Visible.isDisplayed());
    }

    @Then("Detect existing Pediatric Services board")
    public void detectIfYouHaveAPediatricServicesBoard() {
        Assert.assertTrue(homePage.homePage_PediatricServices_Visible.isDisplayed());
    }

    @Then("Detect the presence of the Lab Testing board")
    public void detectThePresenceOfTheLapTestingBoard() {
        Assert.assertTrue(homePage.homePage_LabTesting_Visible.isDisplayed());
    }

    @Then("Detect existing Opening Hours board")
    public void detectExistingOpeningHoursBoard() {
        Assert.assertTrue(homePage.homePage_OpeningHours_Visible.isDisplayed());
    }

    @And("Closse Browser")
    public void clossBrowser() {
        Driver.closeDriver();
    }
//========================================= TC02_US_004==================================


    @Then("Detect read more under Insurance Plans board")
    public void detectReadMoreUnderInsurancePlansBoard() {
        homePage.homePage_InsurancePlans_BoardReadMore_Button.click();
        Assert.assertTrue(homePage.home_Page_InsurencePlans_Website_Visible.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Then("Detect read more under Pediatric Services board")
    public void detect_read_more_under_pediatric_services_board() {
       homePage.homePage_Pediatric_Services_BoardReadMoreButton.click();
       Assert.assertTrue(homePage.homePage_pediatric_Servisec_Website_Visible.isDisplayed());
       Driver.getDriver().navigate().back();

    }
    @Then("Detect read more under Lab Testing board")
    public void detect_read_more_under_lab_testing_board() {
        homePage.homePage_Lab_Testing_BoardREadMoreButton.click();
        Assert.assertTrue(homePage.homePage_LabTesting_Website_Visible.isDisplayed());
        Driver.getDriver().navigate().back();
    }
//================================= TC001_US_006================================
    @Then("Detect the title Our Doctors on the homepage")
    public void detectTheTitleOurDoctorsOnTheHomepage() {
        //String expectedTitleOursDoctors="Our Doctors";
        //String actualTitleOursDoctors=Driver.getDriver().getTitle();
        //Assert.assertEquals("Our Doctors is not Found",expectedTitleOursDoctors,actualTitleOursDoctors);
        Assert.assertTrue(homePage.homePage_OurDoctorsTitle_Visible.isDisplayed());
    }

    //Ilk Üc Doctor
    @Then("Detect that ilk {int} Doctors have Photographs, names and surnames and titles in Our Doctors.")
    public void detectThatDoctorsHavePhotographsNamesAndSurnamesAndTitlesInOurDoctors(int arg0) {
        Assert.assertTrue(homePage.homePage_Ourilk3Doctors_Informations.isDisplayed());
    }

    //Son 3 Doktor
    @Then("Detect that son {int} Doctors have Photographs, names and surnames and titles in Our Doctors.")
    public void detectThatSonDoctorsHavePhotographsNamesAndSurnamesAndTitlesInOurDoctors(int arg0) {
        Assert.assertTrue(homePage.homePage_Ourson3Doctors_Informations.isDisplayed());
    }


    @Then("Click Gallery Button")
    public void clickGalleryButton() {
        homePage.homePageGalleryButton.click();
    }

    @Then("View Galery Page")
    public void viewGaleryPage() {
    Assert.assertTrue(homePage.homePageGalleryVisible.isDisplayed());
    }

    //=============================================TC_02>>US_013================================
    @Then("Click the Gallery Button")
    public void click_the_gallery_button() {
        homePage.homePageGalleryButton.click();
        homePage.GalleryHealtWellnessButton.click();
        Assert.assertTrue(homePage.GalleryHealtWellnessVisible.isDisplayed());


    }
    @Then("Click the button of Health & Wellnes and see the page is visible,exit back")
    public void click_the_button_of_health_wellnes_and_see_the_page_is_visible_exit_back() {

    }
    @Then("Click on the Hospitals and Directions button and see the page appear, exit back")
    public void click_on_the_hospitals_and_directions_button_and_see_the_page_appear_exit_back() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click on Specialties Button and see the page is visible, exit back")
    public void click_on_specialties_button_and_see_the_page_is_visible_exit_back() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click the Recreation Center button and see the page is visible, exit back")
    public void click_the_recreation_center_button_and_see_the_page_is_visible_exit_back() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click on Your Health button and see the page is visible, exit back")
    public void click_on_your_health_button_and_see_the_page_is_visible_exit_back() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click the surgery button and see the page is visible, exit back")
    public void click_the_surgery_button_and_see_the_page_is_visible_exit_back() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
