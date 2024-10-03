public class Linearsearch {
    public static int linearsearch(int numbers[],int key) {
      for(int i= 0;i<numbers.length;i++) {
          if(numbers[i]==key) {
            return i;
          }

      }
      {
        return -1;
      }
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,8,20,47,84,22,40};
        int key = 22;
       int index =  linearsearch( numbers, key);
       if(index == -1) {
        System.out.println("not found");
       } 
      else  {  
       System.out.println("here is your index:" +index); 
      }
    }
}
