import java.util.Scanner;
class String_Level1_Q8 {
  static void generateError(String[] arr){
    System.out.println(arr[arr.length]);
  }
  static void handleError(String[] arr){
    try{
      System.out.println(arr[arr.length]);
    }catch(Exception e){
      System.out.println("Exception handled");
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<n;i++) arr[i]=sc.next();
    try{generateError(arr);}catch(Exception e){}
    handleError(arr);
  }
}