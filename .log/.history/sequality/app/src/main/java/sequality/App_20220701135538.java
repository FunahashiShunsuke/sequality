/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  static Calculate calculate = new Calculate();

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    int x = 2;
    int y = 3;

    System.out.println(
        "Sum of " + x + " and " + y + "is" + calculate.sum(x, y) + " Average is " + calculate.average(x, y) + ".");
  }
}
