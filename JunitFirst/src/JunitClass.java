import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
public class JunitClass {
  @Test
  public void SetUp(){
    String str = "This is KL University";
    String str1 = "This is KL University";
    String str2 = "KLH";
    String str3 = "null";
    String str4 = "KLH";
    int val = 5;
    int val1 = 7;
    String[] expectedArray = {"one","two","three","four"};
    String[] resultArray = {"one","two","three","four"};
    //assertEquals : checks whether 2 primitives are same or not
    assertEquals(str,str1); 
    //assertTrue : checks if the condition is true
    assertTrue(val < val1);
    //assertFalse : checks if the condition is false
    assertFalse(val > val1);
    //assertSame : checks if 2 primitives are equal
//    assertSame(str,str1);
//    //assertNotSame : checks if 2 primitives are not equal
//    assertNotSame(str2,str4);
    //assertArrayEquals : checks whether 2 arrays are equal or not
    assertArrayEquals(expectedArray,resultArray);
    //assertNull() : checks if the value is null 
    assertNull(null);
    //assertNotNull() : checks if the values is not null
    assertNotNull(str3);
  }
}