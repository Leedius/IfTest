import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s;
        String male="남";
        String female="여";
        boolean condition;

        System.out.println("성별을 입력하세요 : ");
        s=sc.next();

        condition=s.equals(male)&&s.equals(female);

        while(!condition){
            System.out.print("입력이 잘못되었습니다.\n다시 입력하세요 : ");
            s=sc.next();
            //switch(){

            }

        }


    }

