import org.testng.Assert;
import org.testng.annotations.Test;
public class TestCase {
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



}
