import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
//        int a = scanner.nextInt();
//        System.out.println("value = " + a);
        char c = scanner.next().charAt(0);
        System.out.println("value = " + c);
    }
}