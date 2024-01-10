import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(5000);

        //driver.close();  // single browser window

        driver.quit(); // all browser windows
    }

}

