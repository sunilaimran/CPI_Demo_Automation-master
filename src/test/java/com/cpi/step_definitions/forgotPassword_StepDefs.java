package com.cpi.step_definitions;

import com.cpi.utilities.BrowserUtils;
import com.cpi.utilities.ConfigurationReader;
import com.cpi.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class forgotPassword_StepDefs {

    @When("the user navigates to CPI home page")
    public void the_user_navigates_to_CPI_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(1);
    }

    @And("the user clicks on the My Account")
    public void the_user_clicks_on_the_My_Account() {
        String myAccountLocator="//ul/li/a[@href='/Sign-In']";
        Driver.get().findElement(By.xpath(myAccountLocator)).click();
        BrowserUtils.waitFor(3);
    }

    @And("the user clicks on the Forgot Password")
    public void the_user_clicks_on_the_Forgot_Password() {
        String forgotPasswordLocator="//a[@class='field-link float-right']";
        Driver.get().findElement(By.xpath(forgotPasswordLocator)).click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should see the Forgot Password page opens properly")
    public void the_user_should_see_the_Forgot_Password_page_opens_properly() {
        //I verify that the Forgot Password title is visible in the new page
        String forgotPasswordTitleLocator="//h1[@class='brand-form-title mb-2']";

        String actualTextfromUI = Driver.get().findElement(By.xpath("//h1[@class='brand-form-title mb-2']")).getText();
        String expectedText="Forgot Password"; //which I can see my bare eyes

        System.out.println("expectedText = " + expectedText);
        System.out.println("actualTextfromUI = " + actualTextfromUI);
        Assert.assertEquals("Alert Message: They are not equal!",expectedText,actualTextfromUI);





    }
}
