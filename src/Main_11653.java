import java.util.Scanner;

public class Main_11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        
        number = scan.nextInt();
        
        for(int i =2; i*i <= number; i++) {
            while(number % i == 0) {
                System.out.println(i);
                number = number / i;
            }
        }
        if(number != 1) {
            System.out.println(number);
        }        
        scan.close();
    }
}
// name = sc.next();
// System.out.println("이름은 "+name+"나이는 "+age+",키는 "+height+"입니다.");
// int[]arr = new int[number];