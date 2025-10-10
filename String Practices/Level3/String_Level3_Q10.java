import java.util.Scanner;

class String_Level3_Q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    int n = suits.length * ranks.length;
    String[] deck = new String[n];
    int idx = 0;
    for (String r : ranks)
      for (String s : suits)
        deck[idx++] = r + " of " + s;
    for (int i = 0; i < n; i++) {
      int r = i + (int) (Math.random() * (n - i));
      String temp = deck[i];
      deck[i] = deck[r];
      deck[r] = temp;
    }
    int players = sc.nextInt();
    int cards = sc.nextInt();
    if (players * cards > n) {
      System.out.println("Not possible");
      return;
    }
    for (int p = 0; p < players; p++) {
      System.out.print("Player" + (p + 1) + ": ");
      for (int c = 0; c < cards; c++)
        System.out.print(deck[p * cards + c] + ", ");
      System.out.println();
    }
  }
}