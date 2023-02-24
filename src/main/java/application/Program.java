package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println("Enter the number of tax players: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Taxpayer #" + i + " data:");
            System.out.println("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'i'){
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.println("Number of employees: ");
                Integer numberofEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberofEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp: list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
       for(TaxPayer tp: list){
           sum += tp.tax();
       }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
