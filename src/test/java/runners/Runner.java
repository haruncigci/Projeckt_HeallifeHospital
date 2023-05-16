

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html",  //raporlama icin bu satiri ekledik
                "json:target\\json-reports\\cucumber.json",  //bu satirla da json formatinda rapor yazar
                //bu raporlari devoloper lar isteyebilir
                "junit:target\\xml-report\\cucumber.xml"},//bu satirla da xml formatinda rapor yazar
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false


)

public class Runner {


}