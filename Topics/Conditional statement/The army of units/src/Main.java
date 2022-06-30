import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        if (army < 1) {
            System.out.println("no army");
        } else if (1 <= army && army <= 19) {
            System.out.println("pack");
        } else if (20 <= army && army <= 249) {
            System.out.println("throng");
        } else if (250 <= army && army <= 999) {
            System.out.println("zounds");
        } else if (1000 <= army) {
            System.out.println("legion");
        }
    }
}