import java.util.ArrayList;

import static Net.Net.*;

public class Main {

    public static boolean pruefeZeitueberschreitung(String eingabe) {

        String eingabePing = ping(eingabe);

        if (eingabePing.contains("Zeitüberschreitung")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean pruefePing(String eingabe) {

       return !pruefeZeitueberschreitung(eingabe);
    }

    public static int pruefeAllePings(){
        int count = 0;
        String ping = null;


        for (int i = 1; i <= 128; i++) {
            ping = "194.94.2.";
            ping += Integer.toString(i);

            if (pruefePing(ping)) {
                count++;
            }
        }

        return count;
    }

    public static ArrayList<String> antwortendePings() {

        ArrayList<String> pingListe = new ArrayList<>();

        for (int i = 1; i <= 128; i++) {
            String ping = "194.94.2." + i;

            if (pruefePing(ping)) {
                pingListe.add(ping);
            }
        }

        return pingListe;
    }



    public static void main(String[] args) {


        String ping1 = "194.94.2.14";
        String ping2 = "194.94.2.20";


        String pingErgebniss = ping(ping1);

        pingErgebniss += ping(ping2);


        System.out.println(pingErgebniss);

        System.out.println(pruefeZeitueberschreitung(ping1));

        System.out.println(pruefePing(ping1));

        System.out.println(pruefeAllePings());

        System.out.println(antwortendePings());

    }


}
