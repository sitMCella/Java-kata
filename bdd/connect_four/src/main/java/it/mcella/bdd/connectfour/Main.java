package it.mcella.bdd.connectfour;

import it.mcella.bdd.connectfour.ConnectFour;
import it.mcella.bdd.connectfour.Grid;
import it.mcella.bdd.connectfour.GridOperations;

import java.util.Random;

public class Main {

    public static void main(String args[]) {
        GridOperations gridOperations = new GridOperations(new Grid());
        Random random = new Random();
        ConnectFour connectFour = new ConnectFour(gridOperations, random);
        connectFour.start();
    }

}
