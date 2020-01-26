import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.println();
        Types types = new Types();
        EaseOfUse ez = new EaseOfUse();
        Scanner kboard = new Scanner(System.in);
        boolean loopCondition = true;
        while(loopCondition) {
            System.out.println("Which type would you like?");
            System.out.println("1) Normal");
            System.out.println("2) Fire");
            System.out.println("3) Water");
            System.out.println("4) Electric");
            System.out.println("5) Grass");
            System.out.println("6) Ice");
            System.out.println("7) Fighting");
            System.out.println("8) Poison");
            ez.print("9) Ground");
            ez.print("10) FLying");
            ez.print("11) Psychic");
            ez.print("12) Bug");
            ez.print("13) Rock");
            ez.print("14) Ghost");
            ez.print("15) Dragon");
            ez.print("16) Dark");
            ez.print("17) Steel");
            ez.print("18) Fairy");
            ez.print("19) Stop");

            String answer = kboard.next();
            if (answer.equalsIgnoreCase("1")||answer.equalsIgnoreCase("Normal")){
                types.normal();
            }
            else if (answer.equalsIgnoreCase("2")||answer.equalsIgnoreCase("Fire")){
                types.fire();
            }
            else if (answer.equalsIgnoreCase("3")||answer.equalsIgnoreCase("Water")){
                types.water();
            }
            else if (answer.equalsIgnoreCase("4")||answer.equalsIgnoreCase("Electric")){
                types.electric();
            }
            else if (answer.equalsIgnoreCase("5")||answer.equalsIgnoreCase("Grass")){
                types.grass();
            }
            else if (answer.equalsIgnoreCase("6")||answer.equalsIgnoreCase("Ice")) {
                types.ice();
            }
            else if (answer.equalsIgnoreCase("7")||answer.equalsIgnoreCase("Fighting")) {
                types.fighting();
            }
            else if (answer.equalsIgnoreCase("8")||answer.equalsIgnoreCase("Poison")) {
types.poison();
            }
            else if (answer.equalsIgnoreCase("9")||answer.equalsIgnoreCase("Ground")) {
types.ground();
            }
            else if (answer.equalsIgnoreCase("10")||answer.equalsIgnoreCase("FLying")) {
types.flying();
            }
            else if (answer.equalsIgnoreCase("11")||answer.equalsIgnoreCase("Psychic")) {
types.psychic();
            }
            else if (answer.equalsIgnoreCase("12")||answer.equalsIgnoreCase("Bug")) {
types.bug();
            }

            else if (answer.equalsIgnoreCase("13")||answer.equalsIgnoreCase("Rock")) {
types.rock();
            }
            else if (answer.equalsIgnoreCase("14")||answer.equalsIgnoreCase("Ghost")) {
types.ghost();
            }
            else if (answer.equalsIgnoreCase("15")||answer.equalsIgnoreCase("Dragon")) {
types.dragon();
            }
            else if (answer.equalsIgnoreCase("16")||answer.equalsIgnoreCase("Dark")) {
types.dark();
            }
            else if (answer.equalsIgnoreCase("17")||answer.equalsIgnoreCase("Steel")) {
types.steel();
            }
            else if (answer.equalsIgnoreCase("18")||answer.equalsIgnoreCase("Fairy")) {
types.fairy();
            }
            else if (answer.equalsIgnoreCase("19")||answer.equalsIgnoreCase("Stop")){
                loopCondition=false;
            }
            else {
                System.out.println("Sorry, I don't have that type\n");

            }
        }


    }
}

