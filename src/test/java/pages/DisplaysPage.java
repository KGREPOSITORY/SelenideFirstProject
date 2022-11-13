package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import enums.ProductOrder;
import interfaces.ProductsOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class DisplaysPage extends BasePage implements ProductsOrder<DisplaysPage> {

    public boolean assertOrder(ProductOrder expectedProductOrder) { //method should be in some productAbstract class\interface
        boolean result = false;
        ElementsCollection elements =
                $$(By.xpath("//div[@class='schema-product']//div[contains(@class,'price')]" +
                        "/a[not(contains(@class,'secondary'))]//span[@data-bind]"))
                        .should(CollectionCondition.allMatch("", WebElement::isDisplayed), Duration.ofSeconds(10));
        List<String> actualCostsString = elements.texts();
        actualCostsString.replaceAll(x -> x.replaceAll("[^\\w,]", "").replaceAll(",", "."));
        List<Double> actualCostsDouble = actualCostsString
                .stream()
                .mapToDouble(Double::parseDouble)
                .boxed()
                .collect(Collectors.toList());
        switch (expectedProductOrder) {
            case BY_CHEAPER:
                List<Double> expectedCostsDouble = actualCostsDouble
                        .stream()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());
                result = expectedCostsDouble.equals(actualCostsDouble);

                break;
            case BY_POPULARITY:
                break;
        }
        return result;

    }
}
