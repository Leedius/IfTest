import java.util.Random;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Random random=new Random();
        int score=random.nextInt(100);

        System.out.println("프로그램시작");

        if(score>90&&score<=100){
            System.out.println("학점은 A입니다");
        }
        else if(score>80&&score<=90){
            System.out.println("학점은 B입니다");
        }
        else if(score<=80){
            System.out.println("학점은 C입니다");
        }
        System.out.println("점수 : "+score);
        System.out.println("프로그램종료");
    }
}
