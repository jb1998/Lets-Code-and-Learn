
import java.util.Scanner;

public class Array{
  public static void main(String[] args) {
   
    Scanner s=new Scanner(System.in);

    //Creating array Dynamically
    System.out.println("Enter size of Array : ");
    int size=s.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++){
      System.out.println("Enter "+(i+1)+" element");
      array[i]=s.nextInt();
    }

    //Accessing Elemets
    for(int i=0;i<size;i++){
      System.out.println((i+1)+" element of the Array is : "+array[i]);
    }
  }
}
