import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    public static int add(int n){
        if(n==0){
            return 0;
        }else{
            return n+add(n-1);
        }
    }
}