import java.util.Scanner;
import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        if (str.contentEquals(result)) {
            System.out.println("Đây là một palindrome");
        } else {
            System.out.println("Đây không phải là một palindrome");
        }
    }
}
