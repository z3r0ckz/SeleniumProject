import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //1 Step  ---- Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver","JarFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("https://store.steampowered.com/");
        System.out.println(driver.getTitle());

        //Step 2 Click login button
        driver.findElement(By.linkText("iniciar sesión")).click();

        //Step 3 Input Random Strings as credentials
        //Enter UserName
        driver.findElement(By.className("newlogindialog_TextInput_2eKVn")).clear();
        driver.findElement(By.className("newlogindialog_TextInput_2eKVn")).sendKeys("hELLOO");

        //Enter Password
        driver.findElement(By.className("newlogindialog_FieldLabel_3d8dp")).clear();
        driver.findElement(By.className("newlogindialog_FieldLabel_3d8dp")).sendKeys('PAASSWORD');

        //Click on Log in
        driver.findElement(By.className("newlogindialog_SubmitButton_2QgFE")).click();

        //Loading element displayed if access was correct
        driver.findElement(By.className("throbber_topCircle_3znUF")).wait(1000);

        //Wrong user or password
        System.out.println(driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());

        //Wait until element apperas


        //Close the browser
        //driver.close();





    }
}