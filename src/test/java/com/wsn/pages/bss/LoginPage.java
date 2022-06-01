package com.wsn.pages.bss;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-05-07 10:36
 * @Desc： bss登录
 **/

public class LoginPage extends BasePage {
    private By username_input_locator = By.xpath("//input[@placeholder='请输入工号']");
    private By password_input_locator = By.xpath("//input[@placeholder='请输入密码']");
    private By login_button_locator = By.xpath("//button[text()='登 录']");

    private By toAuth_div_locator = By.xpath("//div[text()='手机验证码']");
    private By sendAuth_div_locator = By.xpath("//div[text()='发送验证码']");
    private By enterAuth_input_locator = By.xpath("//input[@placeholder='请输入验证码']");
    private By enter_button_locator = By.xpath("//button[text()='验证']");



    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }
    public void BssLogin(String username,String password){
        input(username_input_locator,username);
        input(password_input_locator,password);
        click(login_button_locator,"点击登录");
        click(toAuth_div_locator,"选择验证码验证");
        click(sendAuth_div_locator,"发送验证码");
        input(enterAuth_input_locator,"123456");
        click(enter_button_locator,"进入系统");
    }
}
