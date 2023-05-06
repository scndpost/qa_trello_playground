package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HomePage;

@Test
public class BaseTests {

    public void openTrelloHomePage() {
        Configuration.browser = "edge";
        Selenide.open("https://trello.com/");
        String title = Selenide.title();
        Assertions.assertThat(title).isEqualTo("Manage Your Team’s Projects From Anywhere | Trello");
        HomePage homePage = new HomePage();
        homePage.clickSignIn();
        homePage.verifyNameInputIsEditable();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
