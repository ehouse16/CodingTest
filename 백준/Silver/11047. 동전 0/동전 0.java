import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        int count = scanner.nextInt();
        int price = scanner.nextInt();

        int[] coins = new int[count];

        for (int i = 0; i <count ; i++) {
            coins[i] = scanner.nextInt();
        }

        int c = 0;

        for(int i = count - 1; i >= 0; i--){
            int num = price/coins[i];
            if(num > 0){
                price = price - coins[i]*num;

                c+=num;
            }
        }
        System.out.println(c);
    }
}