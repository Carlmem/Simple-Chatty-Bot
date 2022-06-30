import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str1 = str.toUpperCase();
        System.out.println(str1.startsWith("J"));
    }
}