package com.wsn.pages.manage;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-29 14:22
 * @Desc： 后台登录页面
 **/

public class MLoginPage extends BasePage {
    private By login_input_locator = By.xpath("//input[@placeholder='用户名']");
    private By password_input_locator = By.xpath("//input[@placeholder='密码']");
    private By auth_input_locator = By.xpath("//input[@placeholder='验证码']");
    private By login_button_locator = By.xpath("//input[@value='登录']");


    public MLoginPage(RemoteWebDriver driver){
        super(driver);
    }

    public void loginInto(String username,String password,String auth){
        input(login_input_locator,username);
        input(password_input_locator,password);
        input(auth_input_locator,auth);
        click(login_button_locator,"点击登录按钮");
    }
}
