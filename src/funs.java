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
    public void prime(){
        int i,m=0,flag=0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter no:");
        int n= sn.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }
    public void evnNt(){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
        }
    }

}
