import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Objects;

public class Main {

    public static String WebPage = "";
    public static String LoginTitle = "";
    static String NoAccess = "";
    public static boolean LoadingStatus;
    public static boolean LoginStatus;

    public static void main(String[] args) {

        //Extra Step Change the language
        //ChromeOptions object
        ChromeOptions opt = new ChromeOptions();
        //set language to English
        opt.addArguments("lang=en-GB");

        //1 Step  ---- Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver","JarFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver(opt);
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
        driver.findElement(By.xpath("//input[@type='text' and @class='newlogindialog_TextInput_2eKVn']"))
                .sendKeys("helooOo");

        //Enter Password

        driver.findElement(By.xpath("//input[@type='password' and @class='newlogindialog_TextInput_2eKVn']"))
                .sendKeys("PAASSWORD");

        //Click on Log in
        driver.findElement(By.className("newlogindialog_SubmitButton_2QgFE")).click();

        //Loading element displayed if access was correct
        driver.findElement(By.className("throbber_topCircle_3znUF"));
        LoadingStatus = driver.findElement(By.className("throbber_topCircle_3znUF")).isDisplayed();

        //Wrong user or password
        System.out.println(driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        NoAccess = (driver.findElement(By.className("newlogindialog_FormError_1Mcy9")).getText());
        LoginStatus = Objects.equals(NoAccess, "Please check your password and account name and try again");

        //Close the browser
        driver.close();

    }

    static void AutoTest(){
        TestCase testCase = new TestCase();
        testCase.getWebPage();
        testCase.getLoginTitle();
        testCase.isLoadingStatus();
        testCase.isLoginStatus();

        System.out.println(WebPage);
        System.out.println(LoginTitle);
        System.out.println(LoadingStatus);
        System.out.println(LoginStatus);
    }


}