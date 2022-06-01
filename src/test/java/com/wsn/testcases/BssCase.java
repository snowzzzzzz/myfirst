package com.wsn.testcases;

import com.wsn.common.BaseTest;
import com.wsn.pages.bss.CustPage;
import com.wsn.pages.bss.IndexPage;
import com.wsn.pages.bss.LoginPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-07 10:45
 * @Desc： bss
 **/

public class BssCase extends BaseTest {
    @Test
    public void loginTest(){
        RemoteWebDriver driver = super.openBrowser("chrome");
        toUrl(driver,"http://134.108.3.248:8006/chome-fc45d4cdf-htxbj/#/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.BssLogin("17765472624","1q2w3e4R!@");
        IndexPage indexPage = new IndexPage(driver);
        String actualName = indexPage.getHeadername();
        Assert.assertEquals(actualName,"林敏");
        indexPage.toCustCenter();
        CustPage custPage = new CustPage(driver);
        custPage.inputPaperNum("210211");
        custPage.clickSearch();
        custPage.clickCust();
    }
}
