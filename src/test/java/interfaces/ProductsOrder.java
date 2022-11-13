package interfaces;

import enums.ProductOrder;
import org.openqa.selenium.By;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public interface ProductsOrder<T extends BasePage> {
    String ORDER_XPATH = "//div[@class='schema-order__list']/div[%s]";

    // id don't know how to return generic
    default void selectProductOrder(ProductOrder productOrder) {
        $(By.className("schema-order__link"))
                .click();
        $(By.xpath(String.format(ORDER_XPATH, productOrder.getOrder())))
                .click();
    }
}
