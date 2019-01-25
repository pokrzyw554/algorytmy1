package Listy;

import java.util.Scanner;

public class majnONP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ONP");
        String input = sc.nextLine();
        String[] operations = input.split(" ");
        ONP.run(operations);
    }
}
