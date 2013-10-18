class Array {
    public static void main(String[] args) {
        // declares an array of integers
       int z=0;
  
        for (int i=1; i<10; i++) {
           
            for (int j=1; j<1000; j++) {
                
                z= i*j;
                
                System.out.print(" " + z);
            }     
        }
        System.out.println();
    }
}
