import java.util.stream.IntStream; 
import java.util.Scanner;
class AverageOfListOfIntegers{
    interface AdditionInterface{
            int addition(int[] list);
        }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int list_size=scan.nextInt();
        int[] list=new int[list_size];
        for(int i=0;i<list_size;i++)
        {
            System.out.println("Enter an element to push into the list: ");
            list[i]=scan.nextInt();
        }
        AdditionInterface obj = (int[] arr) -> IntStream.of(arr).sum();
        System.out.println("==== > The average of list elements is \""+((double)obj.addition(list)/list_size)+"\" < ====");
    }
}