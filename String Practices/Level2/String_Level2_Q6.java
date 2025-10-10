import java.util.Scanner;
class String_Level2_Q6 {
  static boolean isVowel(char c){
    c=Character.toLowerCase(c);
    return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(Character.isLetter(ch)){
        if(isVowel(ch)) System.out.println(ch+" Vowel");
        else System.out.println(ch+" Consonant");
      }else System.out.println(ch+" Not a letter");
    }
  }
}