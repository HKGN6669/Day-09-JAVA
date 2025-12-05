import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int count=0;
        while(n!=0){
            int ld=n%10;
            count++;
            n=n/10;
        }
        n=temp;
        int sum=0;
        while(n!=0){
            int ld=n%10;
            int exp=1;
            for(int i=1;i<=count;i++){
                exp=exp*ld;
            }
            count--;
            sum=sum+exp;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("neon num");
        }else{
            System.out.println("Not neon num");
        }
    }
}