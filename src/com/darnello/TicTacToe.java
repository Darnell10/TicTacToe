package com.darnello;

import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printBoard(gameBoard);

        System.out.println("Your turn, choose boxes 1-9.");
        int position = scanner.nextInt();

        System.out.println(position);

//        switch (position){
//            case 1:
//                gameBoard[0][0] = 'x';
//                break;
//            case 2:
//                gameBoard[0][0] = 'x';
//                break;
//            case 3:
//                gameBoard[0][0] = 'x';
//                break;
//            case 4:
//                gameBoard[0][0] = 'x';
//                break;
//            case 5:
//                gameBoard[0][0] = 'x';
//                break;
//            case 6:
//                gameBoard[0][0] = 'x';
//                break;
//            case 7:
//                gameBoard[0][0] = 'x';
//                break;
//            case 8:
//                gameBoard[0][0] = 'x';
//                break;
//            case 9:
//                gameBoard[0][0] = 'x';
//                break;
//
//        }

    }

    public static void printBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char character : row) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
