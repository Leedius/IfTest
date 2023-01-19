import java.util.Scanner;

public class ex1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("프로그램시작");
        System.out.print("num 숫자를 입력하세요 : ");
        num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("5의 배수입니다.");
            }
        else {
            while (num % 5 != 0) {
                System.out.print("5의 배수가 아닙니다. 5의 배수를 입력하세요 : ");
                num = sc.nextInt();
                if(num % 5 == 0){
                    System.out.println("5의 배수입니다.");
                }

            }
        }

            System.out.println("====================");
            System.out.println("프로그램종료");
        }
    }


