package reversing;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {
        String Original;
        String rev = "";

        System.out.println("Input String as much as you can : ");
        Scanner sc = new Scanner(System.in);
        Original = sc.nextLine();
        int len = Original.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + Original.charAt(i);
        }
        System.out.println("Original String : " + Original);
        System.out.println("Reverese String : " + rev);
    }

}
