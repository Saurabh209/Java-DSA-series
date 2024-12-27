package JavaDsa.Day_1;
// Create a method that checks if a given string is a palindrome.

public class four {
    public static void main(String[] args) {
        String name = "abcdcbha";
        
    int start = 0;
    int end = name.length()-1;
    boolean ispalindrome = true;
    

    while (start<end) {
        if(name.charAt(start) != name.charAt(end)){
            ispalindrome = false;
            break;
           
        }
        start++;
        end--;
        
    }
    if(ispalindrome){
        System.out.println("it is palindrome");
    }else{
        System.out.println("not a palindrome");
    }
  
    }
}
