import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={8,0,0,8,2,8,0,6,5,4};
        int target=6;
        System.out.println(value(arr,target));
    }
    public  static boolean value(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    } 
}