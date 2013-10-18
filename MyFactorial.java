class MyFactorial {
    public static void main (String[] args) {
        
        double fact=1;

        int N = 7;
      
        for (int i=1; i <= N; i++) {
            
            fact *= i;
        }
            StdOut.printf("%14d!= ",N );
            System.out.println(+fact);
    }
}
