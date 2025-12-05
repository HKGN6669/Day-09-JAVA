class Whatsapp{
    public static void v1(){
        System.out.println("chatting");
        v4();
    }
    public static void v2(){
        System.out.println("calls");
        v1();
    }
    public static void v3(){
        System.out.println("status");
        v2();
    }
    public static void v4(){
        System.out.println("meeta AI");
        v3();
    }
}
class Main{
    public static void main(String[] args){
        Whatsapp wp=new Whatsapp();
        wp.v4();
    } 
}