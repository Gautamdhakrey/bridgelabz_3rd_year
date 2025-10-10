class String_Level1_Q4 {
  static void generateError(){
    String text=null;
    System.out.println(text.length());
  }
  static void handleError(){
    try{
      String text=null;
      System.out.println(text.length());
    }catch(Exception e){
      System.out.println("Exception handled");
    }
  }
  public static void main(String[] args){
    try{generateError();}catch(Exception e){}
    handleError();
  }
}