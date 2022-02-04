package All_Pages;


import org.openqa.selenium.By;
public class Homepage {

    public static final By username_text = By.xpath("//*[@id='user-name']");
    public static final By select_usernames_list = By.xpath("//div[@id='login_credentials']");
    public static final By password_text = By.xpath("//input[@id='password']");
    public static final By login = By.xpath("//input[@id='login-button']");



}