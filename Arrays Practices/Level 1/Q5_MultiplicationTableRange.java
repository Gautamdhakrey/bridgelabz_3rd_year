import java.util.Scanner;
class Q5_MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int[] res=new int[4];
        for(int i=6;i<=9;i++) {
            res[i-6]=number*i;
            System.out.println(number+"*"+i+"="+res[i-6]);
        }
        sc.close();
    }
}
