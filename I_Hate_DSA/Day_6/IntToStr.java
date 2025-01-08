// 18. Convert integer to string without built-in functions
// Input: 12345
// Output: "12345"

import java.util.Scanner;
public class IntToStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int length = (String.valueOf(num).length());
        String convertedValue = "";

        for(int i = 0; i<length; i++){
            convertedValue += String.valueOf(num%10);
            num = num/10;
        }
        int p1 = 0;
        int p2 = length-1;
        char intermediate;
        StringBuilder st = new StringBuilder(convertedValue);

        while(p1<p2){
            intermediate = st.charAt(p1);
            st.setCharAt(p1, st.charAt(p2));
            st.setCharAt(p2, intermediate);
            p1++;
            p2--;
        }

        System.out.println("Converted Integer value to String: "+st);
        
    }
}
