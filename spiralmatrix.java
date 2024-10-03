public class spiralmatrix {
    public static void Spiral_Matrix(int Matrix[]) {
        int StartRow=0;
        int  StartCol= 0;
        int EndRow= Matrix.length-1;
        int EndCol= Matrix[0].length-1;

        while(EndRow>=StartRow && EndCol>=StartCol) {
            //Top
            for(int j=StartCol;j<=EndCol;j++) {
                System.out.print(Matrix[StartRow][j] +" ");
            }
            //right
            for(int i=StartRow+1;i<=EndRow;i++) {
                System.out.print(Matrix[i][EndCol] +" ");
            }
            //bottom
            for(int j = EndCol-1;j>=StartCol;j--) {
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(Matrix[EndRow][j] +" ");
            }
            //left
            for(int i=EndRow-1;i>=StartRow+1;i--) {
                if(StartCol==EndCol){
                    break;
                }
                System.out.print(Matrix[i][StartCol]+" ");
            }
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;

        }
    }
    public static void main(String[] args) {
        int Matrix[][]= { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16} };

        
    }
}
