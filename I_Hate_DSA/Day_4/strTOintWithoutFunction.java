// 14. Convert string to integer without built-in functions
// Input: "12345"
// Output: 12345
import java.util.Scanner;
public class strTOintWithoutFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string that only contain digit: ");
        String str = input.nextLine();
        Character result = '0';
        String value = "";
        //1235

        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
            System.out.println(str.charAt(i)-result);
            result = result*10+str.charAt(i);
        }

        
    }
}
