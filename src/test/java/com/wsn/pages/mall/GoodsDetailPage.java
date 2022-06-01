package com.wsn.pages.mall;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-28 10:13
 * @Desc： 商品选择页面
 **/

public class GoodsDetailPage extends BasePage {
    private By goodsSelected_locator = By.xpath("//a[@class='add-cart']");
//    private By goodsName_locator = By.xpath("//div[@class='info']//div[@class='name']");
    private By goodsDetail_span_locator = By.xpath("//span[@class='item active']");
    private By goodsPrice_div_locator = By.xpath("//span[text()='价格']//following-sibling::div[1]/div[@class='price']");

    public GoodsDetailPage(RemoteWebDriver driver){
        super(driver);
    }

    /**
     * 获得商品名
     * @return
     */
    public String getGoodsName(){
        String str1 = "";
        try{
            List<WebElement> list = getWebElementList(goodsDetail_span_locator);
            for(WebElement e:list){
                str1 += " "+e.getText();
            }
        }catch (NoSuchElementException e1){
            System.out.println("无尺寸要求");

        }

        return str1;
    }
    public String getGoodsPrice(){
        String row = getWebElement(goodsPrice_div_locator,"商品价格").getText();

        return row.replaceAll("\n","").trim();
    }

    /**
     * 加入购物车
     */
    public void addToCart(){
//        waitElementClickable(goodsSelected_locator).click();
        click(goodsSelected_locator,"点击加入购物车");
    }
}
