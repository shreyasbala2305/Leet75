public class randomNumber {
    public static void main(String[] args) {
        int min =  100, max = 300;
        double random = Math.random()*(max-min+1)+min;
        System.out.println("Random number between "+min+" and "+max+" is "+random);
    }
}
