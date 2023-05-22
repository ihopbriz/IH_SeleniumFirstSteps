package booking;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hotel {

    @Test
    public void registrationForm() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        //My Booking - Home page

        WebElement inputHotelName = driver.findElement(By.id("hotel_location"));
        inputHotelName.click();
        inputHotelName.sendKeys("Bristol");

        WebElement selectHotel = driver.findElement(By.id("hotel_cat_name"));
        selectHotel.click();

        WebElement selectHotelPrime = driver.findElement(By.cssSelector("#search_hotel_block_form > div:nth-child(2) > div > ul > li"));
        selectHotelPrime.click();

        WebElement checkInDate = driver.findElement(By.id("check_in_time"));
        checkInDate.click();
        checkInDate.sendKeys("01-09-2023");

        WebElement checkOutDate = driver.findElement(By.id("check_out_time"));
        checkOutDate.click();
        checkOutDate.sendKeys("08-09-2023");

        WebElement submit = driver.findElement(By.id("search_room_submit"));
        submit.click();

        //The Hotel Prime - MyBooking

        WebElement firstBookButton = driver.findElement(By.cssSelector("#category_data_cont > div:nth-child(2) > div > div.col-sm-8 > a > span"));
        firstBookButton.click();

        WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span"));
        proceedToCheckoutButton.click();


        // Order - MyBooking

        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.clear();
        email.sendKeys("booking5@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.click();
        password.sendKeys("Booking123*");

        WebElement Title = driver.findElement(By.cssSelector("#id_gender1"));
        Title.click();

        WebElement custFirstName = driver.findElement(By.id("customer_firstname"));
        custFirstName.click();
        custFirstName.sendKeys("CustomerOne");

        WebElement custLastName = driver.findElement(By.id("customer_lastname"));
        custLastName.click();
        custLastName.sendKeys("CustomerOneLastName");


        WebElement Address = driver.findElement(By.id("address1"));
        Address.click();
        Address.sendKeys("One College Square");

        WebElement Postcode = driver.findElement(By.id("postcode"));
        Postcode.click();
        Postcode.sendKeys("12-334");


        WebElement cityChoice = driver.findElement(By.id("city"));
        cityChoice.click();
        cityChoice.sendKeys("Poland");

        WebElement homeNumber = driver.findElement(By.id("phone"));
        homeNumber.click();
        homeNumber.sendKeys("0117 900 9000");


        WebElement mobNumber = driver.findElement(By.id("phone_mobile"));
        mobNumber.click();
        mobNumber.sendKeys("07985309309");


        WebElement saveButton = driver.findElement(By.id("submitAccount"));
        saveButton.click();

        WebElement tAndCs = driver.findElement(By.id("cgv"));
        tAndCs.click();

        // Payment Method

        WebElement payByWire = driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
        payByWire.click();

        // Order Summary

        WebElement confirmOrderButton = driver.findElement(By.cssSelector("#cart_navigation > button > span"));
        confirmOrderButton.click();

        // Order Confirmation

        WebElement orderConfirmationNo = driver.findElement(By.id("order-confirmation"));
        System.out.println("Order confirmation no: "+orderConfirmationNo.getText());

        WebElement bookingAmount = driver.findElement(By.cssSelector("#order-detail-content > table > tfoot > tr.totalprice.item > td:nth-child(3) > span"));
        System.out.println("Cost of booking: "+bookingAmount.getText());


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        driver.close();


    }

}
