package com.wsn.pages.bss;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-07 10:48
 * @Desc： bss首页
 **/

public class IndexPage extends BasePage {
    private By name_span_locator = By.id("headerName");
    private By cust_center_a_locator = By.xpath("//a[text()='客户中心']");
    public IndexPage(RemoteWebDriver driver){
        super(driver);
    }

    public String getHeadername(){
        return waitElementVisible(name_span_locator).getText();
    }
    public void toCustCenter(){
        click(cust_center_a_locator,"点击进去客户中心");
    }
}
