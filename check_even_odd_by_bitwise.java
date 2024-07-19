public class check_even_odd_by_bitwise {
    public static void main(String[] args) {
        int n=35;
        System.out.println("is odd"+   " "+check(n));

    }
    public static boolean check(int n){

        return(n & 1)==1;
    }
}
