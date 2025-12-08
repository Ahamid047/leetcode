class largest_prime {

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static int largestPrime(int n) {
        int sum = 0;
        int answer = 0;

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                sum += num;
                if (sum > n) break;
                if (isPrime(sum)) answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println(largestPrime(n));
    }
}
