import java.util.Scanner;
class String_Level2_Q8 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=10;
    int[] ages=new int[n];
    for(int i=0;i<n;i++) ages[i]=sc.nextInt();
    for(int i=0;i<n;i++){
      if(ages[i]<0) System.out.println(ages[i]+" Cannot vote");
      else if(ages[i]>=18) System.out.println(ages[i]+" Can vote");
      else System.out.println(ages[i]+" Cannot vote");
    }
  }
}