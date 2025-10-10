import java.util.Scanner;
class String_Level2_Q7 {
  static String trimManual(String s){
    int start=0,end=s.length()-1;
    while(start<s.length()&&s.charAt(start)==' ') start++;
    while(end>=0&&s.charAt(end)==' ') end--;
    String res="";
    for(int i=start;i<=end;i++) res+=s.charAt(i);
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String m=trimManual(s);
    String b=s.trim();
    System.out.println(m);
    System.out.println(b);
  }
}