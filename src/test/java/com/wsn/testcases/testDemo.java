package com.wsn.testcases;

import com.wsn.common.BaseTest;
import com.wsn.listener.TestngRetry;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-05 11:00
 * @Desc： test
 **/

public class testDemo extends BaseTest {
    @Test
    public void test(){
        RemoteWebDriver driver = super.openBrowser("chrome");
        toUrl(driver,"https://www.baidu.com");

        Assert.assertEquals(1,2);
    }
}
