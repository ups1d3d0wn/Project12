
public class Dice {
  public static int rollD6() {
    int die = (int)(Math.random()*6) + 1;
    return die;
  }

  public static int rollD6(int quantity) {
    String comboText = "";
    int dieSum = 0;

    for(int i=0; i < quantity; i++) {
      int die = rollD6();
      dieSum += die;
      comboText += die;
      comboText += (i != quantity-1) ? "+" : "=";

    }
    comboText += dieSum;
    System.out.println(comboText);
    return dieSum;
  }
}
