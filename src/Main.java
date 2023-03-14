import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class Main {

    static String WebPage = "";
    static String LoginTitle = "";
    static String NoAccess = "";
    static boolean LoadingStatus;
    static boolean LoginStatus;

    public static void main(String[] args) {

        //1 Step  ---- Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver","JarFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("https://store.steampowered.com/");
        System.out.println(driver.getCurrentUrl());
        WebPage = driver.getCurrentUrl();


        //Step 2 Click login button
        driver.findElement(By.linkText("login")).click();
        System.out.println(driver.getTitle());
        LoginTitle = driver.getTitle();

        //Step 3 Input Random Strings as credentials
        //Enter UserName
        driver.findElement(By.className("newlogindialog_TextInput_2eKVn")).clear();
        driver.findElement(By.className("newlogindialog_TextInput_2eKVn")).sendKeys("hELLOO");

        //Enter Password
        driver.findElement(By.className("newlogindialog_FieldLabel_3d8dp")).clear();
        driver.findElement(By.className("newlogindialog_FieldLabel_3d8dp")).sendKeys("PAASSWORD");

        //Click on Log in
        driver.findElement(By.className("newlogindialog_SubmitButton_2QgFE")).click();

        //Loading element displayed if access was correct
        driver.findElement(By.className("throbber_topCircle_3znUF")).wait(1000);
        LoadingStatus = driver.findElement(By.className("throbber_topCircle_3znUF")).isDisplayed();

        //Wrong user or password
        System.out.println(driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        NoAccess = (driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        LoginStatus = Objects.equals(NoAccess, "Please check your password and account name and try again");

        //Close the browser
        driver.close();

    }

}