import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int c= 0;
        int rev = 0;
        int copy = num;
        while(copy != 0){
            copy /= 10;
            c++;
        }
        int num2 = num;
        while(num2 != 0){
            int a  = num2 % 10;
            rev += (int) (a * Math.pow(10,c-1));
            num2 /= 10;
            c--;
        }
        System.out.println("The reverse of " + num + " is " + rev);
    }
}
