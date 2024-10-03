import java.util.Scanner;

public class MatrixArray {
    public static boolean Search(int Matrix[][],int key){
        for(int i=0;i<Matrix.length;i++) {
            for(int j=0;j<Matrix[0].length;j++) {
                if( key==Matrix[i][j]) {
                    System.out.print("Found at cell("+i+","+j+")");
                   // System.out.print("key found at:" +i +"," +j);
                    return true;
                }
            
            }
        }
        System.out.print("Not found");
        return false;
    }
    public static void main(String[] args) {
    
        int Matrix[][]=new int[2][3];
        int n= Matrix.length;
        int m=  Matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<Matrix.length;i++) {
            for(int j=0;j<Matrix[0].length;j++)
             {
                Matrix[i][j]=sc.nextInt(); 
            }
        }

        for(int i=0;i<Matrix.length;i++) {
            for(int j=0;j<Matrix[0].length;j++) {
                System.out.print(+Matrix[i][j] +" " ); 
            }
            System.out.println();
        }

        Search(Matrix,10);
    }
}
