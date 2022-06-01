package com.wsn.pages.mall;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-28 10:00
 * @Desc： 购物车页面
 **/

public class CartPage extends BasePage {
    private By goodsName_locator = By.xpath("//a[@class='name']");
    private By check_input_all_locator = By.xpath("//div[@class='cart-bottom']//input");
    private By delect_a_locator = By.xpath("//div[@class='cart-bottom']//a[@class='del-selected']");
    private By conform_locator = By.xpath("//a[@class='btn-r']");
    private By goodsPrice_span_locator = By.xpath("//div[@class='unit-price']");
    private By goodsTotlePrice_div_locator= By.xpath("//div[@class='activity-goods']//div[@class='tab-total']");
    private By goods_count_locator = By.xpath("//input[@class='number']");

    public CartPage(RemoteWebDriver driver){
        super(driver);
    }

    /**
     * 删除购物车
     */
    public void deleteAllGoods(){
//        waitElementClickable(check_input_all_locator).click();
        click(check_input_all_locator,"点击购物车全选");
//        waitElementClickable(delect_a_locator).click();
        click(delect_a_locator,"点击删除");
//        waitElementClickable(conform_locator).click();
        click(conform_locator,"点击确定删除");
    }

    public String getGoodsName(){
        return getWebElement(goodsName_locator,"商品名称").getText();
    }
    public String getGoodsPrice(){
        return getWebElement(goodsPrice_span_locator,"商品价格").getText();
    }
    public String getTotlePrice(){
        return getWebElement(goodsTotlePrice_div_locator,"商品总价").getText();
    }
    public String getCount(){
        return waitElementVisible(goods_count_locator).getAttribute("value");
    }




}
