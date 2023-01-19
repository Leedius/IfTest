import javax.management.relation.Relation;
import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a, b;
        double result=0;
        String c;
        boolean c1;

        System.out.print("첫 번째 수를 입력하세요 : ");
        a=sc.nextInt();
        System.out.print("두 번째 수를 입력하세요 : ");
        b=sc.nextInt();
        System.out.print("연산자를 입력하세요 : ");
        c=sc.next();

        while(!(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"))) {
            System.out.print("연산자가 잘못되었습니다.\n다시입력하세요 : ");
            c = sc.next();
        }
            if(c.equals("+")) {
                result = a + b;
            }
            else if(c.equals("-")){
                result = a - b;
            }
            else if(c.equals("*")){
                result = a * (double)b;
            }
            else {
                result = a / (double)b;
            }

        System.out.println(a+c+b+"="+result);

    }
}
