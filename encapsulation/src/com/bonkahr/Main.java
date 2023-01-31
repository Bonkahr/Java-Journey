package com.bonkahr;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(11);
        System.out.println("pages printed " + pagesPrinted + " new total print count");
    }
}
