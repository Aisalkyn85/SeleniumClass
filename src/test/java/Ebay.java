import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class Ebay {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();





        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@aria-label = 'Search for anything']")).sendKeys("Dresses");
        driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.cssSelector("input[aria-label='Long']")).click();
        driver.findElement(By.xpath("(//span[text()='S'])[1]")).click();
        driver.findElement(By.partialLinkText("Women Ladies Boho Floral ")).click();
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for(String a: allWindow){
            if(!a.equals(currentWindow)){
                driver.switchTo().window(a);
            }
        }
        driver.switchTo().window(currentWindow);
        
    }
}
