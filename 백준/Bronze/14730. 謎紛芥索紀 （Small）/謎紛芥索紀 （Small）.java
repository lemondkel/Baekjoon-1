import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < N; i++){
            int C = sc.nextInt();
            int K = sc.nextInt();

            sum += C * K;
        }

        System.out.println(sum);
    }
}