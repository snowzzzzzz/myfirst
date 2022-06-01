package com.wsn.pages.manage;

import com.wsn.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @Project: frame01
 * @Site: http://www.xxx.com
 * @Forum: http://xxx.com
 * @Copyright: ©2020 版权所有 xxx
 * @Author: 14111
 * @Create: 2022-04-29 15:04
 * @Desc： 后台主页
 **/

public class MHomePage extends BasePage {
    private By prodManage_1_span_locator = By.xpath("//div[@class='el-submenu__title']//span[text()='产品管理']");
    private By prodManage_2_span_locator = By.xpath("//li[@class='el-menu-item']//span[text()='产品管理']");
    private By add_span_locator = By.xpath("//div[@class='avue-crud__left']//span[text()='新增']");
    private By selectPicture_li_locator = By.xpath("//li[@class='el-upload-list__item']");
    private By search_input_locator = By.xpath("//div[@class='el-loading-mask is-fullscreen']//following-sibling::div[1]//input[@placeholder='图片名称']");
    private By search_button_locator = By.xpath("//div[@class='el-loading-mask is-fullscreen']//following-sibling::div[1]//span[text()='查询']");
    private By picture_div_locator = By.xpath("//div[@class='elx-main elx-img-list']/div[1]//img");
    private By confirm_span_locator = By.xpath("//div[@class='el-pagination']//following-sibling::div//span[text()='确 定']");





    public MHomePage(RemoteWebDriver driver){
        super(driver);
    }

    public void toProdManage(){
        click(prodManage_1_span_locator,"点击产品管理1级目录");
        click(prodManage_2_span_locator,"点击产品管理2级目录");
    }
    public void addProd(){
        click(add_span_locator,"点击新建产品");
        click(selectPicture_li_locator,"点击选择图片");
        input(search_input_locator,"dog4");
        click(search_button_locator,"搜索图片");
        click(picture_div_locator,"选择图片");
        click(confirm_span_locator,"点击确定");
    }
}
