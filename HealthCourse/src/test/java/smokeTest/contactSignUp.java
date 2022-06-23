package smokeTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.contactPageObjects;

public class contactSignUp  extends contactPageObjects {

    contactPageObjects contactSignUp;

    @BeforeClass
        public void beforeTest(){contactSignUp=new contactPageObjects(driver);}

    public contactSignUp(WebDriver driver) {super(driver);}


    @Test
    public void enterName() throws InterruptedException {Assert.assertTrue(contactSignUp.enterName("qainterview"));}

    @Test
    public void enterCompanyBox() throws InterruptedException {Assert.assertTrue(contactSignUp.enterCompanyBox("realcme"));}

    @Test
    public void enterEmailBox() throws InterruptedException {Assert.assertTrue(contactSignUp.enterEmailBox("winie@tyninja.io"));}

    @Test
    public void enterPhoneBox() throws InterruptedException {Assert.assertTrue(contactSignUp.enterPhoneBox("999 999 9999"));}

    @Test
    public void enterMessageBox() throws InterruptedException {Assert.assertTrue(contactSignUp.enterMessageBox("This is an assignment for QA position. Please Ignore."));}

    @Test
    public boolean submitBtnClick(){Assert.assertTrue(contactSignUp.submitBtnClick());
        return true;
    }








}
