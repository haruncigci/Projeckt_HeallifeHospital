package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*


Pages Admin
Talha 0-150
Inci 150-250
Serife 250-350
Rana 350-450
Harun 450-500
Kubra 500-550
Gulhayat 550-600

 */



public class AdminPage extends  Base {

    @FindBy(xpath = "//span[normalize-space()='Billing']")
    public WebElement admin_Billing;

    @FindBy(xpath = "//h3[normalize-space()='Single Module Billing']")
    public WebElement admin_Billing_SingleModuleBilling;

    @FindBy(xpath = "//h3[normalize-space()='OPD/IPD Billing Through Case Id']")
    public WebElement admin_Billing_OpdIpdBillingThroughCaseId;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/admin/bill/opd']")
    public WebElement admin_Billing_OPD;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/admin/bill/pathology']")
    public WebElement admin_Billing_Pathology;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/admin/bill/radiology']")
    public WebElement admin_Billing_Radiology;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/admin/bill/issueblood']")
    public WebElement admin_Billing_BloodIssue;

    @FindBy(xpath = "//a[@href='https://qa.heallifehospital.com/admin/bill/issuecomponent']")
    public WebElement admin_Billing_BloodComponentIssue;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement admin_Billing_OPD_SearchTextBox ;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[1]")
    public WebElement admin_Billing_OPD_Name;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public WebElement admin_Billing_OPD_PatientId;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement admin_Billing_OPD_GuardianName;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[4]")
    public WebElement admin_Billing_OPD_Gender;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[5]")
    public WebElement admin_Billing_OPD_Phone;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[6]")
    public WebElement admin_Billing_OPD_Consultant;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[7]")
    public WebElement admin_Billing_OPD_LastVisit;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[8]")
    public WebElement admin_Billing_OPD_TotalRecheckup;

}
