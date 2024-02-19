import java.util.Scanner; 

class max2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        if(a>b){
            System.out.println("a is grater");
        }
        else{
            System.out.println("b is grater");
        }

        //an alternate method
        System.out.println(a>b?a:b);
        sc.close();
    }
}