import java.util.Scanner;
class Q8_BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] weight=new double[n],height=new double[n],bmi=new double[n];
        String[] status=new String[n];
        for(int i=0;i<n;i++){
            weight[i]=sc.nextDouble(); height[i]=sc.nextDouble();
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<18.5) status[i]="Underweight";
            else if(bmi[i]<25) status[i]="Normal";
            else if(bmi[i]<30) status[i]="Overweight";
            else status[i]="Obese";
        }
        for(int i=0;i<n;i++) System.out.println(weight[i]+" "+height[i]+" "+bmi[i]+" "+status[i]);
        sc.close();
    }
}
