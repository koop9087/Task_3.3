import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        char[] chr = choice.toCharArray();
        for(int i = 0; i < chr.length; i++) {
            if(Character.isDigit(chr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
