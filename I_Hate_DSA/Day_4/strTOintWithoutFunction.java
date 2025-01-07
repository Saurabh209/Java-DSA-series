// 14. Convert string to integer without built-in functions
// Input: "12345"
// Output: 12345
import java.util.Scanner;
public class strTOintWithoutFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string that only contain digit: ");
        String str = input.nextLine();
        int sum = 0;
        int value = 0;
        //1235

        for(int i = 0; i<str.length(); i++){
            sum = str.charAt(i)-'0';
            value = value*10+sum;

        }
System.out.println(value);
        
    }
}
