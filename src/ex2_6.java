import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int max;
        int avg;
        int min;

        System.out.print("첫번째 수를 입력하세요 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        num2 = sc.nextInt();
        System.out.print("세번째 수를 입력하세요 : ");
        num3 = sc.nextInt();
        System.out.println("첫번째수 : " + num1);
        System.out.println("두번째수 : " + num2);
        System.out.println("세번째수 : " + num3);
        if (num1 > num2) {
            if (num1 > num3) {
                max=num1;
                if (num2 > num3) {
                    avg=num2;
                    min=num3;
                }
                else {
                    min=num2;
                    avg=num3;
                }
            }
            else {
                avg=num1;
                min=num2;
                max=num3;
            }
        }
        else {
            if (num2 > num3) {
                max=num2;
                if (num1 > num3) {
                    avg=num1;
                    min=num3;
                }
                else {
                    min=num1;
                    avg=num3;
                }
            }
            else{
                max=num3;
                    if (num2 > num1) {
                        min=num1;
                        avg=num2;
                    }
                    else {
                        avg=num1;
                        min=num2;
                    }
            }
        }
        System.out.println(max+">"+avg+">"+min);
    }
}
