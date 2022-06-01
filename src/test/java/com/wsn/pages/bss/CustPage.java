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
 * @Create: 2022-05-10 09:49
 * @Desc： 选择客户
 **/

public class CustPage extends BasePage {
    private By papernum_input_locator = By.xpath("//input[@id='DW833021']");
    private By search_cust_button_locator = By.id("DW833025");
    private By conform_cust_button_locator = By.id("DW833033");
    private By custcode_span_locator = By.xpath("//span[@class='el-radio__label']");
    public CustPage(RemoteWebDriver driver){
        super(driver);
    }
    public void inputPaperNum(String num){
        input(papernum_input_locator,num);
    }
    public void clickSearch(){
        click(search_cust_button_locator,"点击查询客户");
    }
    public void clickCust(){
        click(custcode_span_locator,"点击客户编码");
        click(conform_cust_button_locator,"点击确定的客户");
    }

}
