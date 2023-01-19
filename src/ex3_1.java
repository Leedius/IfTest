import javax.lang.model.util.ElementScanner6;
import javax.swing.text.DefaultStyledDocument;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("첫번째 수를 입력하세요 : ");
        num1=sc.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        num2=sc.nextInt();
        System.out.print("세번째 수를 입력하세요 : ");
        num3=sc.nextInt();

        boolean condition=(num1>=(num2+num3)||num2>=(num1+num3))||num3>=(num1+num2);
        while (condition) {
            System.out.println("삼각형이 성립 되지 않습니다. 다시 입력해주세요.");
            System.out.print("첫번째 수를 입력하세요 : ");
            num1 = sc.nextInt();
            System.out.print("두번째 수를 입력하세요 : ");
            num2 = sc.nextInt();
            System.out.print("세번째 수를 입력하세요 : ");
            num3 = sc.nextInt();
            condition=(num1>=(num2+num3)||num2>=(num1+num3))||num3>=(num1+num2);
        }
            if((num1<(num2+num3)&&num2<(num1+num3))&&num3<(num1+num2)){
                System.out.println("삼각형이 성립됩니다.");
            }
        System.out.println("첫째변의 길이 : "+num1);
        System.out.println("둘째변의 길이 : "+num2);
        System.out.println("셋째변의 길이 : "+num3);
    }
}





