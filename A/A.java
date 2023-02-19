package A;

import java.util.Random;

public class A {

    public static void main(String[] args) {

        Random GetRandomNumber = new Random();

        for(int i =0; i < 10; i++)
        {
            int RandomNumber = GetRandomNumber.nextInt(10) + 1;
            System.out.println(RandomNumber);
        }

    }
}
