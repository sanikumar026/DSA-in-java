public class StaircaseSearxh {
    public static boolean Staircase_Search(int matrix[][],int target) {
        int row=0;  
        int col= matrix[0].length;
        while(row <matrix.length && col >=0 ) {
            if(matrix[row][col]==target) {
                System.out.print(+row +"," +col);
                return true;
            } 
            else if(target<matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.print("key not found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][]= { {10,20,30,40},
                        { 15,25,35,45},
                        {27,29,37,48},
                        { 32,33,39,50}  };
         
        int target =33;    
        
     Staircase_Search(matrix , target);
    }
}
