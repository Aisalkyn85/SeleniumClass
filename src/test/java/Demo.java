import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        driver.findElement(By.xpath("//p[text() = ' Customers']")).click();
        driver.findElement(By.xpath("//p[text()=' Customers']")).click();
        driver.findElement(By.id("SearchProductName")).sendKeys("computer");
        WebElement element = driver.findElement(By.id("SearchCategoryId"));
        Select select = new Select(element);
        select.deselectByValue("3");


    }
}
