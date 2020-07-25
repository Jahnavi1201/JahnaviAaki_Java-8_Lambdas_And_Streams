import java.util.stream.*; 
import java.util.*;
class StringsOfLength3AndStartWithA{
    interface StringInterface{
            Stream<String> find_Strings_Start_With_a_And_Length_3(String[] list);
        }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int list_size=scan.nextInt();
        String[] list=new String[list_size];
        for(int i=0;i<list_size;i++)
        {
            System.out.println("Enter a string to push into the list: ");
            list[i]=scan.next();
        }
        StringInterface obj = (String[] arr) -> Stream.of(list).filter(string -> string.startsWith("a") && string.length()==3);
        List<String> resultant_list=obj.find_Strings_Start_With_a_And_Length_3(list).collect(Collectors.toList());
        if(resultant_list.size()==0)
            System.out.println("There are no strings with length 3 and start with a in the input list");
        else{
            System.out.println("Strings that start with \"a\" and of length \"3\" in the input list are : ");
            for(int i=0;i<resultant_list.size();i++)
               System.out.println((i+1)+". "+resultant_list.get(i));
        }
    }
}