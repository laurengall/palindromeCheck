import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in); 
    System.out.println("Enter your word below:"); 
    String str = input.nextLine(); 
    check(str);
  }
  public static void check(String str){
    String rev = ""; 
    for (int i = str.length() -1 ; i > -1; i--){
      rev += str.charAt(i); 
    }
    if (rev.equals(str)){
      System.out.println("This is a palindrome."); 
    } else{
      System.out.println("This is not a palindrome."); 
    }
    
  }
}