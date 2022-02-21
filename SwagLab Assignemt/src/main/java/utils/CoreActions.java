package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.writer;



public class CoreActions {
	protected final WebDriver bot;
	protected final WebDriverWait delay;

    @SuppressWarnings("deprecation")
	protected CoreActions(WebDriver bot) {
        this.bot = bot;
        this.delay = new WebDriverWait(bot, 10);
    }
    
    protected void enterText(By element, String text) {
        bot.findElement(element).sendKeys(text);
    }
    
    protected void enterFirstNameText(By element) {
        bot.findElement(element).sendKeys(writer.firstName);
    }
    
    protected void enterLastNameText(By element) {
        bot.findElement(element).sendKeys(writer.lastName);
    }
    
    protected void enterPostalcode(By element) {
        bot.findElement(element).sendKeys(writer.postalCode);
    }
    
    protected void click(By element) {
        bot.findElement(element).click();
    }

    protected String textRetriever(By element){
        return bot.findElement(element).getText();
    }
    
    
    public static void sleep(double sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

