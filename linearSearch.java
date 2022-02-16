import java.util.Scanner;
public class linearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    int [] arr = new int[size];
    System.out.println("Enter the elements of the arra");
    System.out.println("Enter the elements of the array");
    for(int i=0;i<size;i++)
    https://github.com/
      arr[i]=sc.nextInt();
    System.out.println("Enter the element to be searched");
    System.out.println("Enter the elements of the");
    int element=sc.nextInt();
    int j;
    for(j=0;j<size;j++)
    {
      if(arr[j]==element)
      {
        System.out.println("The element is at "+(j+1)+" index");
        break;
      }
    }
    if(j==size)
      System.out.println("Element not found");
  }
}
