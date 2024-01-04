import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver  = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("aisalkynaidarova8@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Chicago");
        driver.findElement(By.name("login")).click();
    }
}
