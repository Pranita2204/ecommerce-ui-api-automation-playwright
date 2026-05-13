package pages;

import com.microsoft.playwright.Page;

public class CartPage {

    Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void openCart() {
        page.click(".shopping_cart_link");
    }
}
