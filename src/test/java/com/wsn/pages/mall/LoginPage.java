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
 * @Create: 2022-04-26 10:07
 * @Desc： 登录页面
 **/

public class LoginPage extends BasePage {
    private By phone_input_locator = By.xpath("//input[@placeholder='请输入手机号/用户名']");
    private By password_input_locator = By.xpath("//input[@placeholder='请输入密码']");
    private By login_button_locator = By.xpath("//a[@class='login-button']");


    public LoginPage(RemoteWebDriver driver){
        super(driver);
    }

    /**
     * 登录操作
     * @param phone
     * @param password
     */
    public void login(String phone,String password){
//        waitElementClickable(phone_input_locator).sendKeys(phone);
        input(phone_input_locator,phone);
//        waitElementClickable(password_input_locator).sendKeys(password);
        input(password_input_locator,password);
//        waitElementClickable(login_button_locator).click();
        click(login_button_locator,"点击登录");

    }


}
