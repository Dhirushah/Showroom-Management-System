package Model;

import java.util.Scanner;

public class Output extends Price{
    public Output(int fullservice, int modifiedcharge) {
        super(fullservice, modifiedcharge);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of Fullservice Price:");
        int fullservice = sc.nextInt();

        System.out.println("Enter the price of Modified Price:");
        int modifiedcharge = sc.nextInt();

// output


    }
}
