package com.example.main;

public class Main {
    public static void main(String[] args) {
        Main calculator = new Main();
        calculator.someMethod();
        int liczba1;  
        int liczba2;
        char znak;
        Scanner licz = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        liczba1 = licz.nextInt();
        System.out.println("Podaj drugą liczbę:");
        liczba2 = licz.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");


        znak = licz.next().charAt(0);
        switch (znak)
        {
            case '+':
            {
                System.out.println(liczba1 + liczba2);
                break;
            }
            case '-':
            {
                System.out.println(liczba1 - liczba2);
            }
        }
    }

    private void someMethod() {

    }
}




    

