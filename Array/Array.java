class Array {
    public static void main(String[] args) {
        // declares an array of integers
        int[][] anArray;
        
        
        anArray = new int[11][11];
  
        for (int i=0; i<11; i++) {
           
            for (int j=0; j<11; j++) {
                
                anArray[i][j] = i*j; 
            }     
        }
        
        // the reason that i'm doing it this way is to have a more clean-looking output. 
        // that's why i am repeating the same block of code 10 times. i couldnt get it to 
        // print it out this way with a nested loop.
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[1][k]);
            
        }
        System.out.println();
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[2][k]);
            
        }
        System.out.println();
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[3][k]);
            
        }
        System.out.println();
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[4][k]);
            
        }
        System.out.println();
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[5][k]);
            
        }
        System.out.println();
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[6][k]);
            
        }
        System.out.println();
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[7][k]);
            
        }
        System.out.println();
        
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[8][k]);
            
        }
        System.out.println();
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[9][k]);
            
        }
        System.out.println();
  
        for (int k=1; k<11; k++){
        System.out.print(" "+ anArray[10][k]); 
        }
        System.out.println();
    }
}