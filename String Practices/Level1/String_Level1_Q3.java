import java.util.Scanner;
class String_Level1_Q3 {
  static char[] manualChars(String s){
    char[] arr=new char[s.length()];
    for(int i=0;i<s.length();i++){
      arr[i]=s.charAt(i);
    }
    return arr;
  }
  static boolean compareArrays(char[] a,char[] b){
    if(a.length!=b.length) return false;
    for(int i=0;i<a.length;i++){
      if(a[i]!=b[i]) return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char[] arr1=manualChars(s);
    char[] arr2=s.toCharArray();
    for(char c:arr1) System.out.print(c+" ");
    System.out.println();
    for(char c:arr2) System.out.print(c+" ");
    System.out.println();
    System.out.println(compareArrays(arr1,arr2));
  }
}