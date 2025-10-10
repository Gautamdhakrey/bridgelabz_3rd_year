import java.util.Scanner;
class String_Level2_Q9 {
  static String computerChoice(){
    int r=(int)(Math.random()*3);
    if(r==0) return "rock";
    if(r==1) return "paper";
    return "scissors";
  }
  static String winner(String u,String c){
    if(u.equals(c)) return "draw";
    if(u.equals("rock")&&c.equals("scissors")) return "user";
    if(u.equals("paper")&&c.equals("rock")) return "user";
    if(u.equals("scissors")&&c.equals("paper")) return "user";
    return "computer";
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int games=sc.nextInt();
    int uw=0,cw=0,d=0;
    for(int i=0;i<games;i++){
      String u=sc.next();
      String c=computerChoice();
      String w=winner(u,c);
      if(w.equals("user")) uw++;
      else if(w.equals("computer")) cw++;
      else d++;
      System.out.println("User:"+u+" Computer:"+c+" Winner:"+w);
    }
    System.out.println("User wins:"+uw+" Computer wins:"+cw+" Draws:"+d);
  }
}