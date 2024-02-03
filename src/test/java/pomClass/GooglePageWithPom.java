package pomClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageWithPom {

	// Declaration
	@FindBy (xpath="//img[@alt='Google']")
	private WebElement googleImage;
	
	@FindBy (name="q")
	private WebElement searchTF;
	
	@FindBy (xpath="//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']")
	private WebElement googleSearchButton;
	
	//Initialization
	
	public GooglePageWithPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	
	public WebElement getGoogleImage()
	{
		return googleImage;
	}
	
	public void setSearchTF(String data)
	{
		 searchTF.sendKeys(data);;
	}
	
	public void clickSearchButton()
	{
		googleSearchButton.submit();
	}
	
}
