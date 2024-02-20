import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);
        int day_num = sc.nextInt();
        
        switch(day_num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Enjoy! It's a weekend");
                break;
            default:
                System.out.println("Invalid number");
        }
        sc.close();
    }
}