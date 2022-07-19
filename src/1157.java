import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String input;
        int[] a = new int[26];  // 알파벳
        int max = 0;
        char ch = '?';

        input = sc.nextLine();

        for(int i = 0; i<input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                ++a[input.charAt(i)-65];
            }
            else {
                ++a[input.charAt(i)-97];
            }
        }
        for(int i=0; i<a.length; i++) {
            if(m;ax < a[i]) {
                max = a[i]
                ch = (char)(i+65);
            }
            else if(max == a[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);

        

        
        sc.close();
    }
}
// System.out.println("Hello, World!");
// a = sc.nextInt();
//String[] str = new String[testcase];