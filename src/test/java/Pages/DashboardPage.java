package Pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasicPage {

    public By Side_Bar_CM_icon= By.xpath("//i[@class='fas fa-id-card fa-lg']");
    public By ContactManager= By.xpath("//span[normalize-space()='Contact Manage']");


    public void sideBar(){
       HoverA(Side_Bar_CM_icon);
    }

    public void contactManager(){
        click(ContactManager);
    }
}
