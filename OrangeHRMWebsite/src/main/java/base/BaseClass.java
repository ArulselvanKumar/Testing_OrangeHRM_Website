package base;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	// ------------Browser Launch---------------
	public static WebDriver BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	// ------------Window Maximize---------------
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// ------------Window Minimize---------------
	public static void minimize() {
		driver.manage().window().minimize();
	}

	// ------------Open URL---------------
	public static void openUrl(String url) {
		driver.get(url);
	}

	// ------------Refresh---------------
	public static void refresh() {
		driver.navigate().refresh();
	}

	// ------------Navigate To---------------
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// ------------Navigate Back---------------
	public static void navigateBack() {
		driver.navigate().back();
	}

	// ------------Navigate Forward---------------
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// ------------Explicit Wait---------------
	public static WebElement ElementWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	// ------------Implicit Wait---------------
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// ------------Java Script click---------------
	public static void js(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0], click();", element);
	}

	// ------------Java Script SendKeys---------------
	public static void jsSendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", element, value);
	}

	// -------------Scroll Down----------------------
	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	// ------------Scroll Up--------------------
	public static void ScrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	// ------------Scroll Into view--------------------
	public static void ScrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0], scrollintoView(true);", element);
	}

	// ------------Scroll Bottom--------------------
	public static void ScrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
	}

	// ------------Scroll Top--------------------
	public static void ScrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}

	// ------------EnterText using JavaScript-------------
	public static void jsSendkeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", element, value);
	}

	// ------------Mouse Hover---------------
	public static void MouseHover(WebElement MHover) {
		Actions actions = new Actions(driver);
		actions.moveToElement(MHover).perform();
	}

	// ------------Drag and Drop---------------
	public static void draganddrop(WebElement drag, WebElement drop) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}

	// ------------Double Click---------------
	public static void doubleclick(WebElement DClick) {
		Actions actions = new Actions(driver);
		actions.doubleClick(DClick).perform();
	}

	public static void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// ------------Right Click---------------
	public static void rightclick(WebElement RClick) {
		Actions actions = new Actions(driver);
		actions.contextClick(RClick).perform();
	}

	// ------------List---------------
	public static List<WebElement> getElements(By list) {
		return driver.findElements(list);
	}

	// ------------Multiple Window Handles---------------
	public static Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	// ------------Single Window Handle---------------
	public static String getwindowHandle() {
		return driver.getWindowHandle();
	}

	// ------------Alert Accept---------------
	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// ------------Alert Dismiss---------------
	public static void dimsissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// ------------Get Alert Text---------------
	public static String getAlertText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	// ------------Send Text to Alert---------------
	public static void SendkeysToAlert(String Sendtext) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Sendtext);
	}

	// ------------Frame Index---------------
	public static void SwitchFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	// ------------Frame Name---------------

	public static void SwitchFrameByName(String name) {
		driver.switchTo().frame(name);
	}

	// ------------Frame Element---------------
	public static void SwitchFrameByElement(WebElement Element) {
		driver.switchTo().frame(Element);
	}

	// ------------Parent Frame---------------
	public static void SwitchParentFrame() {
		driver.switchTo().parentFrame();
	}

	// ------------Main Frame---------------
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// ------------click---------------
	public static void click(WebElement element) {
		element.click();
	}

	// ------------SendKeys---------------
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	// ------------Clear---------------
	public static void clear(WebElement element) {
		element.clear();
	}

	// ------------IsDisplayed---------------
	public static boolean IsDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	// ------------IsEnabled---------------
	public static boolean IsEnabled(WebElement element) {
		return element.isEnabled();
	}

	// ------------IsSelected---------------
	public static boolean IsSelected(WebElement element) {
		return element.isSelected();
	}

	// ------------Submit---------------
	public static void submit(WebElement element) {
		element.submit();
	}

	// ------------Select Visible Text---------------
	public static void SelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// ------------Select value---------------
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// ------------Select Index---------------
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// ------------Get First Selected Option---------------
	public static String getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	// ------------Deselect Visible Text---------------
	public static void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// ------------Deselect value---------------
	public static void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// ------------Deselect Index---------------
	public static void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// ------------Deselect All---------------
	public static void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public static TakesScreenshot Screenshot() {
		return (TakesScreenshot) driver;

	}

	// ------------Window Close---------------
	public static void close() {
		driver.close();
	}

	// ------------Browser close---------------
	public static void quit() {
		driver.quit();
	}

	// ------------get Text---------------
	public static String getText(WebElement element) {
		return element.getText();
	}

	// ------------get Attribute---------------
	public static String getAttribute(WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}

	// ------------get TagName---------------
	public static String getTagName(WebElement element) {
		return element.getTagName();
	}

	// ------------get CSSValue---------------
	public static String getCssValue(WebElement element, String propertyName) {
		return element.getCssValue(propertyName);
	}

	// ------------get current URL---------------
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// ------------get current URL---------------
	public static String getTitle() {
		return driver.getTitle();
	}
}



