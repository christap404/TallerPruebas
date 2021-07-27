package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    public WebDriver webDriver;
    public WebElement userBox;
    public WebElement password;
    public WebElement btnLogin;

    public loginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.userBox = webDriver.findElement(By.name("uid"));
        this.password = webDriver.findElement(By.name("password"));
        this.btnLogin = webDriver.findElement(By.name("btnLogin"));
    }

    public void logearse(){
        userBox.sendKeys(("mngr342906"));

        password.sendKeys("asyzEpy1@@@");
        btnLogin.click();
    //asyzEpy1@
       // WebElement welcomemessage = webDriver.findElement(By.xpath("\"/html/body/table/tbody/tr/td/table/tbody/tr[3]/td\""));
    }


}
