package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DoctorStepdefinition {
    DoctorPage doctorPage=new DoctorPage();

    @Given("Logins to the doctor panel")
    public void login_to_the_doctor_panel() {
        Driver.getDriver().get(ConfigReader.getProperty("doctorUrl"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(ConfigReader.getProperty("doctorSumeyyeUsername"));
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(ConfigReader.getProperty("validPassword"));
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER).perform();
    }


    @Then("Clicks the IPD window")
    public void clickTheIPDWindow() {doctorPage.doctor_dashboard_IPD.click();}

    @And("Verifies that it is seen the IPD patient window")
    public void verifies_That_It_Is_Seen_The_IPDPatientWindow() {
        String expected_Result="IPD Patient";
        Assert.assertEquals(expected_Result,doctorPage.doctor_dashboard_IPD_PatientWindow.getText());
    }

    @And("Closes the browser")
    public void closesTheBrowser() {
        Driver.closeDriver();

    }
}
