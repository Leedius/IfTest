import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int korean;
        int english;
        int math;
        int total;
        double avg;

        System.out.print("국어점수를 입력하시오 : ");
        korean=sc.nextInt();
        System.out.print("영어점수를 입력하시오 : ");
        english=sc.nextInt();
        System.out.print("수학점수를 입력하시오 : ");
        math=sc.nextInt();

        total=korean+english+math;
        avg= (double)total/3;

        System.out.println("국어점수 : "+korean);
        System.out.println("영어점수 : "+english);
        System.out.println("수학점수 : "+math);
        System.out.println("총점 : "+total);
        System.out.println("평균 : "+avg);

    }
}
