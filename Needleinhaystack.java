import java.util.Scanner;
public class Needleinhaystack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the haystack String:");
        String haystack=sc.nextLine();
        System.out.print("Enter the neddle String:");
        String needle=sc.nextLine();
         int index=haystack.indexOf(needle);
         if(index != -1){
             System.out.println("Needle found at index:"+index);
         }
         else{
             System.out.println("Needle not found in haystack");
         }
    }
}
