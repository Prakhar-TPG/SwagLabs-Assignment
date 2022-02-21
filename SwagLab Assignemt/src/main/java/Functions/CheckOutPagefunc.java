package Functions;

import org.openqa.selenium.WebDriver;
import object_repository.*;
import utils.CoreActions;
import io.qameta.allure.Step;

public class CheckOutPagefunc extends CoreActions {

	public CheckOutPagefunc(WebDriver bot) {
		super(bot);
	}

    @Step("Enter information for checkout")
	public void NamePincode() {
		enterFirstNameText(CheckOutPage.First_name);
        enterLastNameText(CheckOutPage.Last_name);
        enterPostalcode(CheckOutPage.Pincode);
        sleep(2);

	}
    
    @Step("Click Continue button")
	public CompletePagefunc clickOnContinue() {
		click(CheckOutPage.continue_button);
		return new CompletePagefunc(bot);

	}
	

}
