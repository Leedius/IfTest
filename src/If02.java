public class If02 {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        System.out.println("프로그램 시작");

        //num1과 num2의 합이 50보다 크면
        //"두 수의 이 50보다 큽니다"를 출력.
        //그렇지 않으면
        //"두 수의 이 50보다 작습니다"를 출력.

        if(num1+num2>50){
            System.out.println("두 수의 합이 50보다 큽니다");
        }
        else {
            System.out.println("두 수의 합은 50보다 작습니다");
        }
        //else는 if문 다음에 와야한다.
        //if, else 둘다 만족하거나 둘다 만족하지않는 경우는 없다.

        System.out.println("프로그램 종료");

    }
}
