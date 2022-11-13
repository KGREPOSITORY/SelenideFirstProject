import enums.CatalogItem;
import enums.ComputerAndNetworkItem;
import enums.LaptopsComputersScreensItem;
import enums.ProductOrder;
import enums.TopBarMenuSection;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.DisplaysPage;
import pages.MainPage;

public class FirstTest extends BaseTest {

    @Test
    public void someTest() {
        new MainPage()
                .clickSelectedSectionOnTopBarMenu(TopBarMenuSection.CATALOG);
        new CatalogPage()
                .selectCatalogItem(CatalogItem.COMPUTERS_AND_NETWORK)
                .new ComputersAndNetworkSection()
                .selectComputersAndNetworkItem(ComputerAndNetworkItem.LAPTOPS_COMPUTERS_DISPLAYS)
                .new ComputersAndNetworkSection()
                .new LaptopsComputersScreensSection()
                .selectLaptopsComputersDisplaysItem(LaptopsComputersScreensItem.ALL_SCREENS);
        new DisplaysPage().selectProductOrder(ProductOrder.BY_CHEAPER);
        Assert.assertTrue(new DisplaysPage().assertOrder(ProductOrder.BY_CHEAPER));

    }
}
