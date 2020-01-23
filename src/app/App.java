package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world");

        Person personLoc = new Person();
        personLoc.setName("Loc");        
        System.out.println("hello " + personLoc.getName());

        Person personVisar = new Person();
        personVisar.setName("Visar");
        System.out.println("hello " + personVisar.getName());
    
        System.out.println( personLoc.getName() + " hat " + personLoc.getFinger()+" Finger.");

        System.out.println(personVisar.getName() + " hat auch "+ personVisar.getFinger()+ " Finger.");
    
    }
}