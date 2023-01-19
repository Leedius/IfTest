import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int x_min, x_max;
        int y_min, y_max;

        x_min = 50;
        x_max = 100;
        y_min = 50;
        y_max = 100;

        System.out.print("좌표 x 값을 입력하시오 : ");
        x = sc.nextInt();
        System.out.print("좌표 y 값을 입력하시오 : ");
        y = sc.nextInt();

        if (x >= x_min && x <= x_max && y >= y_min && y <= y_max) {
            System.out.println("사각형 안에 점이 있습니다.");
        }
        else {
            while (x < x_min || x > x_max || y < y_min || y > y_max) {
                System.out.println("사각형 안에 점이 없습니다. 다시 입력해주세요.");
                System.out.print("좌표 x 값을 입력하시오 : ");
                x = sc.nextInt();
                System.out.print("좌표 y 값을 입력하시오 : ");
                y = sc.nextInt();
                if (x >= x_min && x <= x_max && y >= y_min && y <= y_max) {
                    System.out.println("사각형 안에 점이 있습니다.");
                }
            }

        }
    }
}
