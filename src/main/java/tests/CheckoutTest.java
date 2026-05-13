package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void addToCartTest() {

        page.navigate("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(page);
        ProductsPage product = new ProductsPage(page);
        CartPage cart = new CartPage(page);

        login.login("standard_user", "secret_sauce");
        product.addFirstProduct();
        cart.openCart();
    }
}
