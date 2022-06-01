package com.wsn.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-26 11:02
 * @Desc： 通用页面
 **/

public class BasePage {
    private RemoteWebDriver driver;
    static Logger logger = Logger.getLogger(BasePage.class);

    public BasePage(RemoteWebDriver driver){
        this.driver=driver;
    }



    /**
     * 显示等待二次封装-等待元素可见
     * @param locator
     */
    public WebElement waitElementVisible(By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver,8);
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * 显示等待二次封装-等待元素可被点击
     * @param locator
     */
    public WebElement waitElementClickable(By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver,8);
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * 显示等待二次封装-等待元素存在
     * @param locator
     */
    public WebElement waitElementPresence(By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver,8);
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * 点击操作
     * @param locator
     * @param desc
     */
    public void click(By locator,String desc){
        waitElementClickable(locator).click();
        logger.info("点击了元素"+desc);
    }

    /**
     * 输入操作
     * @param locator
     * @param desc
     */
    public void input(By locator,String desc){
        waitElementVisible(locator).sendKeys(desc);
        logger.info("已经输入内容"+"["+desc+"]");
    }
    public WebElement getWebElement(By locator,String desc){
        logger.info("查找元素"+"["+desc+"]");
        return waitElementVisible(locator);
    }

    /**
     * 获取元素列表
     * @param locator
     * @return
     */
    public List<WebElement> getWebElementList(By locator){
        logger.info("获取元素列表");
        return driver.findElements(locator);

    }
    public String execJScript(String JScript){
        logger.info("执行js代码"+JScript);
        return (String)driver.executeScript(JScript);
    }

}
