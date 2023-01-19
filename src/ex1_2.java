import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;

        System.out.println("프로그램시작");
        System.out.print("num1 숫자를 입력하세요 : ");
        num1=sc.nextInt();

        if(num1%2==0&&num1!=0){
            System.out.println("짝수입니다");
        }
        else if(num1==0) {
            System.out.println("0입니다");
        }
        else {
            System.out.println("홀수입니다");
        }
        System.out.println("프로그램종료");
    }
}
