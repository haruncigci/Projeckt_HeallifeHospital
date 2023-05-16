package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.ParseException;

public class PatientStepdefinition {


    /*

    git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/incicakmak/com.heallifehospital.git
git push -u origin main

     */

    //=====================HAVVA==================================
    PatientPage patientPage = new PatientPage();
    @Given("user goes to patient login page")
    public void go_patient_login_page(){
        Driver.getDriver().get(ConfigReader.getProperty("patientUrl"));
    }

    @Then("The patient logs in with {string} and {string}.")
    public void the_patient_logs_in_with_valid_username_and_password(String username, String password) {
        patientPage.homepage_login_username.sendKeys(username);
        patientPage.homepage_login_password.sendKeys(password);
        patientPage.homepage_login_signinButton.click();

    }
    @Then("It is Verified that there is a {string} heading in the dashboard sidebar on the user page.")
    public void verify_dashboard_contains_header(String str) {
        Assert.assertTrue(patientPage.dashboard_header_list_bu_basligi_iceriyormu(str));
        System.out.println(str);

    }
    @Then("Blood Bank heading is clicked.")
    public void blood_bank_heading_is_clicked() {
        patientPage.patient_bloodbank_header.click();
    }
    @Then("the Blood Bank page has been reached is verified")
    public void the_blood_bank_page_has_been_reached_is_verified() {
        Assert.assertTrue(patientPage.patient_blood_issue_part.isDisplayed());
    }
    @Then("page is closed.")
    public void page_is_closed() {
        Driver.quitDriver();
    }


    @Then("Verifies that {string} is displayed.")
    public void verifiesThatIsDisplayed(String data) {

        Assert.assertTrue(patientPage.profilInfoList(data));
    }

    @Then("verifies that Blood Issue heading is visible.")
    public void verifiesThatBloodIssueHeadingIsVisible() {
        Assert.assertTrue(patientPage.patient_blood_issue_header.isDisplayed());
    }

    @Then("verifies that Component Issue heading is visible.")
    public void verifiesThatComponentIssueHeadingIsVisible() {
        Assert.assertTrue(patientPage.patient_component_issue_header.isDisplayed());
    }


    @Then("clicks to Component Issue header.")
    public void clicksToComponentIssueHeader() {
        patientPage.patient_component_issue_header.click();
    }


    @Then("verifies that Component Issue part is displayed.")
    public void verifiesThatComponentIssuePartIsDisplayed() {
        Assert.assertTrue(patientPage.patient_component_issue_part.isDisplayed());
    }

    @Then("clicks to Blood Issue header.")
    public void clicksToBloodIssueHeader() {
        patientPage.patient_blood_issue_header.click();
    }

    @Then("verifies that Blood Issue part is displayed.")
    public void verifiesThatBloodIssuePartIsDisplayed() {
        Assert.assertTrue(patientPage.patient_blood_issue_part.isDisplayed());
    }

    @Then("Verifies {string} headers are visible.")
    public void verifiesHeadersAreVisible(String data) {
        Assert.assertTrue(patientPage.verifiesHeadersAreVisibleMethod(data));
    }

    //

    @Then("Verifies sorting could be done for headers")
    public void verifiesSortingCouldBeDoneForHeaders() throws ParseException {
        Assert.assertTrue(patientPage.StringListSortTest(1));//BillNo
        Assert.assertTrue(patientPage.TarihListSiralamaTesti(2));//Issue Date
        Assert.assertTrue(patientPage.StringListSortTest(6));//Donor Name
        Assert.assertTrue(patientPage.intListSortTest(8));//Amount
        Assert.assertTrue(patientPage.intListSortTest(9));//Paid Amount
        Assert.assertTrue(patientPage.intListSortTest(10));//Balance Amount

    }

    //====================================== TC_01>>>US_027==========================================
    @Given("Go to patientUrl")
    public void go_to_patient_url() {
        Driver.getDriver().get(ConfigReader.getProperty("patientUrl"));
    }
    @Then("Enter Username,Passwort and Click Sign in")
    public void enter_username_passwort_and_click_sign_in() {
       patientPage.homepage_login_username.sendKeys("harun.cigci");
       patientPage.homepage_login_password.sendKeys("heallife123");
       patientPage.homepage_login_signinButton.click();
    }
    @Then("Click on the Radiology button from the Dashboard")
    public void click_on_the_radiology_button_from_the_dashboard() {
        patientPage.RadiologyButton.click();

    }
    @Then("See the Radiology page open")
    public void see_the_radiology_page_open() {
        Assert.assertTrue(patientPage.RadiologyPageVisible.isDisplayed());
    }
    //====================================TC_02>>US_027==============================================
    @Then("On the Radiology Test Reports List page \\(Bill No, Case ID,..) are visible")
    public void onTheRadiologyTestReportsListPageBillNoCaseIDAreVisible() {
        Assert.assertTrue(patientPage.RadiologyPageBillIDTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageActionTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageCaseID_PatienIDTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageREportingDate_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageReferanceDoktorTAb_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageNoteTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RAdiologyPageAmountTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RAdiologyPagePaid_AmountTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RAdiologyPageBalanceAmountTab_Visible.isDisplayed());
        Assert.assertTrue(patientPage.RadiologyPageActionTab_Visible.isDisplayed());
    }


    @Then("Test that Searchtext Box is Visible")
    public void testThatSearchtextBoxIsVisible() {
      Assert.assertTrue(patientPage.RadiologySearchBox_Text_Visible.isDisplayed());
    }

    @Then("On the Radiology Test Reports List page \\(Bill No, Case ID,..)test that  titles are sorting")
    public void onTheRadiologyTestReportsListPageBillNoCaseIDTestThatTitlesAreSorting() {
        //th[@aria-label='Reporting Date: activate to sort column ascending']
        //th[@aria-label='Reporting Date: activate to sort column descending']
        //th[@aria-label='Action: activate to sort column ascending']
    }
}
