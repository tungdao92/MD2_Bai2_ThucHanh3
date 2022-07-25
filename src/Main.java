import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = input.nextInt();
        System.out.println("Nhập số b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor - Không có ước chung lớn nhất");
        }
        while (a!=b){
            if (a > b){
                a = a - b;
                System.out.println(" a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println( "Ước chung lớn nhất là: " + a);
    }
}
