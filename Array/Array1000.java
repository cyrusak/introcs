class Array {
    public static void main(String[] args) {
        // declares an array of integers
        int[][] anArray;
        
        
        anArray = new int[1001][1001];
  
        for (int i=0; i<11; i++) {
           
            for (int j=0; j<1001; j++) {
                
                anArray[i][j] = i*j; 
            }     
        }
        
        for (int k=1; k<1001; k++){
            for (int l=1; l<11; l++){
        System.out.print(" "+ anArray[l][k]);
            }    
        }
        System.out.println();
        
    }
}