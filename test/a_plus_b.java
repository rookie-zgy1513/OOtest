import java.util.Scanner;

public class a_plus_b {
    public static void main(String[] args) {
        // 当文本光标位于高亮显示的文本处时按 Alt+Enter，
        // 可查看 IntelliJ IDEA 对于如何修正该问题的建议。
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //Character c = (char) scanner.nextInt();
        String d = scanner.nextLine();
        scanner.close();
        System.out.println(a + b);
        System.out.println(d + "World");
    }
}
