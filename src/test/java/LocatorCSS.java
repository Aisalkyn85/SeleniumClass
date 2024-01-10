import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorCSS {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        /*CSS - cascade style sheets
        * tag id #

        * tag class .
        * tag attribute []
        * tag class atribute .[aria-label='value'] type, placeholder, email, , id='value', class='value', name='value' - these all attributes
        *
        * input#small-search*/

        driver.get("https://demo.nopcommerce.com/");
        //css with tag id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");

        //tag class
        driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("MacBook");
       driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("MacBook");

        //tag  & atrribute
        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Apple");

// tag class and attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");

    }
}
