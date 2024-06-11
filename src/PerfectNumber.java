import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if(num < 1){
            System.out.println("Enter a positive number.");
            return;
        }
        int perfect = 0;
        for(int i = 1; i<= (num/2) +1; i++) {
            if (num % i == 0) {
                perfect += i;
            }
        }
        if(num == perfect){
            System.out.println(num +" is a perfect number");
        }else{
            System.out.println(num +" is not a perfect number");
        }
    }
}
