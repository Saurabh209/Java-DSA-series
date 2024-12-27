package JavaDsa.Day_1;


public class five {
    public static void main(String[] args) {
        String name ="ajfa";
        String vowels = "AEIOUaeiou";
        int vowelCounter = 0;

        int length = name.length()-1;

        for(int i = 0; i<=length; i++){
            if(vowels.contains(String.valueOf(name.charAt(i)))){
                vowelCounter+=1;
            }
        }
        System.out.println("Number of vowels are: "+vowelCounter);
    }
}
