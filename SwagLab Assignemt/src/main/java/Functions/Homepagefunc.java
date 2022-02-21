package Functions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import object_repository.*;
import utils.CoreActions;
import config.writer;
import io.qameta.allure.Step;


public class Homepagefunc extends CoreActions {
	
	protected WebDriver bot1;

	public Homepagefunc(WebDriver bot) {
        super(bot);
        this.bot1 = bot;
    }
	
	@Step("Verify that correct site is opened")
	public void verifySite() {

	String title= bot.getTitle();
	System.out.println("The page title is : "+title);
	String expected_title="Swag Labs";
	Assert.assertEquals(title, expected_title);
	System.out.println("Page Title is Correct");
	}
	
	
	public void enterUsernamesList() throws InterruptedException{
        writer json_file = new writer();
        String[] lines = textRetriever(Homepage.select_usernames_list).split("\\r?\\n|\\r");
        for(int i=1;i<=4;i++){
            System.out.print("Username:");
            System.out.println(lines[i]);
            enterUsername(lines[i]);
            Thread.sleep(2000);
            System.out.print("Password:");
            System.out.println(json_file.read_value_from_json("Password"));
            enterPassword(json_file.read_value_from_json("Password"));
            Thread.sleep(2000);
            System.out.println(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n","")));
            if(lines[i].strip().replace("\n","").equals(json_file.read_value_from_json("Username").strip().replace("\n",""))){
            	click(Homepage.login);
                Thread.sleep(2000);
                if(bot.getCurrentUrl().equals(json_file.read_value_from_json("InventoryURL"))){
                    Assert.assertEquals(json_file.read_value_from_json("InventoryURL"), bot.getCurrentUrl());
                    break;
                }
                else
                {
                    Thread.sleep(2000);
                }
            }
            else
            {
            	
                Thread.sleep(2000);
            }
        } 
        }
	
    @Step("Click finish button")
    public void enterUsername(String username) {
        enterText(Homepage.username_text, username);
        }
    
    public void enterPassword(String password) {
        enterText(Homepage.password_text, password);
    }
    
    public ProductPagefunc password() {
        click(Homepage.password_text);
        return new ProductPagefunc(bot1);

    }
    

}