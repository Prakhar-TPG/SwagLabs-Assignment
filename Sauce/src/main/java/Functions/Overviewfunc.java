package Functions;

import org.openqa.selenium.WebDriver;
import All_Pages.Overview;
import Basic.CoreActions;

public class Overviewfunc extends CoreActions {
	public Overviewfunc(WebDriver bot) {
        super(bot);
    }
	public void ClickOnFinish() {
		click(Overview.finish);

	}
}