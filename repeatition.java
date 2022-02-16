import java.util.*;
public class repeatition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter size of array");
    //int size = sc.nextInt();
    int array[] ={1, 1, 2, 3, 4, 1, 3, 4, 5};
    int size = array.length;
    int sum=0;
    for(int i=0;i<size;i++) {
      int flag = 0;
      for(int j=0;j<size;j++) {
        if (array[i]==array[j]) {
          flag=flag+1;
          array[j]=0;
        }
        if(flag>1)
          sum=sum+array[i];
      }
    }
    System.out.println(sum);
  }
}
