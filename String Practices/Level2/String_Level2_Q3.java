import java.util.Scanner;
class String_Level2_Q3 {
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
    String[][] res=new String[arr.length][2];
    for(int i=0;i<arr.length;i++){
      res[i][0]=arr[i];
      res[i][1]=String.valueOf(arr[i].length());
    }
    for(int i=0;i<res.length;i++){
      System.out.println(res[i][0]+" "+res[i][1]);
    }
  }
}