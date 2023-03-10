package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;

public class AmazonDefinitions {
    AmazonPage amazonPage = new AmazonPage();
    AmazonPage SSO = new AmazonPage();
    Actions actions ;


    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("catchprobe"));
        amazonPage.customername.sendKeys(ConfigReader.getProperty("username"));

        ReusableMethods.waitFor(3);
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);
        amazonPage.Login.click();

        ReusableMethods.waitFor(18);
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "Nutella";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "Java";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = "iphone";
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String actualStr = amazonPage.aramaSonucElementi.getText();
        String expectedStr = istenenKelime;
        Assert.assertTrue(actualStr.contains(expectedStr));
    }

    @Given("kullanici {string} anasayfasinda")//amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("Kullanici {string}  adresine gidilir")
    public void kullaniciAdresineGidilir(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("catchprobe"));
        amazonPage.customername.sendKeys(ConfigReader.getProperty("username"));

        ReusableMethods.waitFor(3);
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(3);
        amazonPage.Login.click();

        ReusableMethods.waitFor(18);
    }



    @When("Kullan??c?? Threatway modul??ne giderAnd Threatway de Statics sayfas??na ula????r")
    public void kullan??c??ThreatwayModul??neGiderAndThreatwayDeStaticsSayfas??naUla????r() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("threatway"));
        String expecteddata=" BAD REPUTATIONS ";
        String actualdata=SSO.Badreputations.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
    }



    @When("SmartDecepitve Deception Operations b??l??m??ne gelir")
    public void smartdecepitveDeceptionOperationsB??l??m??neGelir() {
        ReusableMethods.waitFor(3);
        SSO.DeceptionOperations.click();
        ReusableMethods.scrooltoWebelement(SSO.Refresh);
        ReusableMethods.waitFor(3);
        SSO.Refresh.click();
    }

    @And("SmartDeceptive de zone definitions da status ve ruuning durumlar??n?? kontrol eder")
    public void smartdeceptiveDeZoneDefinitionsDaStatusVeRuuningDurumlar??n??KontrolEder() {
        ReusableMethods.waitFor(3);
        String expecteddata=" ACTIVE ";
        String actualdata=SSO.Smartactive1.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
        String expecteddata2="ACTIVE";
        String actualdata2=SSO.Smartactive2.getText();
        Assert.assertEquals(expecteddata2, actualdata2);
        String expecteddata3="ACTIVE";
        String actualdata3=SSO.Smartactive3.getText();
        Assert.assertEquals(expecteddata3, actualdata3);
        String expecteddata4="ACTIVE";
        String actualdata4=SSO.Smartactive4.getText();
        Assert.assertEquals(expecteddata4, actualdata4);
        String expecteddata5="ACTIVE";
        String actualdata5=SSO.Smartactive5.getText();
        Assert.assertEquals(expecteddata5, actualdata5);
        String expecteddata6="ACTIVE";
        String actualdata6=SSO.Smartactive6.getText();
        Assert.assertEquals(expecteddata6, actualdata6);
        String expecteddata7="ACTIVE";
        String actualdata7=SSO.Smartactive7.getText();
        Assert.assertEquals(expecteddata7, actualdata7);
        ReusableMethods.scrooltoWebelement(SSO.Smartrunning7);
        String expecteddatar=" RUNNING ";
        String actualdatar=SSO.Smartrunning1.getText();
        Assert.assertTrue(expecteddatar.contains(actualdatar));
        ReusableMethods.scrooltoWebelement(SSO.Smartactive3);
        String expecteddatar2="RUNNING";
        String actualdatar2=SSO.Smartrunning2.getText();
        Assert.assertEquals(expecteddatar2, actualdatar2);
        String expecteddatar3="UNDEFINED MSG";
        String actualdatar3=SSO.Smartrunning3.getText();
        Assert.assertEquals(expecteddatar3, actualdatar3);
        String expecteddatar4="RUNNING";
        String actualdatar4=SSO.Smartrunning4.getText();
        Assert.assertEquals(expecteddatar4, actualdatar4);
        String expecteddatar5="RUNNING";
        String actualdatar5=SSO.Smartrunning5.getText();
        Assert.assertEquals(expecteddatar5, actualdatar5);
        String expecteddatar6="RUNNING";
        String actualdatar6=SSO.Smartrunning6.getText();
        Assert.assertEquals(expecteddatar6, actualdatar6);
        String expecteddatar7="RUNNING";
        String actualdatar7=SSO.Smartrunning7.getText();
        Assert.assertEquals(expecteddatar7, actualdatar7);
    }

    @And("SmartDeceptive de zone definitions da herhangi bir aksakl??k yok")
    public void smartdeceptiveDeZoneDefinitionsDaHerhangiBirAksakl??kYok() {
        String durum="cal??????yor";
        String status=SSO.Smartactive1.getText();
        String running =SSO.Smartrunning3.getText();
        System.out.println("Smartdeceptive de statusler "+status+" ??ekilde ??al????maktad??r "+"\n"
                +" Runninglerde  "+ running + " bulunmaktad??r");
    }

    @And("SmartDeceptive de Honeypot Definitions da status ve ruuning durumlar??n?? kontrol eder")
    public void smartdeceptiveDeHoneypotDefinitionsDaStatusVeRuuningDurumlar??n??KontrolEder() {
        ReusableMethods.scrooltoWebelement(SSO.HoneypotDefinition);
        ReusableMethods.waitFor(3);
        SSO.HoneypotDefinition.click();
        ReusableMethods.waitFor(3);
        String expecteddata=" ACTIVE ";
        String actualdata=SSO.Honeypootactive1.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
        String expecteddata2="ACTIVE";
        String actualdata2=SSO.Honeypootactive2.getText();
        Assert.assertEquals(expecteddata2, actualdata2);
        String expecteddata3="ACTIVE";
        String actualdata3=SSO.Honeypootactive3.getText();
        Assert.assertEquals(expecteddata3, actualdata3);
        ReusableMethods.scrooltoWebelement(SSO.Honeypootrunning3);
        String expecteddatar=" RUNNING ";
        String actualdatar=SSO.Honeypootrunning1.getText();
        Assert.assertTrue(expecteddatar.contains(actualdatar));
        String expecteddatar2="RUNNING";
        String actualdatar2=SSO.Honeypootrunning2.getText();
        Assert.assertTrue(expecteddatar2.contains(actualdatar2));
        String expecteddatar3="RUNNING";
        String actualdatar3=SSO.Honeypootrunning3.getText();
        Assert.assertTrue(expecteddatar2.contains(actualdatar2));
    }

    @And("SmartDeceptive de Honeypot Definitions da herhangi bir aksakl??k yok")
    public void smartdeceptiveDeHoneypotDefinitionsDaHerhangiBirAksakl??kYok() {
        String durum="cal??????yor";
        String status=SSO.Honeypootactive1.getText();
        String running =SSO.Honeypootrunning1.getText();
        System.out.println("Smartdeceptive de statusler "+status+" ??ekilde ??al????maktad??r "+"\n"
                +" Runninglerde  "+ running + " bulunmaktad??r");
    }



    @And("Kullan??c?? LeakMap sayfas??na ula????rAnd Dashboard b??l??m??ne gelir Data Leak Fields k??sm??n?? g??r??r")
    public void kullan??c??LeakMapSayfas??naUla????rAndDashboardB??l??m??neGelirDataLeakFieldsK??sm??n??G??r??r() {
    }

    @When("Kullan??c?? Darkmap modul??ne gider")
    public void kullan??c??DarkmapModul??neGider() {
        ReusableMethods.waitFor(10);
        SSO.Darkmap.click();ReusableMethods.waitFor(3);
        SSO.Threatway.click();ReusableMethods.waitFor(3);
        SSO.SmartDeceptive.click();ReusableMethods.waitFor(3);
        SSO.CrimeGround.click();ReusableMethods.waitFor(3);
        SSO.Leakmap.click();ReusableMethods.waitFor(3);
    }

    @Then("Darkmap de Staticts sayfas??na ula????r")
    public void darkmapDeStatictsSayfas??naUla????r() {
        Driver.getDriver().get(ConfigReader.getProperty("darkmap"));
/*  JavascriptExecutor executor = (JavascriptExecutor)driver;
  executor.executeScript("document.body.style.zoom = '80%'");*/
        actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(3);
        actions.moveToElement(SSO.DarkmapStatistictt);

        ReusableMethods.waitFor(3);
        String expecteddata="Daily Stats of keyword";
        String actualdata=SSO.DailyStats.getText();
        Assert.assertEquals(expecteddata, actualdata);
        System.out.println(actualdata);
        //ReusableMethods.scrollBy(500);
        SSO.QuickSearch.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SSO.exploit2.isEnabled());
    }

    @When("Kullan??c?? Threatway modul??ne gider")
    public void kullan??c??ThreatwayModul??neGider() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("threatway"));
        String expecteddata=" BAD REPUTATIONS ";
        String actualdata=SSO.Badreputations.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
    }

    @And("Threatway de Statics sayfas??na ula????r")
    public void threatwayDeStaticsSayfas??naUla????r() {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrooltoWebelement(SSO.Threatwayalt);
        ReusableMethods.waitFor(3);
        SSO.??mlec.click();
        ReusableMethods.waitFor(3);
    }

    @When("Kullan??c?? Smartdeceptive modul??ne gider")
    public void kullan??c??SmartdeceptiveModul??neGider() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().get(ConfigReader.getProperty("smartdeceptive"));
        ReusableMethods.waitFor(3);
    }

    @Then("Smartdeceptive de Home sayfas??na ula????r")
    public void smartdeceptiveDeHomeSayfas??naUla????r() {
        actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(3);
        String expecteddata=" The Top Attacking IP Addresses ";
        String actualdata=SSO.Thetopattacking.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
        actions.dragAndDrop(SSO.Slider1,SSO.Slider2);
        ReusableMethods.waitFor(3);
        ReusableMethods.scrooltoWebelement(SSO.Themosttried);
        ReusableMethods.waitFor(3);
        SSO.Smart??mlec.click();

        ReusableMethods.waitFor(3);
    }

    @And("Kullan??c?? CrimeGround sayfas??na ula????r")
    public void kullan??c??CrimeGroundSayfas??naUla????r() {
        Driver.getDriver().get(ConfigReader.getProperty("crimeground"));
        ReusableMethods.waitFor(3);
    }

    @And("Arama k??sm??na keyword ekleyip sonu??lar?? g??rd??r??r")
    public void aramaK??sm??naKeywordEkleyipSonu??lar??G??rd??r??r() {
        actions = new Actions(Driver.getDriver());
        ReusableMethods.waitFor(3);
        SSO.Search.click();
        SSO.Search.sendKeys("fatih",Keys.ENTER);
        ReusableMethods.waitFor(18);
        SSO.Leakmap.click();
        ReusableMethods.waitFor(2);
        actions.doubleClick(SSO.button1).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button2).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button3).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button4).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button5).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button6).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button7).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button8).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button9).perform();
        ReusableMethods.waitFor(2);
        SSO.Leakmap.click();
        actions.doubleClick(SSO.button10).perform();
        ReusableMethods.waitFor(2);
        SSO.Yenile.click();
        ReusableMethods.waitFor(2);
    }

    @And("Kullan??c?? LeakMap sayfas??na ula????r")
    public void kullan??c??LeakMapSayfas??naUla????r() {
        Driver.getDriver().get(ConfigReader.getProperty("leakmap"));
        ReusableMethods.waitFor(3);
    }

    @And("Dashboard b??l??m??ne gelir Data Leak Fields k??sm??n?? g??r??r")
    public void dashboardB??l??m??neGelirDataLeakFieldsK??sm??n??G??r??r() {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrooltoWebelement(SSO.DataLeakFields);
        String expecteddata=" Data Leak Fields ";
        String actualdata=SSO.DataLeakFields.getText();
        Assert.assertTrue(expecteddata.contains(actualdata));
        ReusableMethods.waitFor(3);
        Assert.assertTrue(SSO.DataResim.isDisplayed());
        ReusableMethods.waitFor(3);
        ReusableMethods.scrooltoWebelement(SSO.LeakmapTop);
        ReusableMethods.waitFor(3);
        SSO.LeakmapTop.click();
        ReusableMethods.waitFor(3);
        SSO.Leaksearch.click();
        ReusableMethods.waitFor(3);
        SSO.SearchLeak.sendKeys("Berkays");
        ReusableMethods.waitFor(2);
        SSO.SearchButtonu.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.waitFor(15);
        ReusableMethods.scrooltoWebelement(SSO.Quickpage);
        ReusableMethods.waitFor(2);
        SSO.Shw1.click();
    }
}
