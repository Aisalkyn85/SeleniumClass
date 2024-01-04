import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.NoSuchElementException;

public class FirstDayDemo {
    public static void main(String[] args) throws InterruptedException {
        /*1) Identifying elements - Locators
2) Perform actions - Methods

Locator - Locate the web elements

findElement()
findElements()

length - arrays   a.length
lenght() - string   s.lenght()
size()- List, Set, HashMap

findElement(loc) ----> WebElement
findElements(loc) ----> List<WebElement>

Scenario1:  locator is matching with single web element.
-------
findElement(loc) ---->single webelement   WebElement
findElements(loc)--->single webelement		List<WebElement>

Scenario2: locator is matching with multiple web elements
------------------
findElement(loc)---->single webelement(first)    WebElement
findElements(loc) ---> multiple web elements      List<WebElement>

Scenario3: locator is incorect ( No elements are not matching with locator)
------
findElement(loc)----> NoSuchElementException
findElements(loc)--->returns zero
*/

        //System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

        //1) Launch browser
        //ChromeDriver driver=new ChromeDriver();
        WebDriver driver=new EdgeDriver();

        //2) open url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize(); // maximize the page


        Thread.sleep(5000);

        //3) Provide username  - Admin
        //WebElement txtUsername=driver.findElement(By.name("username"));
        //txtUsername.sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("Admin");

        //4) Provide password  - admin123
        driver.findElement(By.name("password")).sendKeys("admin123");










        //5) Click on Submit button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(7000);

        //6) Verify the title of dashboard page
        //Title validation
		/*String act_title=driver.getTitle();
		String exp_title="OrangeHRM";

		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("failed");
		}
		*/

        // Lable validation after successful login
        String act_label = "";
        try
        {
            act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        }
        catch(NoSuchElementException e)	{
        }

        String exp_label="Dashboard";

        if(act_label.equals(exp_label))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }

        //7) close browser
        //driver.close();
        driver.quit();

    }
}
