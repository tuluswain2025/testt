import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Seleniumui {

    public static void main(String[] args)throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?zx=1767900262239&no_sw_cr=1");
        driver.manage().window().maximize();

        // Locate input field
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("samsung");
  String expected="samsung s25 ultra";
        // Wait for suggestions to appear


        // Capture suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("(//ul[@class='GrtgLe'])[1]/li"));
        Thread.sleep(3000);
       System.out.println("size..."+suggestions.size());

       for(int i=0;i<suggestions.size();i++){
System.out.println(suggestions.get(i).getText());
//           if(suggestions.get(i).getText().equals(expected)){
//              suggestions.get(i).click();
//
//           }
       }
        // Select the 4th suggestion
//        if (suggestions.size() >= 4) {
//            suggestions.get(3).click(); // Index 3 for the 4th item
//            Thread.sleep(2000);
//        } else {
//            System.out.println("Not enough suggestions.");
//        }

        // Close browser
        Thread.sleep(2000);
    //    driver.quit();
    }
}
