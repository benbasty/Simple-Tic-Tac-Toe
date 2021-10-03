package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        print();
    }

    private static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells:");
        String input = scanner.nextLine();
        String[] parts = input.split("");

        System.out.println("---------");

        System.out.println("| " + parts[0] + " " + parts[1] + " " + parts[2] + " |");

        System.out.println("| " + parts[3] + " " + parts[4] + " " + parts[5] + " |");

        System.out.println("| " + parts[6] + " " + parts[7] + " " + parts[8] + " |");

        System.out.println("---------");

    }
}
