import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    /* Task 1
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);
    } */

    /* Task 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }

        double avg = (double) sum / n;
        System.out.println(avg);
    }
    */

    /* Task 3
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i <= sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }

     */

    /* Task 4
    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }

     */

    /* Task 5
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n -1 ) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }

     */

    /* Task 6
    public static double power(double a, int n){
        if (n == 0){
            return 1;
        }
        if (n > 0){
            return a * power(a, n - 1);
        }
        else{
            return (1 / a) * power(a, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();

        double ans = power(a, n);
        System.out.println(ans);
    }

     */

    /* Task 7
    public static void permutations(String prefix, String remaining){
        int n = remaining.length();
        if (n == 0){
            System.out.println(prefix);
        }
        else{
            for(int i = 0; i < n; i++){
                permutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sym = sc.nextLine();

        permutations("", sym);
    }

     */

    /* Task 8
    public static boolean allDigits(String s){
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(allDigits(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

     */

    /* Task 9
    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int binomialCoef(int n, int k){
        return fact(n) / (fact(k) * fact(n - k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = binomialCoef(n, k);
        System.out.println(ans);
    }

     */

    /* Task 10
    public static int gcd (int a, int b){
        if (b == 0){
            return a;
        }
        return gcd (b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = gcd(a, b);
        System.out.println(ans);
    }

     */

    /*
        1) O(n)
        2) O(n)
        3) O(sqrt(n))
        4) O(n)
        5) O(2^n)
        6) O(n)
        7) O(n!)
        8) O(n)
        9) O(n)
        10) O(log(max(a,b)))
     */
}
