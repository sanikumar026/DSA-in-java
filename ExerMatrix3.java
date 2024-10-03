public class ExerMatrix3 {
    //wronnnnnnngggg
   // public static void Matrix_Transpose(int Matrix[][]) {
        // int row =2;  
        // int col = 3;
        // int Transpose[][]= new int[col][row];
        // for(int i=0;i<row;i++) {
        //     for(int j=0;j<col;j++) {
        //     Transpose[j][i]= Matrix[i][j];
        //     }
        // }
    // }

    public static void main(String[] args) {
        int Matrix[][]=  { { 11,12,13},
                        {21,22,23}};

       int row =2;  
        int col = 3;
        printMatrix(Matrix);
        int Transpose[][]= new int[col][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
            Transpose[j][i]= Matrix[i][j];
            }
        }
        printMatrix(Transpose);
    }

      public static void printMatrix(int Matrix[][]) {
        for(int i=0;i<Matrix.length;i++) { 
            for(int j=0;j<Matrix[0].length;j++) {
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
           
        }
                          
      }
    
      }
    