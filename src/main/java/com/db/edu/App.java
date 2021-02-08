package com.db.edu;

import com.db.edu.services.Printer;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        Printer printvar = new Printer();
        printvar.print("Test print class message!!!");

        Printer.print("Test print class message wo creation object");
        Printer.printSysProperties();
        Printer.printHostNameAndAddress();
    }
}
