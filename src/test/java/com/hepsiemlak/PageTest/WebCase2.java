package com.hepsiemlak.PageTest;

import com.hepsiemlak.Base.Base;
import com.hepsiemlak.PageModel.PageModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class WebCase2 extends Base {

    PageModel pageModel = new PageModel(getWebDriver());

    @Step({"HepsiEmlak Ana Sayfasına Gidilir2"})
    public void navigateToHepsiEmlak() {
        driver.navigate().to("https://www.hepsiemlak.com/");
    }

    @Step({"Kiralık İkonuna Tıklanır"})
    public void clickKiralıkButton(){pageModel.clickKiralikIconButton();}

    @Step("Cookie Tekrar Kapatılır")
    public void closeCookie(){pageModel.closeCookieButton2();}

    @Step({"Konum Kısmındaki İl Seçiniz Kutucuğuna Basılır2"})
    public void clickIlSecinizBoxx2(){
        pageModel.clickIlSecinizBox2();
    }

    @Step({"İl Ankara Seçilir"})
    public void clickAnkara(){
        pageModel.selectAnkara();
    }

    @Step({"Konum Kısmındaki İlçe Seçiniz Kutucuğuna Basılır2"})
    public void clickIlceSecinizBoxx2(){
        pageModel.clickIlceSecinizBox2();
    }

    @Step({"İlçe Çankaya Seçilir"})
    public void selectCankaya(){
        pageModel.clickCankaya();
    }

    @Step({"Fiyat Textine Tıklanır2"})
    public void selectPriceText(){
        pageModel.clickFiyatText2();
    }

    @Step({"Oda Seçiniz Kutucuğuna Tıklanır"})
    public void clickOdaSeciniz(){
        pageModel.clickOdaSecinizBox();
    }

    @Step({"Oda Seçiniz Kutucuğunda 2+1 Seçilir"})
    public void selectIkiArtiBirBox(){
        pageModel.clickIkiArtiBirBox();
    }

    @Step({"Site İçerisinde Kutucuğu Evet Olarak İşaretlenir"})
    public void selectSiteIcinde(){
        pageModel.clickSiteIcinde();
    }

    @Step({"Kırmızı Ara Butonuna Tıklanır"})
    public void clickSaerchBox(){
        pageModel.clickAraButton();
    }

    @Step({"İki Saniye Beklenir"})
    public void waitTwoSecond() throws InterruptedException {
        pageModel.waitForTwoSeconds();
    }

    @Step({"Arama Listesindeki 3. İlan Seçilir"})
    public void selectThirdListing(){pageModel.clickThirdListing();
    }

    @Step({"Telefon Numarasını Göster Kutucuğuna Tıklanır"})
    public void selectShowPhoneNumber(){pageModel.clickShowPhoneNumber();
    }

    @Step({"Telefon Numarasının Gerçekliği Kontrol Edilir"})
    public void checkIfPhoneNumberIsValid() {
        String ActualTitle = driver.findElement(By.cssSelector("section[class='det-block'] div[class='owner-phone-numbers-list-wrapper'] a[href='tel:+905527608881']")).getText();
        String ExpectedTitle = "0552 760 88 81";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
}
