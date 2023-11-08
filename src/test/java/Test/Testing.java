package Test;

import Pages.ContactManagePage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class Testing extends DriverSetup {
      LoginPage WebLoginPage =new LoginPage();
      DashboardPage WebDashboardPage= new DashboardPage();

      ContactManagePage WebContactManagePage =new ContactManagePage();

    @Test
    public void Testing() throws InterruptedException {
        getDriver().get("http://159.89.38.11/login");

        WebLoginPage.enter_Email("test@orangetoolz.com");
        WebLoginPage.enter_Pass("8Kh8nTe*^jdk");
        WebLoginPage.checkBox();
        WebLoginPage.login_Button();
        WebDashboardPage.sideBar();
        WebDashboardPage.contactManager();
        WebContactManagePage.addContact();
        WebContactManagePage.selectTag();
        WebContactManagePage.ScrollNumber();
        WebContactManagePage.number("0193500000");
        WebContactManagePage.email("practicelearn@gmail.com");
        WebContactManagePage.f_name("Sabbir");
        WebContactManagePage.l_name("Ahamed");
        WebContactManagePage.birthDate("1999-01-01");
        WebContactManagePage.ScrollAddBtn();
        WebContactManagePage.city("Gazipur");
        WebContactManagePage.state("Tongi");
        WebContactManagePage.zipCode("1070");
        WebContactManagePage.country("Bangladesh");
        WebContactManagePage.address("Noyagoan , tongi ,Gazipur");
        WebContactManagePage.AddBtn();

    }
}
