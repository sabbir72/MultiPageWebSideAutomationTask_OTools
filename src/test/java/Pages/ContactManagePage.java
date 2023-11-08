package Pages;

import org.openqa.selenium.By;

public class ContactManagePage extends BasicPage{

    public By Add_contact= By.xpath("//i[@class='fas fa-user-plus']");
    public By SelectTag_default=By.xpath("//label[@for='checkbox-4-03']");
    public By Number =By.xpath("//input[@placeholder='Enter Number']");
    public By AlertText=By.xpath("//span[@class='help-block']");
    public By Email=By.xpath("//input[@placeholder='Enter Email address']");
    public By F_name=By.xpath("//input[@placeholder='Enter First name']");
    public By L_name=By.xpath("//input[@placeholder='Enter Last name']");
    public By BirthDate=By.xpath("//input[@placeholder='Enter your birthday']");
    public By City=By.xpath("//input[@placeholder='Enter your city']");
    public By State=By.xpath("//input[@placeholder='Enter your state']");
    public By ZipCode=By.xpath("//input[@placeholder='Enter your Zip']");
    public By Country=By.xpath("//input[@placeholder='Enter your country']");
    public By Address=By.xpath("//textarea[@placeholder='Enter your address']");
    public By AddContactBtn=By.xpath("//button[@type='submit']");



    public void addContact(){
        click(Add_contact);
    }
    public void selectTag(){
        click(SelectTag_default);
    }

    public void ScrollNumber(){
        Scroll(Number);
    }
    public void number(String number){
        writeText(Number,number);
    }
    public void email(String email){
        writeText(Email,email);
    }
    public void f_name(String f_name){
        writeText(F_name,f_name);
    }
    public void l_name(String l_name){
        writeText(L_name,l_name);
    }
    public void birthDate(String birth){
        writeText(BirthDate,birth);
    }
    public void ScrollAddBtn(){
        Scroll(AddContactBtn);
    }
    public void city(String city){
        writeText(City,city);
    }
    public void state(String state){
        writeText(State,state);
    }
    public void zipCode(String zip){
        writeText(ZipCode,zip);
    }
    public void country(String country){
        writeText(Country,country);
    }

    public void address(String address){
        writeText(Address,address);
    }
    public void AddBtn(){
        click(AddContactBtn);
    }


}
