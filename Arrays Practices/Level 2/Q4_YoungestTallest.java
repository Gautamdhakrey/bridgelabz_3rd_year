import java.util.Scanner;
class Q4_YoungestTallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[3]; int[] heights=new int[3];
        for(int i=0;i<3;i++) ages[i]=sc.nextInt();
        for(int i=0;i<3;i++) heights[i]=sc.nextInt();
        int youngest=0,tallest=0;
        for(int i=1;i<3;i++){if(ages[i]<ages[youngest]) youngest=i; if(heights[i]>heights[tallest]) tallest=i;}
        System.out.println("Youngest="+youngest+" Tallest="+tallest);
        sc.close();
    }
}
