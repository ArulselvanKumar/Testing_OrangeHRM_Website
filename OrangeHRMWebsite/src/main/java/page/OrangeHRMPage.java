package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {

	WebDriver driver;

	public OrangeHRMPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input)")
	public WebElement userName;
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	public WebElement pim;
	@FindBy(xpath = "//a[text()='Add Employee']")
	public WebElement addEmployee;
	@FindBy(name = "firstName")
	public WebElement firstName;
	@FindBy(name = "middleName")
	public WebElement middleName;
	@FindBy(name = "lastName")
	public WebElement lastName;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement save;
	@FindBy(linkText = "Employee List")
	public WebElement employeeList;
	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[1]")
	public WebElement employeeName;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement search;
}
