import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the Fibonacci series: ");
        int num = scanner.nextInt();
        if (num <1){
            System.out.println("Enter a positive number.");
            return;
        }
        System.out.println("Fibonacci series for " + num + " elements is: ");
        if(num == 1){
            System.out.print("0");
        } else if (num == 2) {
            System.out.print("0 1");
        }else{
            int a = 0 , b = 1;
            System.out.print(a + " " + b);
            for (int i = 2; i < num; i++){
                int c = a + b;
                System.out.println(c+ " ");
                a = b;
                b = c;
            }
        }
    }
}
