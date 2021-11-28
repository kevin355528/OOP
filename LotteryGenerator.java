/**
 * Lottery generator function.
 *
 * @author D0948419
 */
public class LotteryGenerator {
  /**
   * Generator lottery number.
   */
  public int[] generateLotteryNumber(int totalNumbers, int lotteryNumber) {
    int[] number = new int[lotteryNumber];
    for (int i = 0; i < lotteryNumber; i++) {
      number[i] = (int) (Math.random() * totalNumbers) + 1;
      for (int j = 0; j < i; j++) {
        if (number[i] == number[j]) {
          i--;
          break;
        }
      }
    }
    return number;
  }
}
