package pages;

import enums.TopBarMenuSection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    final String topBarMenuSections = "//ul[@class='b-main-navigation']//span[text()='%s']";

    public void clickSelectedSectionOnTopBarMenu(TopBarMenuSection topBarMenuSection){
        $(By.xpath(String.format(topBarMenuSections, topBarMenuSection.getSection()))).click();
    }
}
