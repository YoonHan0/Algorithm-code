import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int test, result, cnt = 0;
        String[] score = null;

        test = scan.nextInt();
        score = new String[test];   

        for(int i=0; i<score.length; i++) {
            score[i] = scan.next();
        }        
        scan.close();

        for(int i=0; i<score.length; i++) {
            cnt = 0;
            result = 0;
            for(int j=0; j<score[i].length(); j++) {
                if (score[i].charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                result += cnt;
            }
            System.out.println(result);
        }

    }
}