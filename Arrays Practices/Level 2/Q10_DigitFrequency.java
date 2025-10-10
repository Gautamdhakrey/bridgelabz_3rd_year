import java.util.Scanner;
class Q10_DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(),count=0,temp=number;
        while(temp>0){count++; temp/=10;}
        int[] digits=new int[count];
        for(int i=0;i<count;i++){digits[i]=number%10; number/=10;}
        int[] freq=new int[10];
        for(int i=0;i<count;i++) freq[digits[i]]++;
        for(int i=0;i<10;i++) if(freq[i]>0) System.out.println(i+"="+freq[i]);
        sc.close();
    }
}
