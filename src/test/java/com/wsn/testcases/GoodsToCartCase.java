package com.wsn.testcases;

import com.wsn.common.BaseTest;
import com.wsn.pages.mall.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-28 10:35
 * @Desc： 添加到购物车
 **/

public class GoodsToCartCase extends BaseTest {
    static RemoteWebDriver driver;

    @Test
    public void toCart() throws InterruptedException {
        driver = super.openBrowser("chrome");
        String url = "http://mall.lemonban.com:3344/";
        toUrl(driver,url);
        //进入首页
        IndexPage indexPage = new IndexPage(driver);
        indexPage.enterPage();
        //登录
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("java_auto","lemon123456");
        //进入商品页面
        Thread.sleep(3000);
        String goodsName = "蓝色衣服";
        indexPage.searchGoods(goodsName);
        GoodsListPage goodsListPage = new GoodsListPage(driver);
        goodsListPage.toGoodsDetail();
        //获取商品详情
        Thread.sleep(3000);
        GoodsDetailPage goodsDetailPage = new GoodsDetailPage(driver);
        String goodsDetail = goodsDetailPage.getGoodsName();
        String goodsPrice = goodsDetailPage.getGoodsPrice();

        //加入购物车
        goodsDetailPage.addToCart();
        //进入购物车页面
        indexPage.toCart();
        CartPage cartPage = new CartPage(driver);
        //获取购物车中的名称
        String actualName = cartPage.getGoodsName();
//        String actualPrice = cartPage.execJS("document.getElementsByClassName(\"unit-price\")[0].innerHTML");
        String rowPrice = cartPage.getGoodsPrice();
        String totlePrice = cartPage.getTotlePrice();

        Assert.assertEquals(actualName,goodsName+goodsDetail);
        Assert.assertEquals(rowPrice,goodsPrice);
        Assert.assertEquals(cartPage.getCount(),"1");

    }
    @AfterTest
    public void deleteAllGoods() throws InterruptedException {

        CartPage cartPage = new CartPage(driver);
        cartPage.deleteAllGoods();
        Thread.sleep(1000);
        driver.quit();
    }
}
