package com.company;

public class Main {
    public static void main(String[] args) {
        Client Liza = new Client("Liza", 16, 450, false);
        Client Fast = new Client("Angelina", 16, 200, false);
        Client Abo = new Client("Abylai", 20, 10000, true);
        
        Barmen Dana = new Barmen("Dana", 17, Role.Barmen, 3000);
        Bounced Duka = new Bounced("Duka", 19, Role.Bounced, 3000, 40);
        Alcohol Infusion = new Alcohol("Granat", 500, 0.25, 40);

        System.out.println(Duka.faceControl(Abo));
        System.out.println(Dana.getDrink(Abo, Infusion).getPrice());
        System.out.println(Abo.getCash());

    }
}
