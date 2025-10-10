import java.util.Scanner;
class String_Level1_Q7 {
  static void generateError(String s){
    int x=Integer.parseInt(s);
    System.out.println(x);
  }
  static void handleError(String s){
    try{
      int x=Integer.parseInt(s);
      System.out.println(x);
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