package com.wsn.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-05 10:57
 * @Desc： 失败用例重跑
 **/

public class TestngRetry implements IRetryAnalyzer {
    int maxRetryCount = 2;
    int currentCount = 0;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if(currentCount<maxRetryCount){
            currentCount++;
            return true;
        }else{
            return false;
        }
    }
}
