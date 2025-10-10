import java.util.Scanner;
class Q1_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(),count=0,temp=number;
        while(temp>0){count++; temp/=10;}
        int[] digits=new int[count];
        for(int i=0;i<count;i++){digits[i]=number%10; number/=10;}
        int sum=0; for(int i=0;i<count;i++) sum+=digits[i];
        System.out.println(sum);
        sc.close();
    }
}
