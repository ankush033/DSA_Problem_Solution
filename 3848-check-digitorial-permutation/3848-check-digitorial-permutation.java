class Solution {
    public boolean isDigitorialPermutation(int n) {
        
     
        int pelorunaxi = n;  

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

 
        char[] a = String.valueOf(pelorunaxi).toCharArray();
        char[] b = String.valueOf(sum).toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        return java.util.Arrays.equals(a, b);
    }

    private int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
