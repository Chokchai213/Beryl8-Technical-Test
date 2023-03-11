package com.example;
import java.util.*;

public class App {
    private int userInput;
    App(){
        
    }
    public void getUserInput(){
        Scanner keyboardScan = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        this.userInput = keyboardScan.nextInt();
        keyboardScan.close();
    }
    public void printTree(){
        for(int i=1;i<this.userInput;i++){
            for(int j = 1; j<this.userInput-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<3;i++){
            for(int j=1;j<this.userInput-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void setUserInput(int input){
        this.userInput = input;
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.printTree();
    }
}

