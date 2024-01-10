import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EbayBuy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();














        /*In Selenium WebDriver, XPath is a widely used technique for locating web elements in web pages.
         There are several types of XPath expressions and methods that can be employed to effectively
         interact with web elements. Here's a summary of the key types and variations:


1. **Absolute XPath**: This is a direct way to find an element, starting from the root of the
 HTML document and specifying the complete path to the element. However, it's not flexible and can
 easily break if the page structure changes【17†source】【18†source】【20†source】.

2. **Relative XPath**: Unlike Absolute XPath, Relative XPath starts from a
specific element and navigates through the DOM hierarchy. It's represented by a double
slash (`//`) and is more robust against changes in the web page structure.

3. **Basic XPath**: This common approach combines a tag name and attribute value, using the syntax:
`//tagname[@Attribute='Value']`. It is straightforward and useful for locating elements with specific
 attributes and values【18†source】.

4. **XPath using Contains()**: The `contains()` function is useful
 for elements with dynamically changing attribute values. It allows locating
 elements with partial matches of attribute values, like `//*[contains(@attribute,'partialValue')]`.


5. **Using OR & AND in XPath**: Logical operators like OR and AND can be used
in XPath to create complex expressions that cater to multiple conditions. For instance,
`//*[@attribute1='value1' or @attribute2='value2']` uses the OR operator, while
`//tag[@attribute1='value1' and @attribute2='value2']` uses the AND operator.

6. **XPath Starts-with Function**: This function is used for elements whose
attribute values change dynamically. It matches elements based on the starting
 text of an attribute, like `//tag[starts-with(@attribute.

7. **XPath Text() Function**: The text() function locates elements
 based on the exact text of a web element. It's useful for finding
 elements that contain specific text strings, like `//tag[text()='Exact Text']`.

8. **XPath Axes**: XPath Axes provide more sophisticated ways to traverse the DOM.
 They allow locating elements based on their relationship to other elements, like
 parent, child, sibling, ancestor, or descendant. Common axes include `ancestor`, `child`,
 `descendant`, `following`, `preceding`, `parent`, and `self`【21†source】.


Understanding these different XPath expressions and their appropriate use
cases is crucial for effective web automation and testing with Selenium WebDriver.
Each method has its own advantages and can be selected based on the specific requirements
of the web elements you are interacting with.*/


        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("/html/body/div[4]/div/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("laptop");
        driver.findElement(By.xpath("//input[@value = 'Search']")).click();
        //Using OR & AND in XPath. //tag[@attribute1='value1' and @attribute2='value2']
        driver.findElement(By.xpath("(//input[@class = 'checkbox__control' and @role='presentation'])[1]")).click();
        //XPath using Contains().//[contains(@attribute,'partialValue')]
        driver.findElement(By.xpath("(//div/span[contains(text(), 'HP 14\" Diagonal  Touchscreen')])[1]")).click();






    }
}
