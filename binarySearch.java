import java.util.*;
public class binarySearch{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int size=sc.nextInt();
    int [] arr = new int [size];
    System.out.println("Enter the elements of Array");
    for(int i=0;i<size;i++)
      arr[i]=sc.nextInt();
    Arrays.sort(arr);
    System.out.println("Enter the element to be searched");
    int value=sc.nextInt();
    int location=binarySearch(arr, 0, (size-1), value);
    if(location==(-1))
      System.out.println("Element not found.");
    else
      System.out.println("The element is found at "+(location+1)+" index.");
  }
  static int binarySearch(int[] arr, int beg, int end, int value){
    int mid=0;
    if(end>=beg){
      mid = (beg+end)/2;
      if(value==arr[mid])
        return mid;
        else if(value>arr[mid])
        return binarySearch(arr, mid+1, end, value);
        else if(value<arr[mid])
        return binarySearch(arr, beg, mid-1, value);
      }
    return -1;
  }
}
