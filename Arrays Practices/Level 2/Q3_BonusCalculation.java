import java.util.Scanner;
class Q3_BonusCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10], years=new double[10], newSalary=new double[10], bonus=new double[10];
        double totalBonus=0,totalOld=0,totalNew=0;
        for(int i=0;i<10;i++){
            salary[i]=sc.nextDouble();
            years[i]=sc.nextDouble();
            if(years[i]>5) bonus[i]=salary[i]*0.05; else bonus[i]=salary[i]*0.02;
            newSalary[i]=salary[i]+bonus[i];
            totalBonus+=bonus[i]; totalOld+=salary[i]; totalNew+=newSalary[i];
        }
        System.out.println(totalBonus+" "+totalOld+" "+totalNew);
        sc.close();
    }
}
