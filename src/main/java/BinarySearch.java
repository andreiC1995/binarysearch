import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];

        for(int i=0;i<array.length;i++){
            array[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int result = binSearch(array,target);
        System.out.println(result);
    }

    public static int binSearch(int[] array,int target){
        int left = 0;
        int right = array.length-1;

        while(left<right){
            int middle = (left+right)/2;

            if(target < array[middle]){
                right = middle-1;
            }
            else if(target > array[middle]){
                left = middle+1;
            }
            else{
                return middle;
            }
        }

        return -1;
    }
}
