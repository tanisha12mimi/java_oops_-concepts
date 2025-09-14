package Exception_Handling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IntroException {
//  trycatch


    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the dividend : ");
        int B = SC.nextInt();

        int a;
        int arr[] = new int[3];

        try {
            arr[7] = 60;
            a = 10 / B;

        } catch (ArithmeticException E) {
            System.out.println("catch1");
        } catch (Exception E) {
            System.out.println("catch 2");
        }
        finally {
            System.out.println("all solved");
        }


    }
}

