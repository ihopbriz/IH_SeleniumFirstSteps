package basics;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class RegistrationFormTest {

    @Test
    public void registrationForm() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement inputFirstNameText = driver.findElement(By.id("firstName"));
        inputFirstNameText.click();
        inputFirstNameText.sendKeys("Ian");

        WebElement inputlastNameText = driver.findElement(By.id("lastName"));
        inputlastNameText.click();
        inputlastNameText.sendKeys("Hop");

        WebElement inputEmailText = driver.findElement(By.id("userEmail"));
        inputEmailText.click();
        inputEmailText.sendKeys("Ian@email.com");

        WebElement inputPhoneNumberText = driver.findElement(By.id("userNumber"));
        inputPhoneNumberText.click();
        inputPhoneNumberText.sendKeys("01273456456");

        WebElement inputMaleButton = driver.findElement(By.cssSelector(" #genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label"));
        inputMaleButton.click();




        List<WebElement> allLabelsOnPage = driver.findElements(By.cssSelector("label.custom-control-label"));

        for (WebElement element : allLabelsOnPage) {
            System.out.println(element.getText());
        }




        inputEmailText.submit();

        WebElement successMessage = driver.findElement(By.id("example-modal-sizes-title-lg"));
        successMessage.getText();

//        String expSuccessMessage= "Thanks for submitting the form";
//        if(successMessage==expSuccessMessage){
//            System.out.println("Form submitted OK: "+successMessage);
//        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.close();
    }
}
