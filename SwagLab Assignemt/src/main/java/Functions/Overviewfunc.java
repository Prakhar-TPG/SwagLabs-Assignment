package Functions;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import object_repository.*;
import utils.CoreActions;

public class Overviewfunc extends CoreActions {
	public Overviewfunc(WebDriver bot) {
        super(bot);
    }
	
	@Step("Click on finish button")
	public FinalPagefunc ClickOnFinish() {
		click(Overview.finish);
        sleep(2);
		return new FinalPagefunc(bot);

	}
}