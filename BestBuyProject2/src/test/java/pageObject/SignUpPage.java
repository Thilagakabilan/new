package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class SignUpPage extends BasePage {

	@FindBy(xpath = "//div//following::a[@href='/identity/global/createAccount']")
	private WebElement createAccount;

	@FindBy(xpath = "//span[contains(text(),'Account')]")
	private WebElement account;

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='fld-p1']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	private WebElement password1;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//span[contains(text(),'Hi, ')]")
	private WebElement signInText;

	@FindBy(xpath = "//p[contains(text(),'Please enter your last name.')]")
	private WebElement signInerrortext;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String signInText() {
		return signInText.getText();
	}

	public void signUp() {

		wait(account);
		account.click();
		wait(createAccount);
		createAccount.click();
		firstName.sendKeys("thilak");
		lastName.sendKeys("kabil");
		email.sendKeys("thilak656@gmail.com");
		password.sendKeys("abcxyzauto@123");
		password1.sendKeys("abcxyzauto@123");
		phone.sendKeys("9884626994");
		submit.click();
	}

	public String signInerrortext() {
		return signInerrortext.getText();
	}

	public void signUpInvalid() {

		wait(account);
		account.click();
		wait(createAccount);
		createAccount.click();
		firstName.sendKeys("test");
		email.sendKeys("test123@gmail.com");
		password.sendKeys("test123@123");
		password1.sendKeys("test123@456");
		phone.sendKeys("9874587541");
		submit.click();
	}
}
