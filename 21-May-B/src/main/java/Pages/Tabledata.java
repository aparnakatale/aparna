package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Tabledata {
	//@FindBy(xpath="//table[@id='customers']//tr[2]//td")
	//private List<WebElement> tabledta;
	
	
	@FindAll
	({
		@FindBy(xpath="//table[@id='customers']//tr[2]//td"),
		@FindBy(xpath="//table[@id='customers']//tr[3]//td"),
		@FindBy(xpath="//table[@id='customers']//tr[4]//td"),
		@FindBy(xpath="//table[@id='customers']//tr[5]//td")
	})
	private List<WebElement> multipleElement;
	
	
	public Tabledata(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void performMultipleaction()
	{
		System.out.println(multipleElement.size());
		for(int i=0;i<multipleElement.size();i++)
		{
			
			System.out.print(multipleElement.get(i).getText()+", ");
			System.out.println();
			
			
		}
	}
	
 /* public void getTabletext()
  {
	  for(int i=0;i<tabledta.size();i++)
	  {
		 System.out.println(tabledta.get(i).getText()); 
	  }
  }*/
}
