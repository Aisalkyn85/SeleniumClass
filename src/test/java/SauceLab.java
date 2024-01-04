import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class SauceLab {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
      String act_title = driver.findElement(By.className("product_label")).getText();
      String exp_title  = "Products";
      if(act_title.equals(exp_title)){
          System.out.println("test passed");
      }else {
          System.out.println("test failed");
      }

                List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Print images count "+images.size());
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        driver.findElement(By.xpath("//button[text() = 'ADD TO CART']")).click();
        driver.findElement(By.xpath("//span[@class = 'fa-layers-counter shopping_cart_badge']")).click();
        driver.findElement(By.linkText("CHECKOUT")).click();
        driver.findElement(By.id("first-name")).sendKeys("Aisalkyn");
        driver.findElement(By.id("last-name")).sendKeys("Aidarova");
        driver.findElement(By.id("postal-code")).sendKeys("60618");
        driver.findElement(By.xpath("//input[@value = 'CONTINUE']")).click();
    }

}
