import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitDemoTest {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Result r = JUnitCore.runClasses(JunitClass.class);
    
    for(Failure failure: r.getFailures()) {
      System.out.println(r.toString());
      
    }
    System.out.println("Result is "+r.wasSuccessful());

  }
}