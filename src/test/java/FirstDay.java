import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstDay {
    public static void main(String[] args) throws InterruptedException {
        // launch browser
        WebDriver driver = new EdgeDriver();

        // Open URl
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //provide username
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
