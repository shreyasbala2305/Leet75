import java.util.Scanner;

public class palindromeChar {
    public static void main(String[] args) {
        String oString, rString;
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        oString = scanner.nextLine();
        int lenght = oString.length();
        rString = "";
        for(int i = lenght-1; i>=0; i--){
            rString = rString + oString.charAt(i);
        }
        if(oString.equals(rString)){
            System.out.println("The String is a palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
    }
}
