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
 * @Create: 2022-05-10 10:01
 * @Desc： 客户中心详情页面
 **/

public class CustCenterPage extends BasePage {
    private By prod_search_button_locator = By.xpath("//input[@id='ipt_taocan']//following-sibling::button");
    public CustCenterPage(RemoteWebDriver driver){
        super(driver);
    }
    public void toProdSearch(){
        click(prod_search_button_locator,"点击进入套餐查询");
    }
}
