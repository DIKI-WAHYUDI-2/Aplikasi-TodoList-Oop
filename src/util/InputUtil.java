package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner input = new Scanner(System.in);

    public static String input(String info){
        System.out.print(info +  " : ");
        String data = input.nextLine();

        return data;
    }
}
