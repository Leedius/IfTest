import java.util.Random;

public class ex01 {
    public static void main(String[] args) {
        Random random=new Random();
        int num1= random.nextInt(100);
        int num2= random.nextInt(100);

        System.out.println("프로그램시작");

        if(num1+num2>50){
            System.out.println("두 수의 합이 50보다 큽니다");
        }
        else {
            System.out.println("두 수의 합이 50이하 입니다");
        }
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("결과 값:"+(num1+num2));
        System.out.println("프로그램종료");
    }
}
