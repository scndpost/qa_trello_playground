package pages.home;

import com.codeborne.selenide.Condition;
import pages.BasePage;

public class HomePage extends BasePage<HomeElementRepository> {

    public HomePage() {
        super(new HomeElementRepository());
    }

    public void clickSignIn() {
        elementRepository.getSignIn().click();
    }

    public void verifyNameInputIsEditable() {
        elementRepository.getNameInput().shouldHave(Condition.editable);
    }

}
