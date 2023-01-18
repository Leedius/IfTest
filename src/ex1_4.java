import java.util.Random;

public class ex04 {
    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(100);

        System.out.println("프로그램시작");

        if(num%3==0){
            System.out.println("3의 배수입니다");
        }
        System.out.println("num = "+num);
        System.out.println("프로그램종료");
    }
}
