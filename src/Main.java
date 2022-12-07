public class Main {
    public static void main(String[] args) {
        String symbol = "";

        //Voeg voor elke ronde in de for loop een a toe aan de variabele "symbol"
        //en druk deze af op een nieuwe regel.
        for (int i = 0; i < 5; i++) {
            symbol = symbol + "a";
            System.out.println(symbol);
        }
        //maak een for loop aan die 5 keer een symbool afdrukt.
        for(int index=0;index<5;index++) {
            //bepaal het aantal spaties die aan voor het symbool afgedrukt wordt
            for(int spaceIndex = 0; spaceIndex <5-index; spaceIndex++) {
                System.out.print(" ");
            }
            //druk de hoeveelheid symbolen die moet worden geplaatst
            for (int symbolIndex = 0; symbolIndex <= index; symbolIndex++) {
                System.out.print("* ");
            }
            //zet de volgende regel symbolen op een nieuwe regel in de console output.
            System.out.println();
        }

    }
}