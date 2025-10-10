import java.util.Scanner;
class String_Level1_Q2 {
  static String substringManual(String s,int start,int end){
    String res="";
    for(int i=start;i<end;i++){
      res+=s.charAt(i);
    }
    return res;
  }
  static boolean compareStrings(String s1,String s2){
    if(s1.length()!=s2.length()) return false;
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)!=s2.charAt(i)) return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int start=sc.nextInt();
    int end=sc.nextInt();
    String manual=substringManual(s,start,end);
    String builtin=s.substring(start,end);
    System.out.println(manual);
    System.out.println(builtin);
    System.out.println(compareStrings(manual,builtin));
  }
}