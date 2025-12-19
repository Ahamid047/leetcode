
class RodCutting {

    static int cutRodRecur(int i, int[] price) {
        
        // Base case
        if (i == 0) return 0;
        
        int ans = 0;

        // Find maximum value for each cut.
        // Take value of rod of length j, and 
        // recursively find value of rod of 
        // length (i-j).
        for (int j = 1; j <= i; j++) {
            ans = Math.max(ans, price[j - 1] + cutRodRecur(i - j, price));
        }

        return ans;
    }

    static int cutRod(int[] price) {
        int n = price.length;

        return cutRodRecur(n, price);
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price));
    }
}