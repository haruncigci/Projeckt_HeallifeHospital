package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends  Base {

/*
Pages homepage
Kubra 0-40
Rana 40-80
Harun 80-120
Sevgi 120-160
 */


    //HomePage "Heallife Logo" is Visible
    @FindBy(xpath = "//a[@class='navbar-brand logo']")
    public WebElement homePage_Healife_TExt;

    //homePage_InsurancePlans_Visible
    @FindBy(xpath = "(//h3[@class='he-title'])[1]")
    public WebElement homePage_InsurancePlans_Visible;

    //homePage_PediatricServices_Visible
    @FindBy(xpath = "(//h3[@class='he-title'])[2]")
    public WebElement homePage_PediatricServices_Visible;

    //homePage_LabTesting_Visible
    @FindBy(xpath = "(//h3[@class='he-title'])[3]")
    public WebElement homePage_LabTesting_Visible;

    //HomePage_Opening Hours visible
    @FindBy(xpath = "(//h3[@class='he-title'])[4]")
    public WebElement homePage_OpeningHours_Visible;

    //Homepage  Insurance Plans ReadmoreButton
    @FindBy(xpath = "(//a[@class='morebtn'])[1]")
    public WebElement homePage_InsurancePlans_BoardReadMore_Button;

    //HomePage_Pediatric Services ReadmoreButton
    @FindBy(xpath = "(//a[@class='morebtn'])[2]")
    public WebElement homePage_Pediatric_Services_BoardReadMoreButton;

    //HomePage_Lab_Testing ReadmoreButton
    @FindBy(xpath = "(//a[@class='morebtn'])[3]")
    public WebElement homePage_Lab_Testing_BoardREadMoreButton;

    //Homepage  Insurance Plans REadMore Website is Visible
    @FindBy(xpath = "//img[@class='img-responsive']")
    public WebElement home_Page_InsurencePlans_Website_Visible;


    //HomePage_Pediatric Services ReadMore Website is Visible
    @FindBy(xpath = "//span[@style='box-sizing: border-box; font-weight: 700;']")
    public WebElement homePage_pediatric_Servisec_Website_Visible;

    //HomePage_LAp_Testing ReadMore Website is Visible
    @FindBy(xpath = "(//span[@style='box-sizing: border-box; font-weight: 700;'])[1]")
    public WebElement homePage_LabTesting_Website_Visible;

    @FindBy(xpath = "(//a[@title='Read More'])[1]")
    public WebElement homePage_ReadMore_Insurance;

    @FindBy(xpath = "(//a[@title='Read More'])[2]")
    public WebElement homePage_ReadMore_PediatricServices;

    @FindBy(xpath = "(//a[@title='Read More'])[3]")
    public WebElement homePage_LAb_TestingReadMore;

    //homePage_OurDoctorsTitle_Visible
    @FindBy(xpath = "(//h2[@style='text-align: center;'])[2]")
    public WebElement homePage_OurDoctorsTitle_Visible;

    //homePage_Ourilk3Doctors_Informations
    @FindBy (xpath = "(//div[@class='row text-center'])[2]")
    public WebElement homePage_Ourilk3Doctors_Informations;

    //homePage_Ourson3Doctors_Informations
    @FindBy (xpath = "(//div[@class='row text-center'])[3]")
    public WebElement homePage_Ourson3Doctors_Informations;


    //homePageGalleryButton
    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[normalize-space()='Gallery']")
    public WebElement homePageGalleryButton;


    @FindBy(xpath = "//h2[normalize-space()='Gallery']")
    public WebElement homePageGalleryVisible;

    @FindBy (xpath = "//h3[normalize-space()='Health & Wellness']")
    public WebElement GalleryHealtWellnessButton;

    @FindBy(xpath = "//h1[normalize-space()='Health & Wellness']")
    public WebElement GalleryHealtWellnessVisible;









}
