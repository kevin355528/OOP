import java.util.Scanner;

/**主程式.
 *
 */
public class App {
  /**.
   *
   * @param args  command-line arguments
   *
   *
   */
  public static void main(String[] args) {
    System.out.println("請輸入五個成績");
    Scanner scannerObject = new Scanner(System.in);
    int[] score = new int[5];
    for (int i = 0; i < 5; i++) {
      score[i] =  scannerObject.nextInt();
    }
    double ave = average(score);
    System.out.println(convert(ave));

  }

  /**計算平均分數的static method.
   *
   * @param scores 成績陣列
   */
  public static double average(int[] scores) {
    double total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    return  total / 5;
  }

  /**成績轉換的static method.
   *
   * @param score 分數平均
   *
   * @return 成績等第
   */
  public static String convert(double score) {
    String ans;
    score /= 10;
    ans = switch ((int) score) {
      case 10, 9 -> "A";
      case 8 -> "B";
      case 7 -> "C";
      case 6 -> "D";
      default -> "F";
    };
    return ans;
  }
}
