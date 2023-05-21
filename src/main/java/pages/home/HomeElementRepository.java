package pages.home;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import pages.BaseElementRepository;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomeElementRepository extends BaseElementRepository {

    private final SelenideElement signIn =
            $(By.xpath("//a[@href='/home']/following-sibling::div/a[text()='Log in']"));
    private final SelenideElement nameInput = $(By.xpath("//*[@id='login-form']//*[@name='user']"));

}
