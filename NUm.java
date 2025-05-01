public class NUm {
    public static void main(String[] args) {
        reverse(12);
    }

    public static void reverse(int n){
        if (n==0) {
            // System.out.println(n);
            return;
        }
        System.out.print(" "+n);
        reverse(n-1);
    }
}
