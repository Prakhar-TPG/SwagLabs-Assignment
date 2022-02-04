package core;

import Basic.Bot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CoreTestIntegration {

    protected WebDriver bot;
    protected static final String URL = "https://www.saucedemo.com/";

    @BeforeClass
    public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar.srivasatava\\eclipse-workspace\\QA_training\\resources\\chromedriver.exe");
		bot = new Bot().getBot();
        bot.get(URL);
        bot.manage().window().maximize();
        bot.manage().deleteAllCookies();
    }

    @AfterClass
    public void closeBrowser() {
        bot.quit();
    }
}
