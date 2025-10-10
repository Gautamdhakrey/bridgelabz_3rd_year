import java.util.Scanner;
class String_Level2_Q4 {
  static String[] manualSplit(String s){
    int c=1;
    for(int i=0;i<s.length();i++) if(s.charAt(i)==' ') c++;
    String[] words=new String[c];
    int idx=0; String temp="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==' '){
        words[idx++]=temp;
        temp="";
      }else temp+=s.charAt(i);
    }
    words[idx]=temp;
    return words;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] arr=manualSplit(s);
    String shortest=arr[0],longest=arr[0];
    for(String w:arr){
      if(w.length()<shortest.length()) shortest=w;
      if(w.length()>longest.length()) longest=w;
    }
    System.out.println(shortest);
    System.out.println(longest);
  }
}