// 15. Remove duplicate characters from string
// Input: "programming"
// Output: "progamin"

import java.util.Scanner;
public class removeDuplicates {
 public static void main(String[] args) {
     Scanner input  = new Scanner(System.in);
     System.out.println("Enter the string: ");
     String str = input.nextLine();
     input.close();

     //programming

     StringBuilder st = new StringBuilder(str);
     int p1 = 0;
     int p2 = 1;

     for(int i = 0; i<st.length(); i++){
        p1 = i;
        p2 = p1+1;
        for(int j = p2; j<st.length(); j++){
            if(st.charAt(p1) == (st.charAt(j))){
                st.deleteCharAt(j);
                j--;
            }
        }
     }
     System.out.println(st);
 }   
}
