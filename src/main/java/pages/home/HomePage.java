package pages.home;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.BasePage;

public class HomePage extends BasePage<HomeElementRepository> {

    public HomePage() {
        super(new HomeElementRepository());
    }

    @Step("{method}")
    public void clickSignIn() {
        elementRepository.getSignIn().click();
    }

    @Step("{method}")
    public void verifyNameInputIsEditable() {
        elementRepository.getNameInput().shouldHave(Condition.editable);
    }

}
