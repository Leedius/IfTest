import java.util.Scanner;

public class ex2_5_trans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1;       //키보드로 입력받는 첫번째 수
        int num2;       //키보드로 입력받는 두번째 수
        int max;        //두 수 중 큰 수
        int min;        //두 수 중 작은 수

        System.out.print("첫번째 수를 입력하세요 : ");
        num1=sc.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        num2=sc.nextInt();

        System.out.println("첫번째 수 : "+num1);
        System.out.println("두번째 수 : "+num2);
        if(num1>num2){
            max=num1;
            min=num2;
        }
        else {
            max=num2;
            min=num1;
        }
        System.out.println(max+">"+min);

    }
}
