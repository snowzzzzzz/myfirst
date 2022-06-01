package com.wsn.testcases;

import com.wsn.common.BaseTest;
import com.wsn.pages.mall.IndexPage;
import com.wsn.pages.mall.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-26 10:18
 * @Desc： 登录测试用例
 **/

public class LoginTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {

        RemoteWebDriver driver = super.openBrowser("chrome");
        driver.get("http://mall.lemonban.com:3344/");
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("java_auto","lemon123456");

        Thread.sleep(5000);
        String actual1 = driver.findElement(By.xpath("//span[@class='text']")).getText();

        Assert.assertEquals(actual1,"欢迎来到柠檬班");
    }

}
