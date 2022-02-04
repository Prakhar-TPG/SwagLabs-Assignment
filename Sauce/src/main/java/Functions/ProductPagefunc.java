package Functions;

import org.openqa.selenium.WebDriver;
import All_Pages.ProductPage;
import Basic.CoreActions;

public class ProductPagefunc extends CoreActions {
	public ProductPagefunc(WebDriver bot) {
		super(bot);
	}
	
	public void clickOnAddToCart() throws InterruptedException {
		ProductPage.ProdTextName = textRetriever(ProductPage.ProductName);
		ProductPage.PriceTextName = textRetriever(ProductPage.ProductPrice);
    	click(ProductPage.add_cart);
        Thread.sleep(1000);
    }
	
	public void clickOnCart() throws InterruptedException {
		click(ProductPage.Cart_btn);
        Thread.sleep(1000);

	}

}
