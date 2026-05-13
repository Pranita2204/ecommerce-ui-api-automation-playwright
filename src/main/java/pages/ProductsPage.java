package pages;

import com.microsoft.playwright.Page;

public class ProductsPage {

    Page page;

    public ProductsPage(Page page) {
        this.page = page;
    }

    public void addFirstProduct() {
        page.click(".inventory_item button");
    }
}
