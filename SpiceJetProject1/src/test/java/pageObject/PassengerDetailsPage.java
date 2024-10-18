package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class PassengerDetailsPage extends BaseClass {

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	private WebElement continueBtn;

	@FindBy(xpath = "//div[@data-testid='title-contact-detail-card']")
	private WebElement title;

	@FindBy(xpath = "//div[contains(text(),'Mrs')]")
	private WebElement titleSelect;

	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	private WebElement phone;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	private WebElement email;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	private WebElement city;

	@FindBy(xpath = "//div[contains(text(),'I am flying as the primary passenger')]")
	private WebElement primarycustomerCheckbox;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	private WebElement continueBooking;

	@FindBy(xpath = "//input[@id='card_number']")
	private WebElement cardNumber;

	@FindBy(xpath = "//input[@id='name_on_card']")
	private WebElement nameoncard;

	@FindBy(xpath = "//input[@id='card_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath = "//input[@id='card_exp_year']")
	private WebElement expYear;

	@FindBy(xpath = "//input[@id='security_code']")
	private WebElement cvv;

	@FindBy(xpath = "//div[contains(.,'Continue')]")
	private WebElement continuetopayment;

	@FindBy(xpath = "//input[@data-testid='common-proceed-to-pay']")
	private WebElement proceedtopay;

	@FindBy(xpath = "//div[@id='payment_form_card_number_error']")
	private WebElement paymenterror;

	@FindBy(id = "at_addon_close_icon")
	private WebElement closebutton;

	@FindBy(xpath = "//div[@id='pax-item-MSFBRFQ-']")
	private WebElement passenger2;

	@FindBy(xpath = "//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	private WebElement NamePassenger2;
	
	@FindBy(xpath = "//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	private WebElement lastNamePassenger2;
	
	@FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
	private WebElement phonePassenger2;
	
	@FindBy(xpath = "//div[@id='pax-item-MiFDSEQ-']")
	private WebElement Passenger3;
	
	@FindBy(xpath = "//div[@data-testid='traveller-2-title-field']")
	private WebElement Passenger3Title;
	
	@FindBy(xpath = "(//div[contains(text(),'Mrs')])[3]")
	private WebElement Passenger3TitleSelect;

	@FindBy(xpath = "//input[@data-testid='traveller-2-first-traveller-info-input-box']")
	private WebElement Passenger3Name;
	
	@FindBy(xpath = "//input[@data-testid='traveller-2-last-traveller-info-input-box']")
	private WebElement Passenger3LastName;
	
	public PassengerDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void bookFlight() throws InterruptedException {
		wait(continueBtn);
		continueBtn.click();
		wait(title);
		title.click();
		titleSelect.click();
		firstName.sendKeys("Thilak");
		lastname.sendKeys("Kabilan");
		phone.sendKeys("9884626994");
		email.sendKeys("thilagakabil@gmail.com");
		city.sendKeys("CJB");
		primarycustomerCheckbox.click();
		scroll();
		continueBooking.click();
		wait(continuetopayment);
		scroll();
		scrolltoLast();
		scrollToElement(continuetopayment);
		continuetopayment.click();
		cardNumber.sendKeys("4587 5874 9654 3521");
		nameoncard.sendKeys("Thilak");
		expMonth.sendKeys("12");
		expYear.sendKeys("25");
		cvv.sendKeys("054");
		proceedtopay.click();
		implicitWait();

	}


	public void passengerDetails() throws InterruptedException {
		wait(continueBtn);
		continueBtn.click();
		wait(title);
		title.click();
		titleSelect.click();
		firstName.sendKeys("Kabil");
		lastname.sendKeys("Tamil");
		phone.sendKeys("9874587458");
		email.sendKeys("kabiltamil@gmail.com");
		city.sendKeys("CJB");
		primarycustomerCheckbox.click();
		scroll();
		passenger2.click();
		NamePassenger2.sendKeys("Harshith");
		lastNamePassenger2.sendKeys("Krishna");
		phonePassenger2.sendKeys("9874587458");
		scroll();
		Passenger3.click();
		Passenger3Title.click();
		Passenger3TitleSelect.click();
		Passenger3Name.sendKeys("Krithvik");
		Passenger3LastName.sendKeys("Kabilan");
		scroll();
		continueBooking.click();
		wait(continuetopayment);
		scrolltoLast();
		continuetopayment.click();

		cardNumber.sendKeys("8798 3654 1258 9547");
		nameoncard.sendKeys("Harshith");
		expMonth.sendKeys("11");
		expYear.sendKeys("25");
		cvv.sendKeys("987");
		proceedtopay.click();
		implicitWait();

	}


	public String paymenterrorText() {
		return paymenterror.getText();
	}
}
