import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ExpressStore {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.express.com/womens-clothing");



       /* List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Images in the site "+images.size());
        List<WebElement>pictures = driver.findElements(By.className("Header-linkText"));
        System.out.println("Number of Sliders "+pictures.size());*/
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Women")));





    }
}
