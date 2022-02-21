package Functions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import object_repository.*;
import utils.CoreActions;

public class ProductPagefunc extends CoreActions {
	public ProductPagefunc(WebDriver bot) {
		super(bot);
	}
	
	 @Step("Adding the product to Cart")
	 public void clickOnAddToCart() throws InterruptedException {
		ProductPage.ProdTextName = textRetriever(ProductPage.ProductName);
		ProductPage.PriceTextName = textRetriever(ProductPage.ProductPrice);
    	click(ProductPage.add_cart);
        Thread.sleep(1000);
    }
	
	@Step("Click on Cart button")
	public CartPagefunc clickOnCart() throws InterruptedException {
		click(ProductPage.Cart_btn);
        Thread.sleep(1000);
        return new CartPagefunc(bot);

	}

}
