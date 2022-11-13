import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {

    @BeforeTest
    public void beforeTest(){
        open("https://www.onliner.by/");
    }
}
