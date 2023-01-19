import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a;
        String male="남";
        String female="여";

        System.out.print("성별을 입력하세요 : ");
        a=sc.next();

        boolean condition = a.equals(male) || a.equals(female);
        while (!condition) {
            System.out.print("다시입력하세요 : ");
            a = sc.next();
            condition = a.equals(male) || a.equals(female);
        }
        if (a.equals(male)) {
                System.out.println("남자입니다.");
        }
        else {
                System.out.println("여자입니다.");
        }
    }
}


