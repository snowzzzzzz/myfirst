package com.wsn.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-26 11:11
 * @Desc： 通用测试
 **/

public class BaseTest {
    static Logger logger = Logger.getLogger(BaseTest.class);
    public RemoteWebDriver driver;
    /**
     * 配置浏览器
     * @param browserName
     * @return
     */
    public RemoteWebDriver openBrowser(String browserName) {
        //支持chrome、Firefox、IE浏览器配置
        if ("chrome".equalsIgnoreCase(browserName)) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            this.driver=driver;
            logger.info("===========================打开chrome浏览器==============================");
            return driver;
        } else if ("firefox".equalsIgnoreCase(browserName)) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            this.driver=driver;
            logger.info("===========================打开firefox浏览器==============================");
            return driver;
        } else if ("ie".equalsIgnoreCase(browserName)) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
            InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
            this.driver=driver;
            logger.info("===========================打开IE浏览器==============================");
            return driver;
        } else {
            System.out.println("检查你的浏览器名字是否正确");
            logger.info("===========================打开浏览器错误==============================");
            return null;
        }
    }
    public static void toUrl(RemoteWebDriver driver,String url){
        logger.info("打开URL");
        driver.get(url);
    }

}
