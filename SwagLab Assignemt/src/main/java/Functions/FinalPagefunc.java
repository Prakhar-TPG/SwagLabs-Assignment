package Functions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Step;
import object_repository.*;
import utils.CoreActions;

public class FinalPagefunc extends CoreActions {
	public FinalPagefunc(WebDriver bot) {
		super(bot);
	}
	SoftAssert softAssert = new SoftAssert();
	public void clickOnCart() {
		click(ProductPage.Cart_btn);
	}
	@Step("Verify item is removed")
	public void checkitem() {
	{
		Boolean isPresent = bot.findElements(FinalPage.checkitem).size() ==0;
		softAssert.assertTrue(isPresent,"Cart is empty");
		System.out.println(isPresent);
		
		}

    }
}