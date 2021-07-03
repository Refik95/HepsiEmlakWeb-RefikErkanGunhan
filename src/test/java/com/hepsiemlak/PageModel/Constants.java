package com.hepsiemlak.PageModel;

import org.openqa.selenium.By;

public class Constants {

   //WebCase1
    public static final By BUTTON_SATILIK_ICON = By.xpath("//a/span[text()='Satılık']");
    public static final By BUTTON_COOKIE = By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']");
    public static final By BOX_ILSECINIZ = By.cssSelector("section[class='filter-item-wrap loc locationCitySec']");
    public static final By SELECT_IZMIR = By.xpath("//span[text()='İzmir']");
    public static final By BOX_ILCESECINIZ  = By.xpath("//span[contains(text(),'İlçe Seçiniz')]");
    public static final By SELECT_BORNOVA  = By.xpath("//span[text()='Bornova']");
    public static final By CLICK_FIYAT  = By.xpath("//span[contains(text(),'Fiyat')]");
    public static final By SELECT_ISYERI  = By.xpath("//label[@for='category1']");
    public static final By MIN_FIYAT  = By.xpath("//input[@class='floating-input priceMin']");
    public static final By MAX_FIYAT  = By.xpath("//input[@class='floating-input priceMax']");
    public static final By BINA_YASI  = By.xpath("//div[contains(text(),'Bina Yaşı Seçiniz')]");
    public static final By SIFIR_BINA  = By.xpath("//label//span[contains(text(),'Sıfır Bina')]");
    public static final By BIR_BES_YAS_BINA  = By.xpath("//label//span[contains(text(),'1-5')]");
    public static final By ALTI_ON_YAS_BINA  = By.xpath("//label//span[contains(text(),'6-10')]");
    public static final By BUTTON_ARA  = By.xpath("//a[@class='btn btn-red btn-large']");

   //WebCase2
   public static final By BUTTON_KIRALIK_ICON = By.xpath("//img[@src='/_nuxt/img/kiralik.1359811.svg']");
   public static final By BUTTON_COOKIE2 = By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']");
   public static final By ILSECINIZ_BOX = By.xpath("//span[contains(text(),'İl Seçiniz')]");
   public static final By SELECT_ANKARA = By.xpath("//span[contains(text(),'Ankara')]");
   public static final By ILCESECINIZ_BOX = By.xpath("//span[contains(text(),'İlçe Seçiniz')]");
   public static final By SELECT_CANKAYA = By.xpath("//span[text()='Çankaya']");
   public static final By CLICK_FIYAT2 = By.xpath("//span[contains(text(),'Fiyat')]");
   public static final By SELECT_ODA_SALONSAYISI = By.xpath("//div[contains(text(),'Oda Seçiniz')]");
   public static final By SELECT_IKI_ARTI_BIR = By.xpath("//label[@class='md-checkbox']//span[contains(text(),'2+1')]");
   public static final By SELECT_SITEICINDE = By.cssSelector("section[class='filter-switch withinSiteSec'] input");
   public static final By ARA_BUTTON = By.xpath("//a[@class='btn btn-red btn-large']");
   public static final By CLICK_THIRD_LISTING = By.xpath("//a[@href='/ankara-cankaya-alacaatli-kiralik/daire/51337-510']");
   public static final By CLICK_SHOW_PHONE_NUMBER = By.xpath("//span[contains(text(),'Telefon Numarasını Göster')]");

}
