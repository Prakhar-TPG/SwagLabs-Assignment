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
			bot.findElements(FinalPage.checkitem).isEmpty();
			System.out.println("No Product Found");
		}

    }
}
