package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
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
    assertEquals(expected, calculateTest.average(2, 3), 0);
  }

  @Test
  public void testSumTo() {
    Calculate calculateTest = new Calculate();
    int expected = 55;
    assertEquals(expected, calculateTest.sumTo(1, 10));
  }

  @Test
  public void testAverageTo() {
    Calculate calculateTest = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculateTest.averageTo(1, 10), 0);
  }

  @Test
  public void testSumOdd() {
    Calculate calculateTest = new Calculate();
    int expected = 25;
    assertEquals(expected, calculateTest.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calculateTest = new Calculate();
    int expected = 30;
    assertEquals(expected, calculateTest.sumEven(1, 10));
  }

}
