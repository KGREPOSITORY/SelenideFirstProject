package pages;

import enums.CatalogItem;
import enums.ComputerAndNetworkItem;
import enums.LaptopsComputersScreensItem;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CatalogPage extends BasePage {

    private final String catalogItemsBar = "//ul[contains(@class,'catalog-navigation-classifier')" +
            " and not(contains(@class,'brand'))]/li[@data-id=%d]";

    public CatalogPage selectCatalogItem(CatalogItem catalogItem) {
        $(By.xpath(String.format(catalogItemsBar, catalogItem.getItem()))).click();
        return page(CatalogPage.class);
    }


    public class ComputersAndNetworkSection {

        public ComputersAndNetworkSection() {
        }

        private final String computersAndNetworkItemsList =
                    "//div[contains(@class,'catalog-navigation_opened')]//div[contains(text(),'%s')]";

        public CatalogPage selectComputersAndNetworkItem(ComputerAndNetworkItem computerAndNetworkItem) {
            $(By.xpath(String.format(computersAndNetworkItemsList, computerAndNetworkItem.getItem()))).click();
            return  page(CatalogPage.class); //probably java bug there
        }

        public class LaptopsComputersScreensSection {

            public LaptopsComputersScreensSection() {
            }

            private final String items = "//span[contains(text(),'%s')]";

            public void selectLaptopsComputersDisplaysItem(LaptopsComputersScreensItem laptopsComputersScreensItem){
                $(By.xpath(String.format(items, laptopsComputersScreensItem.getItem()))).click();
            }
        }

    }
}
