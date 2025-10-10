import java.util.Scanner;
class Q9_Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt(),cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) arr[i][j]=sc.nextInt();
        int[] copy=new int[rows*cols]; int k=0;
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) copy[k++]=arr[i][j];
        for(int i=0;i<copy.length;i++) System.out.print(copy[i]+" ");
        sc.close();
    }
}
