import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Main {

    public static boolean pruefeZeitueberschreitung(String ipAdresse) {
        try {
            Process process = Runtime.getRuntime().exec("ping " + ipAdresse);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if (line.contains("berschreitung") || line.contains("nicht finden")) {
                    return true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public static boolean pruefePing(String ipAdresse) {

       return !pruefeZeitueberschreitung(ipAdresse);
    }

    public static int pruefeAllePings(){
        int count = 0;



        for (int i = 1; i <= 128; i++) {
            String ping = "194.94.2." + i;
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


        String ping1 = "194.94.2.1";
        String ping2 = "194.94.2.1";


        System.out.println(pruefeZeitueberschreitung(ping1));

        System.out.println(pruefePing(ping2));

        //System.out.println(pruefeAllePings());

        //System.out.println(antwortendePings());


    }


}
