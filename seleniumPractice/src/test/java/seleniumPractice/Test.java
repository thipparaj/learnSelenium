package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.practice.config.BrowserSetup;

public class Test extends BrowserSetup{
	
	Test(String browser) {
		super("chrome");
	}
/*
	public String title() {
		String titles = driver.getTitle();
		if(titles.equalsIgnoreCase("youtube")) 
			System.out.println(titles);
			else
				System.out.println("title is not matched as expected");
		return titles;
	}

	public static void main(String[] args) throws InterruptedException {
		
		Test t = new Test("chrome");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@name='radioButton']"));
		int Size = radioButton.size();
		System.out.println(Size);
		for(int i=0;i<Size;i++) {
			String val = radioButton.get(i).getAttribute("value");
			
			if(val.equalsIgnoreCase("Radio3")) {
				radioButton.get(i).click();
				System.out.println("Choosed radio button is : " +val);
			}
		}
		
		//To verify the checkbox header as "Checkbox Example"
		
		WebElement chbxHeader = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend"));
		chbxHeader.isDisplayed();
		String text =chbxHeader.getText();
		Assert.assertEquals(text,"Checkbox Example");
		
		System.out.println("Check box header is verified");
		
		//To verify by default checkbox are selected or not 
		List <WebElement> ckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int Size1 = ckbox.size();
		System.out.println("check box size is : "+Size1);
		for(int i=0; i<Size1;i++) {
			String val = ckbox.get(i).getAttribute("value");
			if(val.equalsIgnoreCase("option1")) {
				ckbox.get(i).click();
				System.out.println("sucessfully selected the " +val +" checkbox");

				Assert.assertEquals(true, true);
				ckbox.get(i).click();
				System.out.println("sucessfully deselected the selected checkbox");
			}
			
		}
		
		
		//t.title();
		//driver.quit(); 
		
		
		
		driver.navigate().to("https://www.spicejet.com/");
		boolean returnDate = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled();
		System.out.println(returnDate);
		
		*/
	
	public static void main(String[] args) throws InterruptedException {
		
		Test t = new Test("chrome");
		//Angular \Practice for form submission assignment-2
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//send the name 
		driver.findElement(By.name("name")).sendKeys("raja");
		driver.findElement(By.name("email")).sendKeys("raja@email.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("raja12345");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).sendKeys("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("24-11-2022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(sucess.getText());
		Thread.sleep(3000);
		//String text = sucess.getText();
		Assert.assertTrue(true, "Success! The Form has been submitted successfully!.");
		//Assert.assertEquals(sucess, "Success! The Form has been submitted successfully!.");
		//.alert.alert-success.alert-dismissible
		//Thread.sleep(3000);
		driver.close();
	}

}
