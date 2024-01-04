import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        /*
        * Launch browser
        * get URL
        * type username
        * type password
        * click sumbit(login)
        * close webPage*/
        //Launch browser
        WebDriver driver = new EdgeDriver();
        //get URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        //type username
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();




    }
}
