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
 * @Create: 2022-05-10 10:06
 * @Desc： 套餐查询页面
 **/

public class ProdSearchPage extends BasePage {
    private By  searchbar_input_locator = By.xpath("//div[@class='el-input']/input");
    private By searchbar_icon_span_locator = By.xpath("//span[@class='searchIcon']");
    private By transaction_button_locator = By.xpath("//span[text()='有线宽带_基础销售品_ZJ']//parent::div//following-sibling::div/button[1]");
    public ProdSearchPage(RemoteWebDriver driver){
        super(driver);
    }
    public void searchProd(String prodName){
        input(searchbar_input_locator,prodName);
        click(searchbar_icon_span_locator,"点击后搜索产品");
        click(transaction_button_locator,"点击办理");
    }

}
