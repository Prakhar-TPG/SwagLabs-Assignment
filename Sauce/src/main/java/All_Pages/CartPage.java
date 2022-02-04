package All_Pages;

import org.openqa.selenium.By;

public class CartPage {

    public static final By CartProductName = By.xpath("//*[@id='item_1_title_link']/div");
    public static final By CartProductPrice = By.xpath("//div[@class= 'inventory_item_price']");
	public static final By Item = By.xpath("//*[@id='item_1_title_link']/div");
    public static final By Checkout = By.xpath("//button[@id = 'checkout']");
    public static String CartProdText;
    public static String CartPriceText;







}