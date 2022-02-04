package Functions;

import org.openqa.selenium.WebDriver;
import All_Pages.*;
import Basic.CoreActions;

public class CheckOutPagefunc extends CoreActions {

	public CheckOutPagefunc(WebDriver bot) {
		super(bot);
	}

	public void enterFirstName(String firstName) {
		enterText(CheckOutPage.First_name, firstName);
	}
	
	public void enterLastName(String lastName) {
		enterText(CheckOutPage.Last_name, lastName);
	}

	public void enterPostalCode(String postalCode) {
		enterText(CheckOutPage.Pincode, postalCode);
	}
	
	public void clickOnContinue() {
		click(CheckOutPage.continue_button);
	}
	

}
