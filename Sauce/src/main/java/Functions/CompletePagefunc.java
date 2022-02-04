package Functions;

import org.openqa.selenium.WebDriver;
import All_Pages.CompletePage;
import Basic.CoreActions;

public class CompletePagefunc extends CoreActions {
	public CompletePagefunc(WebDriver bot) {
        super(bot);
    }
	public void ClickOnHome() {
		click(CompletePage.Home_btn);

	}
}