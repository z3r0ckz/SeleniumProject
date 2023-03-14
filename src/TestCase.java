import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase {

  public static String WebPage = "";
  public static String LoginTitle = "";
  public static boolean LoadingStatus;
  public static boolean LoginStatus;
  //Run Test Case in TestNG and using Asserts
    @Test
    //Main page is displayed
    private void NavigateMainPage(String WebPage){
      System.out.println("Running the first test");
      Assert.assertEquals(WebPage,"https://store.steampowered.com/");
      System.out.println("This line is executed because assertEquals "
              + "passed since both the strings are same");
    }

    @Test
  //Login Page is open
    private void LoginPage(String LoginTitle){
      System.out.println("Running the second test");
      Assert.assertEquals(LoginTitle,"Sign In");
      System.out.println("This line is executed because assertEquals "
              + "passed since both the strings are same");
    }

    @Test
    //Loading element is displayed
    private void ElementAppears(boolean Status){
      System.out.println("Running the third test");
      Assert.assertTrue(Status, String.valueOf(true));
      System.out.println("This line will be executed if the element appear");
    }

    @Test
  //Error text in login credentials is displayed
    public void LoadingElement(boolean LoginStatus){
      System.out.println("Running the fourth test");
      Assert.assertTrue(LoginStatus, String.valueOf(true));
      System.out.println("This line will be executed if there are wrong credentials");
    }

  public void getWebPage() {
  }
  public void getLoginTitle() {
  }

  public void isLoadingStatus() {
  }

  public void isLoginStatus() {
  }

}
