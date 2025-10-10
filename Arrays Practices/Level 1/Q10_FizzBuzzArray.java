import java.util.Scanner;
class Q10_FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String[] arr=new String[number+1];
        for(int i=0;i<=number;i++){
            if(i%3==0&&i%5==0) arr[i]="FizzBuzz";
            else if(i%3==0) arr[i]="Fizz";
            else if(i%5==0) arr[i]="Buzz";
            else arr[i]=String.valueOf(i);
        }
        for(int i=0;i<=number;i++) System.out.println("Position "+i+" = "+arr[i]);
        sc.close();
    }
}
