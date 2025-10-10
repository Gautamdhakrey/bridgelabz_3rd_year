import java.util.Scanner;
class String_Level1_Q1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    boolean same=true;
    if(a.length()!=b.length()) same=false;
    else{
      for(int i=0;i<a.length();i++){
        if(a.charAt(i)!=b.charAt(i)){
          same=false;
          break;
        }
      }
    }
    System.out.println(same);
    System.out.println(a.equals(b));
  }
}