package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactPageObjects extends BasePage {

    @FindBy(id ="et_pb_contact_name_0") WebElement nameBox;
    @FindBy(id ="et_pb_contact_company_0") WebElement companyBox;
    @FindBy(id ="et_pb_contact_email_0") WebElement emailBox;
    @FindBy(id ="et_pb_contact_phone_number_0") WebElement phoneBox;
    @FindBy(id ="et_pb_contact_message_0") WebElement messageBox;
    @FindBy(name ="et_builder_submit_button") WebElement submitBtn;


    public contactPageObjects(WebDriver driver) {super(driver);}

    {
        driver.get("https://www.healthcourse.com/contact/");
    }


    public boolean enterName(String text) throws InterruptedException{nameBox.sendKeys(text);return true; }
    public boolean enterCompanyBox(String text) throws InterruptedException{companyBox.sendKeys(text);return true; }
    public boolean enterEmailBox(String text) throws InterruptedException{emailBox.sendKeys(text);return true; }
    public boolean enterPhoneBox(String text) throws InterruptedException{phoneBox.sendKeys(text);return true; }
    public boolean enterMessageBox(String text) throws InterruptedException{messageBox.sendKeys(text);return true; }
    public boolean submitBtnClick(){submitBtn.click();return true;}


}
