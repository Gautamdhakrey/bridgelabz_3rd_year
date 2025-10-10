import java.util.Scanner;
class Q2_2DArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt(),cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) arr[i][j]=sc.nextInt();
        int sum=0;
        for(int i=0;i<rows;i++){for(int j=0;j<cols;j++){System.out.print(arr[i][j]+" "); sum+=arr[i][j];} System.out.println();}
        System.out.println(sum);
        sc.close();
    }
}
