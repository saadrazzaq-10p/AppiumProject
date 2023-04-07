package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SignUpPage {

    public SignUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);

    }

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement continue_with_email;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement enter_email;

    @FindBy(id = "com.booking:id/identity_landing_social_button")
    public WebElement continue_Button;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public List<WebElement> enter_password;

    // @FindBy(id="com.booking:id/identity_text_input_edit_text")
    // public WebElement confirm_password;

    public void enterEmail(String email) {
        enter_email.click();
        enter_email.sendKeys(email);
        continue_Button.click();
    }

    public void enter_password(String pass) {

        enter_password.get(0).sendKeys(pass);
        enter_password.get(1).sendKeys(pass);
    }

}
