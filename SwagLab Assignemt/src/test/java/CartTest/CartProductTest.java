package CartTest;

import org.testng.annotations.Test;
import core.CoreTestIntegration;
import Functions.*;
import io.qameta.allure.*;
         
public class CartProductTest extends CoreTestIntegration {
	
	Homepagefunc login;
	ProductPagefunc product;
	CartPagefunc cart;
	CheckOutPagefunc checkout;
	Overviewfunc overview;
	CompletePagefunc complete;
	FinalPagefunc removal;
	
    @Test
    @Description("Test to add a product to cart, verify it and proceed to checkout. After checkout, also verify its removal")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 1")
    @Owner("Prakhar Srivastava")
	
    public void test_to_login_add_product_checkout_verify_product_and_removal() throws InterruptedException{  
		
	login = new Homepagefunc(bot);
    	stepLog("Verifying the correct site is opened");
	login.verifySite();
		
    	stepLog("Filling username and password ");
    	login.enterUsernamesList();  // For username, password and login
    	
	product = new ProductPagefunc(bot);
    	stepLog("Adding item to Cart");
    	product.clickOnAddToCart();
    	product.clickOnCart();
    	
	cart = new CartPagefunc(bot);
    	stepLog("Verifying cart product with selected product and price");
    	cart.nameCheck();
    	cart.priceCheck();
    	cart.clickOnCheckOut();
    	
	checkout = new CheckOutPagefunc(bot);
    	stepLog("Filling information for checkout");
        checkout.NamePincode();
        checkout.clickOnContinue();
        
	overview = new Overviewfunc(bot);
    	overview.ClickOnFinish();

	complete = new CompletePagefunc(bot);
    	complete.ClickOnHome();
    	
	removal= new FinalPagefunc(bot);
    	stepLog("Checking item is removed");
    	removal.clickOnCart();
    	removal.checkitem();
    }
    
}
