import java.util.Scanner;
class String_Level3_Q5 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int[] freq=new int[256];
    for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
    String uniq="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      boolean seen=false;
      for(int j=0;j<i;j++) if(s.charAt(j)==c) seen=true;
      if(!seen) uniq+=c;
    }
    for(int i=0;i<uniq.length();i++){
      char c=uniq.charAt(i);
      System.out.println(c+" "+freq[c]);
    }
  }
}