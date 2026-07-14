package steps;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.OrangeHRMPage;

public class StepDefinitions extends BaseClass {
	OrangeHRMPage op = new OrangeHRMPage(driver);

@Given("user launches the Application URL")
public void user_launches_the_application_url() {
    openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("user in on login page")
public void user_in_on_login_page() {
	ElementWait(op.userName);
   sendkeys(op.userName,"Admin");
   sendkeys(op.passWord,"admin123");
   click(op.login);
   
}

@When("user should navigate to pim and click the pim")
public void user_should_navigate_to_pim_and_click_the_pim() {
	ElementWait(op.pim);
    click(op.pim);
    
}

@When("user click the add employee")
public void user_click_the_add_employee() {
	ElementWait(op.addEmployee);
	click(op.addEmployee);
}

@When("user enters the valid credentials in Employee First Name")
public void user_enters_the_valid_credentials_in_employee_first_name() {
	ElementWait(op.firstName);
    sendkeys(op.firstName,"Neymar");
    
}

@When("user enters the valid credentials in Employee Middle Name")
public void user_enters_the_valid_credentials_in_employee_middle_name() {
	sendkeys(op.middleName,"John");
}

@When("user enters the valid credentials in Employee Last Name")
public void user_enters_the_valid_credentials_in_employee_last_name() {
	 sendkeys(op.lastName,"L");
}


@Then("user click the save button new employee should be successfully created")
public void user_click_the_save_button_new_employee_should_be_successfully_created() {
    click(op.save);
}

@When("user click the employee list")
public void user_click_the_employee_list() {
	ElementWait(op.employeeList);
   click(op.employeeList);
}

@When("user enters the newly created employee name in Employee name field")
public void user_enters_the_newly_created_employee_name_in_employee_name_field() {
	ElementWait(op.employeeName);
    sendkeys(op.employeeName,"Neymar");
}

@Then("user click the search button newly created employee name should be displayed in record found section")
public void user_click_the_search_button_newly_created_employee_name_should_be_displayed_in_record_found_section() {
    click(op.search);
}

}
