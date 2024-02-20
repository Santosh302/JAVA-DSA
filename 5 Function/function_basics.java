class function_basics {
    static int add(int a, int b){
        int sum= a+b;
        return sum;
    }
    static void pranaam(String name){
        System.out.println("Hello! " +name);
    }
    public static void main(String[] args){

        pranaam("Santosh");
        pranaam("Santosh kumar yadav");

        int ans =add(5,6);
        System.out.println(ans);
    }
}