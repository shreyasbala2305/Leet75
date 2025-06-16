import java.util.Scanner;

public class armstrongNum {
    static boolean isArmstrong(int num){
        int temp = num, sum = 0, digit = 0, rem = 0;
        while(temp!=0){
            temp = temp/10;
            digit++;
        }
        temp = num;
        while(temp!=0){
            rem = temp%10;
            sum = sum + (int)Math.pow(rem, digit);
            temp = temp/10;
        }
        if(num == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(isArmstrong(num)){
            System.out.println(num+ " is Armstrong number");
        }
        else{
            System.out.println(num + " is not Armstrong number");
        }
    }

}
