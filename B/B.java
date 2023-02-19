package B;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner CPRNumber = new Scanner(System.in);
        System.out.println("Skriv dit CPR nummer her");

        int CPRInput = Integer.parseInt(CPRNumber.nextLine());
        System.out.println(CPRInput);

        String numberString = "" + CPRInput;
        char firstLetterchar = numberString.charAt(0);
        int firstDigit = Integer.parseInt("" + firstLetterchar);

        System.out.println(numberString.length());

        if (CPRInput == 10) {
            System.out.println("Invalid CPR");

            if (firstDigit < 3)
            System.out.println("Valid CPR");

        }


    }


}
    