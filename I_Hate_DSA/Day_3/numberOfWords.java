
import java.util.Scanner;


public class numberOfWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();
        
        // sa  u rabh   hell
        int p1 = 0;
        int p2 = 1;
        

        int NumberOfWords = 1;

        for(int i=0; i<str.length();i++){

            if(str.charAt(p1) ==' ' && str.charAt(p2)==' '){
                p1+=1;
                p2+=1;
            }else{
                if(str.charAt(p1) ==' '){
                    NumberOfWords+=1;
                    p1+=1;
                    p2+=1;
                }else{
                    p1+=1;
                    p2+=1;
                }
            }
        }
        System.out.println(NumberOfWords);
    }
}
