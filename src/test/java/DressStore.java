import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DressStore {
    public static void main(String[] args) {
        WebDriver driver  = new EdgeDriver();
        driver.get("https://www.chicasclothing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//p[text()='COLLECTION']")).click();
    }
}
