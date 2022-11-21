import java.util.Scanner;

public class menu {
    int a, b, c, op;


    public static void main(String[] args) {

        int op;
        Scanner sn = new Scanner(System.in);
        while (true) {
            System.out.println("------Menu-----");
            System.out.println("| 1.Largest of 3 nos        |");
            System.out.println("| 2.Smallest of 3 nos   |");
            System.out.println("| 3.Prime or not  |");
            System.out.println("| 4.Even or not    |");
            System.out.println("| 5.Reverse of a string       |");
            System.out.println("| 6.Exit|");
            System.out.println("|______________|");

            System.out.println("Enter your Option:");
            op = sn.nextInt();

            if (op == 1) {

            } else if (op == 2) {

            } else if (op == 3) {

            } else if (op == 4) {

            } else if (op == 4) {

            }else if (op == 5) {
                    System.out.println("ok bei");
                    System.exit(0);
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}