import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[10];
        int cnt = 1;

        for(int i=0; i<10; i++) {
            input[i] = sc.nextInt();
            input[i] = input[i] % 42;
        }

        sc.close();

        Arrays.sort(input);
        for(int i=1; i<input.length; i++) {
            if(input[i-1] != input[i]) {
                ++cnt;
            }
            else {
                continue;
            }
        }
        System.out.println(cnt);
    }
}
// System.out.println("Hello, World!");
// a = sc.nextInt();
//String[] str = new String[testcase];