// 16. Find first repeating character in a string
// Input: "hello"
// Output: 'l'

import java.util.Scanner;
public class firstRepeatedChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        input.close();

        int pointer1;
        int pointer2;
        boolean istrue = false;

        outerloop:
        for(int i = 0; i<str.length(); i++){
            pointer1 = i;
            pointer2 = pointer1+1;
            for(int j = pointer2; j<str.length(); j++){
                if(str.charAt(pointer1) == (str.charAt(j))){
                    System.out.println("The first repeated character is: "+str.charAt(pointer1));
                    istrue = true;

                    break outerloop;
                }
               
            }
        }

    }
}
