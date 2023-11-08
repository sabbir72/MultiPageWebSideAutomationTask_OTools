package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasicPage{

//create locator=======
    public By Enter_Email= By.xpath("//input[@id='email-1']");
    public By Enter_Password= By.xpath("//input[@id='password-1']");
    public By CheckBox= By.xpath("//div[@class='dt-checkbox d-block mb-6']");
    public By LoginButton = By.xpath("//button[@id='m_login_signin_submit']");


//create method =======

    public void enter_Email(String enter_Email){
        writeText(Enter_Email, enter_Email);
    }
    public void enter_Pass(String enter_Pass){
        writeText(Enter_Password, enter_Pass);
    }
    public void checkBox(){
        click(CheckBox);
    }
    public void login_Button(){
        click(LoginButton);
    }
}
