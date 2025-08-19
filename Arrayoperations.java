import java.util.Arrays;
public class ArrayOperations {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int size=arr.length;
        System.out.println("Accessing elements:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int pos=2;
        int element=25;
        int[] arrInsert=new int[size + 1];
        for(int i=0;i<pos;i++)arrInsert[i]=arr[i];
        arrInsert[pos]=element;
        for(int i=pos;i<size;i++)arrInsert[i+1]=arr[i];
        size++;
        System.out.println("After insertion:"+Arrays.toString(arrInsert));
        pos=3;
        int[] arrDelete=new int[size - 1];
        for(int i=0,j=0;i<size;i++){
            if(i!=pos)arrDelete[j++]=arrInsert[i];
        }
        size--;
        System.out.println("After deletion:"+Arrays.toString(arrDelete));
        int key=40;
        boolean found=false;
        for(int i=0;i<size;i++){
            if(arrDelete[i]==key){
                System.out.println("Element"+key+"found at index"+i);
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Element"+key+"not found.");
        Arrays.sort(arrDelete);
        System.out.println("Sorted array:"+Arrays.toString(arrDelete));
    }
}
