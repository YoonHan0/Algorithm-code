import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);      //input testcase / input grade / g1/max_grade*100 -> average

        int testcase = 0;
        double max, avg = 0;
        String[] grade = null;
        double[] num = null;

        testcase = scan.nextInt();
        grade = new String[testcase];
        num = new double[testcase];

        for(int i=0; i<testcase; i++) {
            grade[i] = scan.next();
        }
        num[0] = Integer.parseInt(grade[0]);
        max = num[0];

        for(int i=1; i<testcase; i++) {
            num[i] = Integer.parseInt(grade[i]);
            //System.out.println("num = " + num[0] +"num = " + num[i]);
            if(max <= num[i]) {
                max = num[i];
            }
        }
        //System.out.println("max = " + max);

        for(int i=0; i<testcase; i++) {
            //System.out.println("num = " + num[i]);
            num[i] = (num[i]/max)*100;
            avg += num[i];
            //System.out.println("num"+"["+i+"] = " + num[i]);
        }
        avg = avg/testcase;
        System.out.print(avg);
        
    }
}

