import java.util.Scanner;
class String_Level3_Q2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String res="";
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      boolean uniq=true;
      for(int j=0;j<i;j++){
        if(s.charAt(j)==c){uniq=false;break;}
      }
      if(uniq) res+=c;
    }
    System.out.println(res);
  }
}