import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase {

    static String WebPage = "";
    static String LoginTitle = "";
    static boolean LoadingStatus;
    static boolean LoginStatus;
    //Run Test Case in TestNG and using Asserts

    @Test
    //Main page is displayed on webpage
    void NavigateMainPage(String WebPage){
        Assert.assertEquals(WebPage,"https://store.steampowered.com/");
        System.out.println("This line is executed because WebPage "
                + "passed since both the strings are same");
    }

    @Test
        //Login Page is open
    void LoginPage(String LoginTitle){
        Assert.assertEquals(LoginTitle,"Sign In");
        System.out.println("This line is executed because Sign In "
                + "passed since both the strings are same");
    }

    @Test
    //Loading element is displayed

    public void LoadingElementWait(boolean Status){
        Assert.assertTrue(Status, String.valueOf(true));
        System.out.println("This line will be executed if the element appear");
    }

    @Test
    //Error text in login credentials is displayed
    public void Credential(boolean LoginStatus){
        Assert.assertTrue(LoginStatus, String.valueOf(true));
        System.out.println("This line will be executed if there are wrong credentials");
    }


    public static String getWebPage() {
        return WebPage;
    }

    public static void setWebPage(String webPage) {
        WebPage = webPage;
    }

    public static String getLoginTitle() {
        return LoginTitle;
    }

    public static void setLoginTitle(String loginTitle) {
        LoginTitle = loginTitle;
    }

    public static boolean isLoadingStatus() {
        return LoadingStatus;
    }

    public static void setLoadingStatus(boolean loadingStatus) {
        LoadingStatus = loadingStatus;
    }

    public static boolean isLoginStatus() {
        return LoginStatus;
    }

    public static void setLoginStatus(boolean loginStatus) {
        LoginStatus = loginStatus;
    }
}

