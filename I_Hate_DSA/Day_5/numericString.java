// 17. Check if string is numeric
// Input: "12.34"
// Output: true

import java.util.Scanner;

public class numericString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String str = input.nextLine();
        input.close();

        String checker = "1234567890.";
        int length = str.length();
        boolean isNumeric = true;
        int decimalCount = 0;

        for(int i = 0; i<length; i++){
            if(checker.contains(String.valueOf(str.charAt(i))) && decimalCount<2){
                if(str.charAt(i) == '.'){
                    decimalCount+=1;
                }

            }else{
                System.out.println("No, the string is not Numeric");
                isNumeric = false;
                break;
            }
        }
        if(isNumeric){
            System.out.println("Yes, the string is Numeric");
        }
    }
}
