import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f1 = scanner.nextInt();
        int f2 = scanner.nextInt();
        int f3 = scanner.nextInt();
        if(f1 > 0 && f2 <= 0 && f3 <= 0) {
            System.out.println(true);
        } else if (f2 > 0 && f1 <= 0 && f3 <= 0) {
            System.out.println(true);
        } else if (f3 > 0 && f1 <= 0 && f2 <= 0) {
            System.out.println(true);
        } else System.out.println(false);
    }
}