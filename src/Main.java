import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.Objects;

public class Main {

    static String WebPage = "";
    static String LoginTitle = "";
    static String NoAccess = "";
    static boolean LoadingStatus;
    static boolean LoginStatus;

    public static void main(String[] args) {

        //Setup Language EN
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");
        //To fix problems with the versions
        options.addArguments("--remote-allow-origins=*");

        //1 Step  ---- Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver","JarFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
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

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Enter UserName
        driver.findElement(By.xpath("(//input[@type='text' AND @class='newlogindialog_TextInput_2eKVn']"))
                .sendKeys("hELLOO");
        //Enter Password
        driver.findElement(By.xpath("//input[@type='password' AND @class='newlogindialog_TextInput_2eKVn']"))
                .sendKeys("pasasas");
            //Click on Log in
        driver.findElement(By.className("newlogindialog_SubmitButton_2QgFE")).click();

        //Loading element displayed if access was correct
        driver.findElement(By.className("throbber_topCircle_3znUF"));
        LoadingStatus = driver.findElement(By.className("throbber_topCircle_3znUF")).isDisplayed();

        //Wrong user or password
        System.out.println(driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        NoAccess = (driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        LoginStatus = Objects.equals(NoAccess, "Please check your password and account name and try again");

        //Run AutoTest
        AutoTest();

        //Close the browser
        driver.close();


    }

    public static void AutoTest(){
        TestCase testCase = new TestCase();

        testCase.NavigateMainPage(WebPage);
        testCase.LoginPage(LoginTitle);
        testCase.LoadingElementWait(LoadingStatus);
        testCase.Credential(LoginStatus);

    }

}