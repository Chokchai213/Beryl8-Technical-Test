package com.example;
import java.util.*;
class Tree{
    public int getUserInput(){
        Scanner keyboardScan = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int userInput = keyboardScan.nextInt();
        keyboardScan.close();
        return userInput;
    }
    public void printTree(int userInput){
        for(int i=1;i<userInput;i++){ //if first i = 0 it will waste 1 iterate for j and k is the same
            for(int j = 1; j<userInput-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree();
        int userInput = tree.getUserInput();
        tree.printTree(userInput);
    }
}

