/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());

  }

  @Test
  public void testSum() {
    Calculate calculateTest = new Calculate();
    int expected = 5;
    assertEquals(expected, calculateTest.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculateTest = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculateTest.average(2, 3));
  }

  @Test
  public void testSumTo() {
    Calculate calculateTest = new Calculate();
    int expected = 5;
    assertEquals(expected, calculateTest.sumTo(2, 3));
  }

}
