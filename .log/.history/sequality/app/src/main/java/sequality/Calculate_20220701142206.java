package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumTo(int x, int y) {
    int z = 0;

    for (int i = x; i <= y; i++) {
      z += i;
    }

    return z;
  }

  public int sumOdd(int x, int y) {
    int z = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        z += i;
      }
    }

    return z;
  }

  public int sumEven(int x, int y) {
    int z = 0;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        z += i;
      }
    }

    return z;
  }

  public double average(int x, int y) {
    return (double) sum(x, y) / 2;
  }

  public double averageTo(int x, int y) {

    int z = y - x + 1;

    return (double) sumTo(x, y) / z;
  }
}
