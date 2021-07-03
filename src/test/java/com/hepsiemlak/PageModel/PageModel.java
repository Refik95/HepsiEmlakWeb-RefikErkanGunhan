package com.hepsiemlak.PageModel;

import com.hepsiemlak.Base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.hepsiemlak.PageModel.Constants.*;


public class PageModel extends BasePage {
    protected static WebDriver driver;

    public PageModel(WebDriver driver) {
        super(driver);
    }

    public PageModel() {
        super();
    }

    //Web Case 1

    public void clickSatilikIconButton() {
        click(BUTTON_SATILIK_ICON);
    }

    public void closeCookieButton(){
        click( BUTTON_COOKIE);
    }

    public void clickIlSecinizBoxx(){
        click(BOX_ILSECINIZ);
    }

    public void clickIzmirButton(){
        click(SELECT_IZMIR);
    }

    public void clickIlceSecinizBoxx(){
        click(BOX_ILCESECINIZ);
    }

    public void clickBornovaButton(){
        scrollDownToElementAndClick(SELECT_BORNOVA);
    }

    public void clickFiyatText(){
        click(CLICK_FIYAT);
    }

    public void clickIsyeriButton(){
        scrollDownToElementAndClick(SELECT_ISYERI );
    }

    public void sendMinValue(String cost){
        scrollDownToElement(MIN_FIYAT);
        sendKeys(MIN_FIYAT , cost);
    }

    public void sendMaxValue(String cost){
        scrollDownToElement(MAX_FIYAT);
        sendKeys(MAX_FIYAT , cost);
    }

    public void clickStructureAgeBox(){
        scrollDownToElementAndClick(BINA_YASI);
    }

    public void selectSifirBina(){
        scrollDownToElementAndClick(SIFIR_BINA);
    }

    public void selectBirBesYasBina(){
        scrollDownToElementAndClick(BIR_BES_YAS_BINA);
    }

    public void selectAltiOnYasBina(){
        scrollDownToElementAndClick(ALTI_ON_YAS_BINA);
    }

    public void clickSearchButton(){
        click(BUTTON_ARA);
    }

    //Web Case 2
    public void clickKiralikIconButton() {
        click(BUTTON_KIRALIK_ICON);
    }

    public void closeCookieButton2(){
        click( BUTTON_COOKIE2);
    }

    public void clickIlSecinizBox2() {
        click(ILSECINIZ_BOX);
    }

    public void selectAnkara() {
        click(SELECT_ANKARA);
    }

    public void clickIlceSecinizBox2() {
        click(ILCESECINIZ_BOX);
    }

    public void clickCankaya() {
        scrollDownToElementAndClick(SELECT_CANKAYA);
    }

    public void clickFiyatText2() {
        click(CLICK_FIYAT2);
    }

    public void clickOdaSecinizBox() {
        click(SELECT_ODA_SALONSAYISI);
    }

    public void clickIkiArtiBirBox() {
        scrollDownToElementAndClick(SELECT_IKI_ARTI_BIR);
    }

    public void clickSiteIcinde() {
        scrollDownToElementAndClick(SELECT_SITEICINDE);
    }

    public void clickAraButton() {
        click(ARA_BUTTON);
    }

    public void clickThirdListing() {
        click(CLICK_THIRD_LISTING);
    }

    public void clickShowPhoneNumber() {
        click(CLICK_SHOW_PHONE_NUMBER);
    }
}
