import java.util.Scanner;

public class funs {
    int a, b, c, op;
    public void lrg3nos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter First no:");
        a= sn.nextInt();
        System.out.println("Enter First no:");
        b= sn.nextInt();
        System.out.println("Enter First no:");
        c= sn.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest");
            }
            else{System.out.println(c+" is the largest");}
        }
        else{
            if(b>c){
                System.out.println(b+" is the largest");
            }
            else {
                System.out.println(c+" is the largest");
            }
        }
    }
    public void sm3nos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter First no:");
        a= sn.nextInt();
        System.out.println("Enter First no:");
        b= sn.nextInt();
        System.out.println("Enter First no:");
        c= sn.nextInt();

        if(a<b){
            if(a<c){
                System.out.println(a+"is the smallest");
            }
            else{System.out.println(c+"is the smallest");}
        }
        else{
            if(b<c){
                System.out.println(b+"is the smallest");
            }
            else {
                System.out.println(c+"is the smallest");
            }
        }
    }

}
