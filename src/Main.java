import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeroc\\Documents\\ModulosJava\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Open de web browser google chrome
        driver.get("https;//www.google.com.mx");
        //cierra el navegador
        driver.close();
    }
}