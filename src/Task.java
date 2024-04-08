import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Введите количество мониторов");
        Scanner sc = new Scanner(System.in);
        int monitors = sc.nextInt();
        System.out.println("Введите количество программистов");
        int programmers = sc.nextInt();
        int drawisMonitorsCounter = drawisMonitorsCounter(monitors, programmers);
        if (drawisMonitorsCounter == 1) {
            System.out.println("Останется " + drawisMonitorsCounter + " монитор");
        } else {
            if (0 < drawisMonitorsCounter && drawisMonitorsCounter < 5)
                System.out.println("Останется " + drawisMonitorsCounter + " монитора");
            else {
                System.out.println("Останется " + drawisMonitorsCounter + " мониторов");
            }
        }
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int result;
        if (monitors > 0 && programmers > 0) {
            result = monitors % programmers;
            return result;
        } else {
            System.out.println("значения не могут быть отрицательными или равняться 0");
            result = 0;
            return result;
        }
    }
}

