import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CondtitionalCommands {
    public static void main(String[] args) {


    WebDriver driver=new EdgeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();

		/*Day-22
---------






1) get methods
2) conditional methods
3) Browser methods
4) Navigational methods
5) wait methods

get methods  - we can these methods through webdriver instance
----------
get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()

conditional commands - access these commands thorugh WebElement
----------------------
Returns true/false ( boolean values)

isDisplayed()
isEnabled()
isSelected()


browser methods
---------------
close()
- close single browser window

quit()
*/

    //  isDisplayed()  isEnabled()
    WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    System.out.println("displsy status of logo:"+logo.isDisplayed());

    boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
    System.out.println(status);

    WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
    System.out.println("Dispay status:"+searchbox.isDisplayed());
    System.out.println("Enable status:"+searchbox.isEnabled());

    //isSelected()

    WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
    WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));

    //Before selection
		System.out.println("Before selection...............");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false

    //After selection of male radio button
		System.out.println("After selection of male radiop button............");
		male_rd.click();
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false


    //After selection of fe-male radio button
		System.out.println("After selection of female radiop button............");
		female_rd.click();
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true

}

}
