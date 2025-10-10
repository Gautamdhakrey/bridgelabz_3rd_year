import java.util.Scanner;
class String_Level1_Q9 {
  static String toUpperManual(String s){
    String res="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(c>='a'&&c<='z') res+=(char)(c-32);
      else res+=c;
    }
    return res;
  }
  static boolean compare(String a,String b){
    if(a.length()!=b.length()) return false;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i)!=b.charAt(i)) return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String m=toUpperManual(s);
    String b=s.toUpperCase();
    System.out.println(m);
    System.out.println(b);
    System.out.println(compare(m,b));
  }
}