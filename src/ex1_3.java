import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt(100);
        int b=random.nextInt(100);

        System.out.println("프로그램시작");

        if(a>b){
            System.out.println("a가 b보다 큽니다");
        }
        else if(a<b){
            System.out.println("b가 a보다 큽니다");
        }
        else {
            System.out.println("같습니다");
        }
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("프로그램종료");
    }
}
