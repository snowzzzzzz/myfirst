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
 * @Create: 2022-04-26 10:13
 * @Desc： 首页
 **/

public class IndexPage extends BasePage {
    private By login_a_locator = By.xpath("//a[text()='登录']");

    private By cart_span_locator = By.xpath("//span[@data-route='cart']");

    private By search_input_locator = By.xpath("//div[@class='search-msg']//input[@placeholder='请输入商品名称']");

    private By search_button_input_locator = By.xpath("//div[@class='search-msg']//input[@value='搜索']");


    public IndexPage(RemoteWebDriver driver){
        super(driver);
    }

    public void clickIndexGoods(String goodsName){
        By SelectIndexGoods_locator = By.xpath("//div[text()='"+goodsName+"']");
        click(SelectIndexGoods_locator,"点击首页商品");
    }
    public void toCart(){
//        waitElementClickable(cart_span_locator).click();\
        click(cart_span_locator,"点击首页购物车");
    }

    /**
     * 进入登录页面
     */
    public void enterPage(){
//        waitElementClickable(login_a_locator).click();
        click(login_a_locator,"点击首页登录页");
    }

    public void searchGoods(String name){
        input(search_input_locator,name);
        click(search_button_input_locator,"点击搜索");
    }

}
