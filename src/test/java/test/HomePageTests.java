package test;

import com.codeborne.selenide.Selenide;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.home.HomePage;

@Test
public class HomePageTests extends BaseTest {

    public void openTrelloHomePage() {
        Selenide.open("https://trello.com/");
        String title = Selenide.title();
        Assertions.assertThat(title).isEqualTo("Manage Your Team’s Projects From Anywhere | Trello");
        HomePage homePage = new HomePage();
        homePage.clickSignIn();
        homePage.verifyNameInputIsEditable();
    }
}
