package com.wsn.listener;

import com.wsn.common.BaseTest;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-07 09:51
 * @Desc： todo
 **/

public class TestResultListener implements IHookable {

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        iHookCallBack.runTestMethod(iTestResult);
        if(iTestResult.getThrowable() != null){
            BaseTest baseTest = (BaseTest) iTestResult.getInstance();
            File file1 = baseTest.driver.getScreenshotAs(OutputType.FILE);
            try {
                Allure.addAttachment("失败用例截图",new FileInputStream(file1));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
