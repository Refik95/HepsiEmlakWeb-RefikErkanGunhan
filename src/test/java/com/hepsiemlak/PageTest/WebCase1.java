package com.hepsiemlak.PageTest;

import com.hepsiemlak.Base.Base;
import com.hepsiemlak.PageModel.PageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class WebCase1 extends Base {
    PageModel pageModel = new PageModel(getWebDriver());

    @Step({"HepsiEmlak Ana Sayfasına Gidilir"})
    public void navigateToHepsiEmlak() {
        driver.navigate().to("https://www.hepsiemlak.com/");
    }

    @Step({"Satılık İkonuna Tıklanır"})
    public void clickSatilikIcon()  {
        pageModel.clickSatilikIconButton();
    }

    @Step({"Cookie Kapatılır"})
    public void closeCookie(){
        pageModel.closeCookieButton();
    }

    @Step({"Konum Kısmındaki İl Seçiniz Kutucuğuna Basılır"})
        public void clickIlSecinizBox(){
        pageModel.clickIlSecinizBoxx();
    }

    @Step({"İzmir Seçilir"})
        public void clickIzmir() {
        pageModel.clickIzmirButton();
    }

    @Step({"Konum Kısmındaki İlçe Seçiniz Kutucuğuna Basılır"})
        public void clickIlceSecinizBox(){
        pageModel.clickIlceSecinizBoxx();
    }

    @Step({"Bornova Seçilir"})
        public void clickBornova(){
        pageModel.clickBornovaButton();
    }

    @Step({"Fiyat Textine Tıklanır"})
        public void  clickFiyat(){pageModel.clickFiyatText();}

    @Step({"Kategori İşyeri Seçilir"})
        public void clickIsYeri(){pageModel.clickIsyeriButton();}

    @Step({"5 Saniye Beklenir"})
        public void waitFiveSeconds() throws InterruptedException {pageModel.waitForFiveSeconds();}

    @Step({"Minimum fiyat <cost> olarak girilir"})
        public void sendMinDeger(String cost){pageModel.sendMinValue(cost);}

    @Step({"2 Saniye Beklenir"})
    public void waitTwoSeconds() throws InterruptedException {pageModel.waitForTwoSeconds();}

    @Step({"Maximum fiyat <cost> olarak girilir"})
        public void sendMaxDeger(String cost){pageModel.sendMaxValue(cost);}

    @Step({"'Bina Yaşı Seçiniz' Kutucuğuna Tıklanır"})
        public void clickBinaYasiSecinizBox(){pageModel.clickStructureAgeBox();}

    @Step({"Sıfır Bina Seçilir"})
        public void clickSifirBina(){pageModel.selectSifirBina();}

    @Step({"1-5 Yaşında Bina Seçilir"})
        public void clickBirBesYasBina(){pageModel.selectBirBesYasBina();}

    @Step({"6-10 Yaşında Bina Seçilir"})
        public void clickAltiOnYasBina(){pageModel.selectAltiOnYasBina();}

    @Step({"Ara Butonuna Tıklanır"})
        public void clickAraButton(){pageModel.clickSearchButton();}

    @Step({"3 Saniye Beklenir"})
    public void waitThreeSeconds() throws InterruptedException {pageModel.waitForThreeSeconds();}

    @Step({"Taglerde İlin İzmir Olduğu Kontrolu Yapılır"})
    public void tagProvinenceAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//li[@class='applied-filters-list__group'][1]/span[2]")).getText();
        String ExpectedTitle = "İzmir";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Taglerde İlçenin Bornova Olduğu Kontrolu Yapılır"})
        public void tagDistrictAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//li[@class='applied-filters-list__group'][2]/span[2]")).getText();
        String ExpectedTitle = "Bornova";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Taglerde Kategorinin İşyeri Olduğu Kontrolu Yapılır"})
        public void tagCategoryAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//li[@class='applied-filters-list__group'][3]/span[2]")).getText();
        String ExpectedTitle = "İşyeri";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Taglerde Fiyatın 100.000 TL - 2.000.000 TL Olduğu Kontrolu Yapılır"})
        public void tagPriceAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//li[@class='applied-filters-list__group'][4]/span[2]")).getText();
        String ExpectedTitle = "100.000 TL - 2.000.000 TL";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Taglerde Bina Yaşının Sıfır Bina Olduğu Kontrolu Yapılır"})
        public void tagStructureAgeZeroAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//li[@class='applied-filters-list__group'][5]/span[2]")).getText();
        String ExpectedTitle = "Sıfır Bina";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Taglerde Bina Yaşının 1-5 Olduğu Kontrolu Yapılır"})
        public void tagStructureAgeOneFiveAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//span[@class='applied-filters-list-item'][contains(text(),'1-5')]")).getText();
        String ExpectedTitle = "1-5";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
    @Step({"Taglerde Bina Yaşının 6-10 Olduğu Kontrolu Yapılır"})
        public void tagStructureSixTenAssertion() {
        String ActualTitle = driver.findElement(By.xpath("//span[@class='applied-filters-list-item last--item'][contains(text(),'6-10')]")).getText();
        String ExpectedTitle = "6-10";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
}
