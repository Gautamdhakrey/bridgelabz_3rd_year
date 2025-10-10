import java.util.Scanner;
class Q2_PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) {
                if(arr[i]%2==0) System.out.println(arr[i]+" even");
                else System.out.println(arr[i]+" odd");
            } else if(arr[i]<0) System.out.println(arr[i]+" negative");
            else System.out.println(arr[i]+" zero");
        }
        if(arr[0]==arr[4]) System.out.println("Equal");
        else if(arr[0]>arr[4]) System.out.println("First greater");
        else System.out.println("Last greater");
        sc.close();
    }
}