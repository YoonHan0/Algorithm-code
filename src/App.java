import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, c=0;
        int[] result_arr = new int[10];

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int sum = a*b*c;
        String sum_result = Integer.toString(sum);

        char[] ar = sum_result.toCharArray();
        Arrays.sort(ar);
        for(int i =0;i<ar.length; i++){
            if(ar[i] == '0'){
                ++result_arr[0];
            }
            else if(ar[i] == '1'){
                ++result_arr[1];
            }
            else if(ar[i] == '2'){
                ++result_arr[2];
            }
            else if(ar[i] == '3'){
                ++result_arr[3];
            }
            else if(ar[i] == '4'){
                ++result_arr[4];
            }
            else if(ar[i] == '5'){
                ++result_arr[5];
            }
            else if(ar[i] == '6'){
                ++result_arr[6];
            }
            else if(ar[i] == '7'){
                ++result_arr[7];
            }
            else if(ar[i] == '8'){
                ++result_arr[8];;
            }
            else if(ar[i] == '9'){
                ++result_arr[9];
            }
        }
        //System.out.println(sum);
        for(int i =0;i<result_arr.length; i++){
            System.out.println(result_arr[i]);
        }
        sc.close();
    }
}
//System.out.println("Hello, World!");