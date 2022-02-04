package Functions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import All_Pages.ProductPage;
import Basic.CoreActions;

public class FinalPagefunc extends CoreActions {
	public FinalPagefunc(WebDriver bot) {
		super(bot);
	}
	public void clickOnCart() {
		click(ProductPage.Cart_btn);
	}
	public void checkitem() {
	{
			Boolean Present = bot.findElements(ProductPage.checkitem).size() > 0;
			System.out.println(Present);
			Assert.assertEquals(Present,"No Product");
		}

    }
}