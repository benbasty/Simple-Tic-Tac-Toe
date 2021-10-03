package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static char firstLetter;
    static char secondLetter;
    static char thirdLetter;
    static char fourthLetter;
    static char fifthLetter;
    static char sixthLetter;
    static char seventhLetter;
    static char eighthLetter;
    static char ninthLetter;
    static String input;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells:");
        input = scanner.nextLine();

        firstLetter = input.charAt(0);
        secondLetter = input.charAt(1);
        thirdLetter = input.charAt(2);
        fourthLetter = input.charAt(3);
        fifthLetter = input.charAt(4);
        sixthLetter = input.charAt(5);
        seventhLetter = input.charAt(6);
        eighthLetter = input.charAt(7);
        ninthLetter = input.charAt(8);

        printOutput();

        while(true) {

            try {
                System.out.print("Enter the coordinates: ");
                int firstCoordinate = scanner.nextInt();
                int secondCoordinate = scanner.nextInt();


                if (firstCoordinate == 1 && secondCoordinate == 1) {
                    if(input.charAt(0) == '_') {
                        firstLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 1 && secondCoordinate == 2) {
                    if(input.charAt(1) == '_') {
                        secondLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }

                } else if (firstCoordinate == 1 && secondCoordinate == 3) {
                    if(input.charAt(2) == '_') {
                        thirdLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 2 && secondCoordinate == 1) {
                    if(input.charAt(3) == '_') {
                        fourthLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 2 && secondCoordinate == 2) {
                    if(input.charAt(4) == '_') {
                        fifthLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 2 && secondCoordinate == 3 ) {
                    if(input.charAt(5) == '_') {
                        sixthLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 3 && secondCoordinate == 1) {
                    if(input.charAt(6) == '_') {
                        seventhLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 3 && secondCoordinate == 2) {
                    if(input.charAt(7) == '_') {
                        eighthLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate == 3 && secondCoordinate == 3) {
                    if(input.charAt(8) == '_') {
                        ninthLetter = 'X';
                        printOutput();
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else if (firstCoordinate > 3 || secondCoordinate > 3){
                    System.out.println("Coordinates should be from 1 to 3!");
                }

            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                scanner.hasNextInt();
            }

        }

    }

    public static void checkInputFirstLetterAndPrintOutput(String input) {
        if(input.charAt(0) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }

    public static void checkInputSecondLetterAndPrintOutput(String input) {
        if(input.charAt(1) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }

    public static void checkInputThirdLetterAndPrintOutput(String input) {
        if(input.charAt(2) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }

    public static void checkInputFourthLetterAndPrintOutput(String input) {
        if(input.charAt(3) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }

    }

    public static void checkInputFifthLetterAndPrintOutput(String input) {
        if(input.charAt(4) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }

    }

    public static void checkInputSixthLetterAndPrintOutput(String input) {
        if(input.charAt(5) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }

    }

    public static void checkInputSeventhLetterAndPrintOutput(String input) {
        if(input.charAt(6) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }

    }

    public static void checkInputEightLetterAndPrintOutput(String input) {
        if(input.charAt(7) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }

    }
    public static void checkInputNinthLetterAndPrintOutput(String input) {
        if(input.charAt(8) == '_') {
            printOutput();
        } else {
            System.out.println("This cell is occupied! Choose another one!");
        }
    }




    public static void printOutput() {
        System.out.println("---------");

        System.out.println("| " + firstLetter + " " + secondLetter + " " + thirdLetter + " |");

        System.out.println("| " + fourthLetter + " " + fifthLetter + " " + sixthLetter + " |");

        System.out.println("| " + seventhLetter + " " + eighthLetter + " " + ninthLetter + " |");

        System.out.println("---------");
    }

}
