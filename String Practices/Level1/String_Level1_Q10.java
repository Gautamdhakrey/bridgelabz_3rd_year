import java.util.Scanner;
class String_Level1_Q10 {
  static String toLowerManual(String s){
    String res="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(c>='A'&&c<='Z') res+=(char)(c+32);
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
    String m=toLowerManual(s);
    String b=s.toLowerCase();
    System.out.println(m);
    System.out.println(b);
    System.out.println(compare(m,b));
  }
}