import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase {
<<<<<<< HEAD

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
=======
  //Run Test Case in TestNG and using Asserts
    @Test
    //Main page is displayed
    void NavigateMainPage(String Title){
      Assert.assertEquals(Title,"https://store.steampowered.com/");
>>>>>>> a54ca32d70a54397dd4955b4bd96b149da349d21
      System.out.println("This line is executed because assertEquals "
              + "passed since both the strings are same");
    }

    @Test
  //Login Page is open
<<<<<<< HEAD
    private void LoginPage(String LoginTitle){
      System.out.println("Running the second test");
=======
    void LoginPage(String LoginTitle){
>>>>>>> a54ca32d70a54397dd4955b4bd96b149da349d21
      Assert.assertEquals(LoginTitle,"Sign In");
      System.out.println("This line is executed because assertEquals "
              + "passed since both the strings are same");
    }

    @Test
    //Loading element is displayed
<<<<<<< HEAD
    private void ElementAppears(boolean Status){
      System.out.println("Running the third test");
      Assert.assertTrue(Status, String.valueOf(true));
=======
    public void LoadingElement(boolean Status){
      Assert.assertTrue(Status,true);
>>>>>>> a54ca32d70a54397dd4955b4bd96b149da349d21
      System.out.println("This line will be executed if the element appear");
    }

    @Test
  //Error text in login credentials is displayed
    public void LoadingElement(boolean LoginStatus){
<<<<<<< HEAD
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
=======
      Assert.assertTrue(LoginStatus,true);
      System.out.println("This line will be executed if there are wrong credentials");
    }


>>>>>>> a54ca32d70a54397dd4955b4bd96b149da349d21

}
