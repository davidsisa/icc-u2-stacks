package tarea3_ejercicios.View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    public ConsoleView(){
        this.scanner = new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("/t1. Add Contact");
        System.out.println("/t2. Find Contact");
        System.out.println("/t3. Delete Contact");
        System.out.println("/t4. Print Contact");
        System.out.println("/t5. Exit");
        System.out.println("/t4. Choose an option");
    }
    public String getInput(String prompt){
        System.out.println(" "+ prompt);
        return scanner.next();
    }
    public void showMesagge(String mesagge){
        System.out.println( " -- " + mesagge);
    }
}
