public class diagonalsum {
    public static int Diago_Sum(int Matrix[][]) {
        // non- optimize solution
      /*   int pd=0;
        int sd=0;
    
        for(int i=0;i<Matrix.length;i++) {
            for(int j=0;j<Matrix[0].length;j++) {
                if(i==j) {
                  pd+=Matrix[i][j];
                }
               else  if(i+j==Matrix.length-1) {
                 sd+= Matrix[i][j];
                }
            }
        }
        int sum = pd +sd;
        return sum ;    */

        // for optimize solution
        int sum=0;
        for(int i=0;i<Matrix.length;i++) {
            // pd
            sum+= Matrix[i][i];
            if(i!=Matrix.length-1-i) {
            sum+=Matrix[i][Matrix.length -1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int Matrix[][]= { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16} };

     int ans=Diago_Sum(Matrix);
     System.out.print(+ans);
    }
}