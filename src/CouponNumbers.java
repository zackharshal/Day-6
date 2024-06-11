import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of distinct coupons");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Enter the distinct coupon numbers: ");
            arr[i] = scanner.nextInt();
        }
        int c = 1;
        int rand = (int) (Math.random() * 10);
        for(int i = 0; i < arr.length; i++){
            while(arr[i] != rand){
                rand = (int) (Math.random() * 10);
                c++;
            }
        }
        System.out.println("Total random numbers needed to hava all distinct numbers are " + c);
    }
}
