import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int clab = 0;


        System.out.print("1~99 사이의 정수를 입력하시오>>");
        x = sc.nextInt();

        if (x % 10 == 3 || x % 10 == 6 || x % 10 == 9) {
            clab++;
            // 10의 자리에 3,6,9가 들어있는지 검사
        }
        if (x / 10 == 3 || x / 10 == 6 || x / 10 == 9) {
            clab++;
            // 일의 자리에 3,6,9가 들어있는지 검사
        }
        if (clab >= 2) {
            System.out.println("박수짝짝");
        }
        else if (clab == 1) {
                    System.out.println("박수짝");
        }
        else {
                    System.out.println(x);
        }
    }


}
