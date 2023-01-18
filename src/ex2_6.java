import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

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
                if (num2 > num3) {
                    System.out.println(num1 + ">" + num2 + ">" + num3);
                }
                else {
                    System.out.println(num1 + ">" + num3 + ">" + num2);
                }
            }
            else {
                System.out.println(num3 + ">" + num1 + ">" + num2);
            }
        }
        else {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2 + ">" + num1 + ">" + num3);
                } else {
                    System.out.println(num2 + ">" + num3 + ">" + num1);
                }
            }
            else{
                    if (num2 > num1) {
                        System.out.println(num3 + ">" + num2 + ">" + num1);
                    } else {
                        System.out.println(num3 + ">" + num1 + ">" + num2);
                    }
            }

        }
    }
}
