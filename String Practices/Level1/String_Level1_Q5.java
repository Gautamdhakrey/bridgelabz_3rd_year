import java.util.Scanner;
class String_Level1_Q5 {
  static void generateError(String s){
    System.out.println(s.charAt(s.length()));
  }
  static void handleError(String s){
    try{
      System.out.println(s.charAt(s.length()));
    }catch(Exception e){
      System.out.println("Exception handled");
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    try{generateError(s);}catch(Exception e){}
    handleError(s);
  }
}