import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase {

    static String WebPage = "";
    static String LoginTitle = "";
    static boolean LoadingStatus;
    static boolean LoginStatus;
    //Run Test Case in TestNG and using Asserts
    @Test
    //Main page is displayed
    void NavigateMainPage(String Title){
        Assert.assertEquals(Title,"https://store.steampowered.com/");
        System.out.println("This line is executed because assertEquals "
                + "passed since both the strings are same");
    }

    @Test
        //Login Page is open
    void LoginPage(String LoginTitle){
        Assert.assertEquals(LoginTitle,"Sign In");
        System.out.println("This line is executed because assertEquals "
                + "passed since both the strings are same");
    }

    @Test
    //Loading element is displayed
    public void LoadingElement(boolean Status){
        Assert.assertTrue(Status,true);
        System.out.println("This line will be executed if the element appear");
    }

    @Test
    //Error text in login credentials is displayed
    public void LoadingElement(boolean LoginStatus){
        Assert.assertTrue(LoginStatus,true);
        System.out.println("This line will be executed if there are wrong credentials");
    }

    public static String getWebPage() {
        return WebPage;
    }

    public static String getLoginTitle() {
        return LoginTitle;
    }

    public static boolean isLoadingStatus() {
        return LoadingStatus;
    }

    public static boolean isLoginStatus() {
        return LoginStatus;
    }
}

