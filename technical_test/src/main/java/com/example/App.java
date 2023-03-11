package com.example;

import java.util.*;

public class App {
    private int userInput;
    private StringBuilder treeBuilder;
    private String outputString;

    App(int input) {
        this.userInput = input;
        this.treeBuilder = new StringBuilder();
        buildTree();
    }

    public void keyboardInput() {
        Scanner keyboardScan = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        this.userInput = keyboardScan.nextInt();
        keyboardScan.close();
    }

    public void buildTree() {
        for (int i = 1; i < this.userInput; i++) {
            for (int j = 1; j < this.userInput - i; j++) {
                treeBuilder.append("  ");
            }
            for (int k = 1; k < i * 2; k++) {
                treeBuilder.append("* ");
            }
            treeBuilder.append("\n");
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < this.userInput - i; j++) {
                treeBuilder.append("  ");
            }
            for (int k = 1; k < i * 2; k++) {
                treeBuilder.append("* ");
            }
            treeBuilder.append("\n");
        }
        this.outputString = treeBuilder.toString();
    }

    public void printTree() {
        System.out.println(this.outputString);
    }

    public int getUserInput() {
        return this.userInput;
    }

    public String getOutput() {
        return this.outputString;
    }

    public static void main(String[] args) throws Exception {
        App app = new App(5);
        app.printTree();
    }
}
