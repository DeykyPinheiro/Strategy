package org.example;

import org.example.moves.AcceptedMoves;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String move = scanner.nextLine();
        while (listAcceptedMoves().contains(move.toUpperCase())) {
            AcceptedMoves acceptedMoves = AcceptedMoves.valueOf(move.toUpperCase());
            System.out.println(acceptedMoves.action().move());
            move = scanner.nextLine();
        }
        scanner.close();
    }

    public static List<String> listAcceptedMoves() {
        List<String> listAcceptedMoves = new ArrayList<>();

        for (AcceptedMoves move : AcceptedMoves.values()) {
            listAcceptedMoves.add(move.toString());
        }
        return listAcceptedMoves;
    }
}