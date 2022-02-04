package All_Pages;

import org.openqa.selenium.By;

public class ProductPage {

    public static final By ProductName = By.xpath("//*[@id='item_1_title_link']/div");
    public static final By ProductPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div");
    public static final By add_cart = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final By Cart_btn = By.xpath("//*[@id='shopping_cart_container']");
    public static final By checkitem = By.xpath("//*[@id='shopping_cart_container']/a/span");
    public static String ProdTextName;
    public static String PriceTextName;
}