public class primeNumber {
    public static void main(String[] args) {
        int num = 11, m=0;
        boolean flag = false;
        m=num/2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number.");
            } else{
                for (int i = 2; i <= m; i++) {
                    if(num%i==0){
                        System.out.println(num + " is not a prime number.");
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == false){
                System.out.println(num + " is a prime number.");
            }
    }
}
