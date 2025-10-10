import java.util.Scanner;
class String_Level3_Q1 {
  static double bmi(double w,double h){
    double hm=h/100.0;
    return w/(hm*hm);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=10;
    double[][] data=new double[n][2];
    for(int i=0;i<n;i++){
      data[i][0]=sc.nextDouble();
      data[i][1]=sc.nextDouble();
    }
    for(int i=0;i<n;i++){
      double val=bmi(data[i][0],data[i][1]);
      String status=val<18.5?"Underweight":val<25?"Normal":val<30?"Overweight":"Obese";
      System.out.println("W:"+data[i][0]+" H:"+data[i][1]+" BMI:"+val+" Status:"+status);
    }
  }
}