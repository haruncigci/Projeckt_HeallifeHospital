package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static utilities.ReusableMethods.bekle;

/*
💥Pages Patient
Inci 0-30
Rana 40-100
Kubra 100-150
Gulhayat 150-200
Hasan 200-250
Harun 250-300
Sevgi 300-350
Havva 350-400
 */

public class PatientPage extends  Base {

    //RadiologyButton
    @FindBy (xpath = "(//li[@class='treeview '])[6]")
    public WebElement RadiologyButton;

    //RadiologyPageVisible
    @FindBy (xpath = "//h3[@class='box-title titlefix']")
    public WebElement RadiologyPageVisible;

    @FindBy (xpath = "//th[@aria-label='Reporting Date: activate to sort column ascending']")
    public WebElement RadiologyPageREportingDate_Visible;

    @FindBy(xpath = "(//th[@class='sorting'])[1]")
    public WebElement RadiologyPageBillIDTab_Visible;

    @FindBy(xpath = "(//th[@class='sorting'])[2]")
    public WebElement RadiologyPageCaseID_PatienIDTab_Visible;

    @FindBy(xpath = "(//th[@class='sorting'])[3]")
    public WebElement RadiologyPageReferanceDoktorTAb_Visible;

    @FindBy(xpath = "(//th[@class='sorting'])[4]")
    public WebElement RadiologyPageNoteTab_Visible;

    @FindBy (xpath = "//th[@class='text-right sorting'][1]")
    public WebElement RAdiologyPageAmountTab_Visible;

    @FindBy (xpath = "//th[@class='text-right sorting'][2]")
    public WebElement RAdiologyPagePaid_AmountTab_Visible;

    @FindBy (xpath = "//th[@class='text-right sorting'][3]")
    public WebElement RAdiologyPageBalanceAmountTab_Visible;

    //th[@class='text-right noExport sorting']
    @FindBy(xpath = "//th[@class='text-right noExport sorting']")
    public WebElement RadiologyPageActionTab_Visible;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement RadiologySearchBox_Text_Visible;

























































































































































































































































































































































//==============================HAVVA=======================================
//Homepage --> Login --> username
@FindBy(xpath = "//input[@name='username']")
public WebElement homepage_login_username;

    //Homepage --> Login --> password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement homepage_login_password;

    //Homepage --> Login --> signInButton
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement homepage_login_signinButton;


    //DASHBOARD da aranan başlığın var olup olmadığını verir.
    public boolean dashboard_header_list_bu_basligi_iceriyormu(String baslikismi) {
        boolean sonuc = false;
        List<WebElement> headers = Driver
                .getDriver()
                .findElements(By.xpath("//li[@class='treeview ']"));
        System.out.println(headers);
        List<String> dashboard_headerlist = null;
        for (WebElement each : headers
        ) {
            if (each.getText().equals(baslikismi))
                sonuc = true;
        }
        return sonuc;
    }

    //Patientpage --> Dashboard --> BloodBank
    @FindBy(xpath = "//li[@class='treeview '][8]")
    public WebElement patient_bloodbank_header;


    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Header
    @FindBy(xpath = "//a[@href='#bloodissue']")
    public WebElement patient_blood_issue_header;

    //Patientpage --> Dashboard --> BloodBank --> Blood Issue Part
    @FindBy(xpath = "//div[@id='bloodissue']")
    public WebElement patient_blood_issue_part;


    //Patientpage --> Dashboard --> BloodBank --> Component Issue Header
    @FindBy(xpath = "//a[@href='#activity']")
    public WebElement patient_component_issue_header;

    //Patientpage --> Dashboard --> BloodBank --> Component Issue Part
    @FindBy(xpath = "//div[@id='activity']")
    public WebElement patient_component_issue_part;




    public static boolean profilInfoList(String data){
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//li[@class='list-group-item listnoback']"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        String[] liste = data.split(", ");
        int count = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).contains(liste[i])) {
                    count++;
                }
            }
        }
        /*System.out.println(count);
        System.out.println(liste.length);
        System.out.println(baslikListesiActual);
        System.out.println(Arrays.toString(liste));

         */


        if (count == liste.length) {
            return true;
        }
        return false;
    }


    //sayfalarda istenen başlıkların varlığını doğrulayan method.Birçok sayfa için bu xpath çalışıyor,
    // çalışmazsa method ismini değiştirip xpathi de değştirerek istenilen sayfada kullanılabilir
    public static boolean verifiesHeadersAreVisibleMethod(String data) {
        List<WebElement> actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th"));
        List<String> baslikListesiActual = new ArrayList<>();
        for (WebElement each : actualList
        ) {
            baslikListesiActual.add(each.getText());
        }
        String[] liste = data.split(", ");
        int count = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < baslikListesiActual.size(); j++) {
                if (baslikListesiActual.get(j).equals(liste[i])) {
                    count++;
                }
            }
        }
        /*System.out.println(count);
        System.out.println(liste.length);
        System.out.println(baslikListesiActual);
        System.out.println(Arrays.toString(liste));

         */
        if (count == liste.length) {
            return true;
        }
        return false;
    }

    public static boolean StringListSortTest(int sutunNo) {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']")));
        bekle(3);
        select.selectByVisibleText("All");
        bekle(3);
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th[" + sutunNo + "]"));
        baslik.click();
        bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().toLowerCase().replaceAll("\\d", "").replace(".", " "));
        }
        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        System.out.println(ActualStringList);
        System.out.println(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;


    }

    public static boolean TarihListSiralamaTesti(int sutunNo) throws java.text.ParseException {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']")));
        bekle(3);
        select.selectByVisibleText("All");
        bekle(3);
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr[1]//th[" + sutunNo + "]"));
        baslik.click();

        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm a", Locale.ENGLISH);

        List<LocalDateTime> tarihler=new ArrayList<>();
        for (WebElement each:ActualList
        ) {
            String data=each.getText();
            LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
            tarihler.add(dateTime);
        }


        int sayi=0;

        for (int i = 0; i <tarihler.size()-1 ; i++) {
            sayi=tarihler.get(i).compareTo(tarihler.get(i+1));
            if (sayi>0){
                return false;
            }

        }


        return true;
    }

    public static boolean intListSortTest(int sutunNo) {
        WebElement baslik = Driver.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[" + sutunNo + "]"));
        baslik.click();
        ReusableMethods.bekle(3);
        List<WebElement> ActualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[" + sutunNo + "]"));

        List<String> ActualStringList = new ArrayList<>();
        for (WebElement each : ActualList
        ) {
            ActualStringList.add(each.getText().replaceAll("[^\\d]", ""));
        }
        System.out.println(ActualStringList);


        List<String> ExpectedList = new ArrayList<>(ActualStringList);
        Collections.sort(ExpectedList);
        if (ActualStringList.equals(ExpectedList)) {
            return true;
        }
        return false;

    }

}
