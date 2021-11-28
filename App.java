import java.util.Scanner;

/**Lottery generator.
 *
 * @author D0948419
 */
public class App {
  /** Main.
   *
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final LotteryGenerator generator = new LotteryGenerator();
    int time;
    System.out.println("Please choose total number: ");
    int total = scanner.nextInt();
    System.out.println("Please choose the time of draw: ");
    time = scanner.nextInt();
    while (time > total) {
      System.out.println("Please try again");
      System.out.println("Please choose total number: ");
      total = scanner.nextInt();
      System.out.println("Please choose the time of draw: ");
      time = scanner.nextInt();
    }
    int[] number = generator.generateLotteryNumber(total, time);
    for (int i = 0; i < time; i++) {
      System.out.println(number[i]);
    }
  }

}
