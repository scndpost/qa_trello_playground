package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class HomePage {

    SelenideElement signIn = Selenide.$(By.xpath("//a[@href='/home']/following-sibling::div/a[text()='Log in']"));
    SelenideElement nameInput = Selenide.$(By.xpath("//*[@id='login-form']//*[@name='user']"));

    public void clickSignIn() {
        signIn.click();
    }

    public void verifyNameInputIsEditable() {
        nameInput.shouldHave(Condition.editable);
    }

}
