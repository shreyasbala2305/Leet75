import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int rev = 0, sum = 0;
        while(num>0){
            rev = num %10;
            sum=(sum*10)+rev;
            num=num/10;
        }
        if (sum == temp) {
            System.out.println(temp+ " is a palindrome");
        }
        else{
            System.out.println(temp+ " is not a palindrome");
        }
    }
}
