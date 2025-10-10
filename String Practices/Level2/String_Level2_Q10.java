import java.util.Scanner;
class String_Level2_Q10 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] marks=new int[n][3];
    for(int i=0;i<n;i++){
      for(int j=0;j<3;j++) marks[i][j]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      int total=marks[i][0]+marks[i][1]+marks[i][2];
      double avg=total/3.0;
      double perc=avg;
      String grade="";
      if(perc>=90) grade="A";
      else if(perc>=75) grade="B";
      else if(perc>=60) grade="C";
      else if(perc>=40) grade="D";
      else grade="F";
      System.out.println("Total:"+total+" Avg:"+avg+" %:"+perc+" Grade:"+grade);
    }
  }
}