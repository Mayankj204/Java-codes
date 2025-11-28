public class Fibonacci {

    public static int fib(int n, int[] ans) {
        if (n <= 1) return n;  // base cases

        if (ans[n] != -1) return ans[n];  

        ans[n] = fib(n - 1, ans) + fib(n - 2, ans); // compute and store
        return ans[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] ans = new int[n + 1];

        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        // compute all Fibonacci values up to n
        for (int i = 0; i <= n; i++) {
            System.out.println("fib(" + i + ") = " + fib(i, ans));
        }
    }
}
