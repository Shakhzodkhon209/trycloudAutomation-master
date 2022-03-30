package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TopDashboardMenu;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Usb_StepDef {
    LoginPage loginPage = new LoginPage();
    TopDashboardMenu topDashboardMenu = new TopDashboardMenu();
    FilePage filesPage = new FilePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        topDashboardMenu.files.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actions.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        filesPage.details.click();
    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.comments.click();
        filesPage.input.click();
        filesPage.input.sendKeys("text");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.arrow.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        Assert.assertEquals("text",filesPage.text.getText());
    }



}
