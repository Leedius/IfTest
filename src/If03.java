public class If03 {
    public static void main(String[] args) {
        int x=5;
        int y=10;

        System.out.println("프로그램 시작");

        //두 수의 합이 20보다 크면 "20보다 큽니다"를 출력하고,
        //두 수의 합이 20보다 작으면 "20보다 작습니다"를 출력.
        //두 수의 합이 20일 경우 "두 수의 합이 20입니다"를 출력

        if(x+y>20){
            System.out.println("20보다 큽니다");
        }
        else if(x+y<20) {
            System.out.println("20보다 작습니다.");
        }
        else {
            System.out.println("두 수의 합이 20입니다");

            //위 3가지 if, else if, else의 조건은 겹칠수가없다.
        }
        System.out.println("프로그램 종료");
    }
}
