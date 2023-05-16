package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.Driver;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();

    @Given("Login to the admin panel")
    public void login_to_the_admin_panel() {
        Driver.getDriver().get("https://qa.heallifehospital.com/site/login");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("inci.cakmak.admin@heallifehospital.com");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys("heallife123");
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Then("Click the Billing window")
    public void click_the_billing_window() {
        adminPage.admin_Billing.click();
    }

    @Then("Test that Single Module Billing and OPDIPD Billing Through Case Id are visible")
    public void test_that_single_module_billing_and_opdipd_billing_through_case_id_are_visible() {
        Assert.assertTrue(adminPage.admin_Billing_SingleModuleBilling.isDisplayed());
        Assert.assertTrue(adminPage.admin_Billing_OpdIpdBillingThroughCaseId.isDisplayed());
    }

    @Then("Click the OPD board")
    public void click_the_opd_board() {
        adminPage.admin_Billing_OPD.click();
    }

    @Then("Test that OPD Billing List titles are visible")
    public void test_that_opd_billing_list_titles_are_visible() {
        String actualName = adminPage.admin_Billing_OPD_Name.getText();
        String expectedName = "Name";
        Assert.assertEquals(actualName,expectedName);
        String actualPatientId = adminPage.admin_Billing_OPD_PatientId.getText();
        String expectedPatientId = "Patient Id";
        Assert.assertEquals(actualPatientId,expectedPatientId);
        String actualGuardianName = adminPage.admin_Billing_OPD_GuardianName.getText();
        String expectedGuardianName = "Guardian Name";
        Assert.assertEquals(actualGuardianName,expectedGuardianName);
        String actualGender = adminPage.admin_Billing_OPD_Gender.getText();
        String expectedGender = "Gender";
        Assert.assertEquals(actualGender,expectedGender);
        String actualPhone = adminPage.admin_Billing_OPD_Phone.getText();
        String expectedPhone = "Phone";
        Assert.assertEquals(actualPhone,expectedPhone);
        String actualConsultant = adminPage.admin_Billing_OPD_Consultant.getText();
        String expectedConsultant = "Consultant";
        Assert.assertEquals(actualConsultant,expectedConsultant);
        String actualLastVisit = adminPage.admin_Billing_OPD_LastVisit.getText();
        String expectedLastVisit = "Last Visit";
        Assert.assertEquals(actualLastVisit,expectedLastVisit);
        String actualTotalRecheckup = adminPage.admin_Billing_OPD_TotalRecheckup.getText();
        String expectedTotalRecheckup = "Total Recheckup";
        Assert.assertEquals(actualTotalRecheckup,expectedTotalRecheckup);

    }

    @Then("Test that SearchTextBox is visible")
    public void test_that_search_text_box_is_visible() {

        Assert.assertTrue(adminPage.admin_Billing_OPD_SearchTextBox.isDisplayed());
    }

}
