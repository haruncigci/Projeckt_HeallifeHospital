package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorPage extends  Base {
    @FindBy (xpath = "(//a[@href='https://qa.heallifehospital.com/admin/patient/ipdsearch'])[1]")
    public WebElement doctor_dashboard_IPD;

    @FindBy (xpath = "//h3[@class='box-title titlefix']")
    public WebElement doctor_dashboard_IPD_PatientWindow;



}
