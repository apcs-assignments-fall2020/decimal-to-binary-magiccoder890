import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int num = Integer.parseInt(binary);
        int modulo = 0;
        int answer = 0;
        int adding = 0;
        for (int i = 0; i < binary.length(); i++){
            modulo = num % 10;
            adding = (int) Math.pow(2,i);
            if (modulo == 1) {
                answer += adding;
            }
            else {
                answer += 0;
            }
            num /= 10;
        }

        return answer;
    }
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in a number in binary format: ");
        String binary = scanner.next();
    System.out.print(binaryToDecimal(binary));
    }
}
