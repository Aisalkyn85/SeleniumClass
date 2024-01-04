import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IdNameLinkText {
    public static void main(String[] args) {
        /*
        * findelement  - single element
        * findelemtns - multiple elements
        * findelement = webelement
        * findelements = List<Webelement>

        * */

        WebDriver driver = new EdgeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2013/09/testing.html?");
        driver.findElement(By.name("fname")).sendKeys("Apple");
        driver.findElement(By.name("lname")).sendKeys("Cucumber");



    }
}
