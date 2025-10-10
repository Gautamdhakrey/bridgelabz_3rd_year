import java.util.Scanner;
class String_Level2_Q2 {
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
  static boolean compare(String[] a,String[] b){
    if(a.length!=b.length) return false;
    for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] arr1=manualSplit(s);
    String[] arr2=s.split(" ");
    for(String w:arr1) System.out.print(w+" ");
    System.out.println();
    for(String w:arr2) System.out.print(w+" ");
    System.out.println();
    System.out.println(compare(arr1,arr2));
  }
}