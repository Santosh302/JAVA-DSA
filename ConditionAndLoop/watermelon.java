import java.util.Scanner;

public final class watermelon {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // taken the input

        if(w > 2 && w%2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}