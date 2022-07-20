import java.util.Scanner;

public class Main_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testcase, cnt = 0;
        String str = null;
        testcase = scan.nextInt();

        for(int i=0; i<testcase; i++) {
            boolean alpah[] = new boolean[26];      //알파벳체크
            boolean temp = true;                    //temp
            
            str = scan.next();
            for(int j=0; j<str.length(); j++) {
                int index = str.charAt(j)-'a';      //첫 글자의 index 번호
                if(alpah[index]) {
                    if(str.charAt(j) == str.charAt(j-1)) {      //aaba
                        continue;
                    }
                    else {
                        temp = false;
                        break;
                    }
                }
                else {
                    alpah[index] = true;
                }
            }
            if(temp)
                cnt++;      //check!
        }
        System.out.println(cnt);
        scan.close();
    }
}