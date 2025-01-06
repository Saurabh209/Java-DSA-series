// 13. Check if string contains only digits
import java.util.Scanner;
public class onlyDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the String: ");
        String str = input.nextLine();
        String Digits = "1234567890";
        boolean isTrue = true;
        
        for(int i = 0; i<str.length(); i++){
            if(Digits.contains(String.valueOf(str.charAt(i)))){

            }else{
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            System.out.println("Yes, the String "+str+" only contains digits");
        }else{
            System.out.println("No, the string "+str+" contains values other than digits");
        }
    }
}
