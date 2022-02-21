package Functions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import object_repository.CompletePage;
import utils.CoreActions;

public class CompletePagefunc extends CoreActions {
	public CompletePagefunc(WebDriver bot) {
        super(bot);
    }
	
    @Step("Click Home button")
	public Overviewfunc ClickOnHome() {
		click(CompletePage.Home_btn);
        sleep(2);
		return new Overviewfunc(bot);


	}
}