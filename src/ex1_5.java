import java.sql.SQLOutput;
import java.util.Random;

public class ex1_5 {
    public static void main(String[] args) {
        Random random=new Random();
        int score=random.nextInt(100);
        String grade="";

        System.out.println("프로그램시작");

        if(score>90&&score<=100){
            grade="A";
        }
        else if(score>80){
            grade="B";
        }
        else{
            grade="C";
        }
        System.out.println("학점은 "+grade+" 입니다");
        System.out.println("점수 : "+score);
        System.out.println("프로그램종료");
    }
}
