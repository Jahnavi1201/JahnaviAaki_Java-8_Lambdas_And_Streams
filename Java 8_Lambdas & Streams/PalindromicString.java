import java.util.stream.*; 
import java.util.*;
@FunctionalInterface
interface StringInterface{
      Stream<String> getPalindromes(String[] list);
    }
class PalindromicString{
    public static List<String> findPalindromes(String[] list){
        StringInterface obj = (String[] arr) -> Stream.of(list).filter(string -> PalindromicString.isPalindrome(string));
        return obj.getPalindromes(list).collect(Collectors.toList());
    }
    public static boolean isPalindrome(String str){
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        return str.equals(temp);
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
        List<String> resultant_list=PalindromicString.findPalindromes(list);
        if(resultant_list.size()==0){
            System.out.println("There are no palindromes in the input list :(");
        }
        else{
            System.out.println("The \"palindromes\" in the input list are : ");
            for(int i=0;i<resultant_list.size();i++){
                System.out.println((i+1)+". "+resultant_list.get(i));
            }        
        }
        }
}