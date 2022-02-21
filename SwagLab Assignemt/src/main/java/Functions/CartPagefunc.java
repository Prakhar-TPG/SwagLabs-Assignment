package Functions;

import org.openqa.selenium.WebDriver;
import object_repository.*;
import utils.CoreActions;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;



public class CartPagefunc extends CoreActions {
	public CartPagefunc(WebDriver bot) {
		super(bot);
	}
	SoftAssert softAssert = new SoftAssert();
    
	@Step("Verify Name of the product")
	public void nameCheck() {
        CartPage.CartProdText = textRetriever(CartPage.CartProductName);
		softAssert.assertEquals(ProductPage.ProdTextName,CartPage.CartProdText);
		System.out.println("Product Matched");

	}
	
	@Step("Verify Price of the product")
	public void priceCheck() {
		
        CartPage.CartPriceText = textRetriever(CartPage.CartProductPrice);
		softAssert.assertEquals(ProductPage.PriceTextName,CartPage.CartPriceText);
		System.out.println("Price Matched");

	}
	
    @Step("Click Checkout button")
	public CheckOutPagefunc clickOnCheckOut() {
		click(CartPage.Checkout);
		return new CheckOutPagefunc(bot);
	}
	
}
