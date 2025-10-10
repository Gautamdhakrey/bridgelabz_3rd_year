import java.util.Scanner;
class String_Level3_Q9 {
  static boolean leap(int y){
    return (y%400==0)||(y%4==0&&y%100!=0);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int y=sc.nextInt();
    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    if(leap(y)) days[1]=29;
    java.time.LocalDate first=java.time.LocalDate.of(y,m,1);
    System.out.println(first.getMonth()+" "+y);
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    int start=first.getDayOfWeek().getValue()%7;
    for(int i=0;i<start;i++) System.out.print("    ");
    for(int d=1;d<=days[m-1];d++){
      System.out.printf("%3d ",d);
      if((d+start)%7==0) System.out.println();
    }
  }
}