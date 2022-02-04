package CartTest;

import org.testng.annotations.Test;
import core.CoreTestIntegration;
import Functions.*;
import io.qameta.allure.Owner;

@Owner("PRAKHAR SRIVASTAVA")
public class CartProductTest extends CoreTestIntegration {
	
	Homepagefunc login;
	ProductPagefunc product;
	CartPagefunc cart;
	CheckOutPagefunc checkout;
	Overviewfunc overview;
	CompletePagefunc complete;
	FinalPagefunc removal;
	
	@Test(priority = 1)
	public void function() {
		
		login = new Homepagefunc(bot);
		product = new ProductPagefunc(bot);
		cart = new CartPagefunc(bot);
		checkout = new CheckOutPagefunc(bot);
		overview = new Overviewfunc(bot);
		complete = new CompletePagefunc(bot);
		removal= new FinalPagefunc(bot);
	}
	@Test(priority = 2)
    public void Case1_verify_site() throws InterruptedException{   	
		 login.verifySite();
    	Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void Case2_login() throws InterruptedException{   	
    	login.enterUsernamesList();  // For username, password and login
    	Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void Case3_Add_item()throws InterruptedException{   	
    	product.clickOnAddToCart();
    	Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void Case4_Cart_verify_item()throws InterruptedException {
    	product.clickOnCart();
    	cart.nameCheck();
    	cart.priceCheck();
    	cart.clickOnCheckOut();
    	Thread.sleep(2000);
    }
    
    @Test(priority = 6)
    public void Case5_fill_form() throws InterruptedException {
    	checkout.enterFirstName("Prakhar");
    	Thread.sleep(2000);
    	checkout.enterLastName("Srivastava");
    	Thread.sleep(2000);
    	checkout.enterPostalCode("201310");
    	Thread.sleep(2000);
    	checkout.clickOnContinue();
    	Thread.sleep(2000);

    }
    @Test(priority = 7)
    public void Case6_finish() throws InterruptedException {
    	overview.ClickOnFinish();
    	Thread.sleep(2000);

    }
    
    @Test(priority = 8)
    public void Case7_Homebtn() throws InterruptedException {
    	complete.ClickOnHome();
    	Thread.sleep(2000);

    }
    //Issue
    @Test(priority = 9)
    public void Case8_removed() {
    	removal.clickOnCart();
    	removal.checkitem();
    }
    
}