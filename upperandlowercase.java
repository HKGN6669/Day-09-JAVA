import java.util.*;
public class upperandlowercase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if((s&32)==0)
        System.out.println("UPPER CASE");
        else
        System.out.println("LOWER CASE");
    }
}        