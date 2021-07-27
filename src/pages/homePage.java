package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    public WebDriver webDriver;
    public WebElement changePassword;

    public homePage(WebDriver webDriver){
        this.webDriver = webDriver;
        changePassword = webDriver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a"));
    }

    public void clicChangePassword(){
        changePassword.click();
    }

}
