import java.util.Scanner;
class String_Level2_Q1 {
  static int manualLength(String s){
    int c=0;
    try{
      while(true){
        s.charAt(c);
        c++;
      }
    }catch(Exception e){}
    return c;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(manualLength(s));
    System.out.println(s.length());
  }
}