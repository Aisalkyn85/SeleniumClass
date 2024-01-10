import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class XPtathContunue {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

        //Self  = select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'CARE Ratings')]/self::a")).getText();
/*
        //System.out.println("Self : "+text);
*/

        //Parent - Select the parent of the current node(Always one)
       // text = driver.findElement(By.xpath("//a[contains(text(),'CARE Ratings')]/parent::td")).getText();// parent does not have any text
      //  System.out.println("Parent : "+text);

        //Child - Select all children of the current node(One or many)
      //  List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr/child::td"));
     //   System.out.println("Number of children : "+childs.size());

        //Ancestor - Select all ancestors
       // text = driver.findElement(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr")).getText();
      //  System.out.println("Ancestors : "+text);

        //Descendant
       // List<WebElement> descendant=  driver.findElements(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr/descendant::*"));
     //   System.out.println("Descendant : "+descendant.size());
      // following everything on the list nodes
       // List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr/following::tr"));
     //   System.out.println("Number of following siblings: "+following.size());
        // following siblings
     //   List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr/following-sibling::tr"));
      //  System.out.println("Number of following siblings: "+following.size());

        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'CARE Ratings')]/ancestor::tr/preceding::tr"));
        System.out.println("Number of following siblings: "+preceding.size());





    }
}
