package com.mycompany.pajak;

import java.util.Scanner;

final class Pajak {
    double harga;
    double pajak;

    public Pajak(String vendor, String tipe, double harga) {
        this.harga = harga;
        this.calculatePajak();
    }

    void calculatePajak() {
        if (harga <= 4000000) {
            pajak = 0.01;
        } else if (harga > 4200000 && harga <= 4500000) {
            pajak = 0.02;
        } else if (harga > 4500000) {
            pajak = 0.05;
        } else {
            pajak = 0.005;
        }
    }

    double calculatePriceWithPPN() {
        return harga + (harga * pajak);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vendor:");
        String vendor = scanner.nextLine();
        System.out.println("Enter tipe:");
        String tipe = scanner.nextLine();
        System.out.println("Enter harga:");
        double harga = scanner.nextDouble();

        Pajak smartphone = new Pajak(vendor, tipe, harga);
        System.out.println("Price with PPN: " + smartphone.calculatePriceWithPPN());
    }
}