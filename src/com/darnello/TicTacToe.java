package com.darnello;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        System.out.println("Your turn, choose boxes 1-9.");
        int position = scanner.nextInt();

        System.out.println(position);

        piecePlacer(gameBoard, position, "player");

        int computerPosition = random.nextInt(9) + 1;
        piecePlacer(gameBoard, computerPosition, "computer");


        printBoard(gameBoard);
    }

    public static void printBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char character : row) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void piecePlacer(char[][] gameBoard, int position, String player) {

        char character = ' ';

        if (player.equals("player")) {
            character = 'X';
        } else if (player.equals("computer")) {
            character = '0';

        }
        switch (position) {
            case 1:
                gameBoard[0][0] = character;
                break;
            case 2:
                gameBoard[0][2] = character;
                break;
            case 3:
                gameBoard[0][4] = character;
                break;
            case 4:
                gameBoard[2][0] = character;
                break;
            case 5:
                gameBoard[2][2] = character;
                break;
            case 6:
                gameBoard[2][4] = character;
                break;
            case 7:
                gameBoard[4][0] = character;
                break;
            case 8:
                gameBoard[4][2] = character;
                break;
            case 9:
                gameBoard[4][4] = character;
                break;
            default:
                break;

        }
    }
}
