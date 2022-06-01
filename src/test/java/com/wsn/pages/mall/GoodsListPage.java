package com.wsn.pages.mall;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-05 10:35
 * @Desc： 商品列表
 **/

public class GoodsListPage extends BasePage {
    private By bluecloth_div_locator = By.xpath("//div[text()='蓝色衣服']");

    public GoodsListPage(RemoteWebDriver driver){
        super(driver);
    }

    public void toGoodsDetail(){
        click(bluecloth_div_locator,"点击商品");
    }
}
