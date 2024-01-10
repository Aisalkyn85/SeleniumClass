import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {
    /*
    * get method :
    * conditional method
    * Browser methods
    * Navigational methods
    * wait method
    *
    * get:
    * url();
    * getTitle();
    * getCurrentUrl();
    * getWindowHandle();
    * getWindowHandles();
    *
    * conditional methods:  return boolean
    * isDisplayed(); true/ false
    *
    * isEnabled();
    * isSelected();
    *
    * close();
    * quit();
    * */
    public static void main(String[] args) {
       WebDriver driver = new EdgeDriver();

       driver.get("https://demo.nopcommerce.com/register");

        System.out.println("title of page "+driver.getTitle());
       //driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']"));
        System.out.println("Get current ulr "+driver.getCurrentUrl());
        String ps = driver.getPageSource();
        System.out.println(ps);
        System.out.println(ps.contains("html"));

    }

}
