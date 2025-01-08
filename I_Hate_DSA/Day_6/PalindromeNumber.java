// 20. Check if number is palindrome
// Input: 12321
// Output: true


import java.util.Scanner;
public class PalindromeNumber {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    //12321
    int num = input.nextInt();
    String str = String.valueOf(num);
    int length = (String.valueOf(num)).length();
    boolean isPalindrome = true;

    int p1 = 0;
    int p2 = length-1;

   while(p1<p2){
    if(str.charAt(p1) != str.charAt(p2)){
        System.out.println("No, this is not a palindrome");
        isPalindrome = false;
        break;

    }else{
        p1++;
        p2--;
    }
   }
   if(isPalindrome){
    System.out.println("Yes, the number is Palindrome");
   }

}

}
