import java.util.Scanner;
class String_Level3_Q3 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int[] freq=new int[256];
    for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
    char ans=' ';
    for(int i=0;i<s.length();i++){
      if(freq[s.charAt(i)]==1){ans=s.charAt(i);break;}
    }
    System.out.println(ans);
  }
}