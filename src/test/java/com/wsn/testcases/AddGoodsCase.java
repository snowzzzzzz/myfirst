package com.wsn.testcases;

import com.wsn.common.BaseTest;
import com.wsn.pages.manage.MHomePage;
import com.wsn.pages.manage.MLoginPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-29 14:33
 * @Desc： 后台添加商品
 **/

public class AddGoodsCase extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        RemoteWebDriver driver = super.openBrowser("chrome");
        toUrl(driver,"http://mall.lemonban.com/admin/#/login");

        MLoginPage mLoginPage = new MLoginPage(driver);
        mLoginPage.loginInto("student","123456a","lemon");
        Thread.sleep(2000);

        MHomePage mHomePage = new MHomePage(driver);
        mHomePage.toProdManage();
        mHomePage.addProd();

    }
}
