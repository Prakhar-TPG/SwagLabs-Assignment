package Functions;

import org.openqa.selenium.WebDriver;
import All_Pages.*;
import Basic.CoreActions;
import org.testng.Assert;


public class CartPagefunc extends CoreActions {
	public CartPagefunc(WebDriver bot) {
		super(bot);
	}

	public void nameCheck() {
        CartPage.CartProdText = textRetriever(CartPage.CartProductName);
		Assert.assertEquals(ProductPage.ProdTextName,CartPage.CartProdText);
		System.out.println("Product Matched");

	}

	public void priceCheck() {
		
        CartPage.CartPriceText = textRetriever(CartPage.CartProductPrice);
		Assert.assertEquals(ProductPage.PriceTextName,CartPage.CartPriceText);
		System.out.println("Price Matched");

	}
	
	public void clickOnCheckOut() {
		click(CartPage.Checkout);
	}
	
}
