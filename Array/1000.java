class Array {
    public static void main(String[] args) {
        // declares an array of integers
       int z=0;
  
        for (int i=0; i<11; i++) {
           
            for (int j=0; j<1001; j++) {
                
                z= i*j;
                
                System.out.print(" " + z);
            }     
        }
        
    }
}