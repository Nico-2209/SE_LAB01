public class Geraete {

    private String name;
    private String ipAdresse;

    public Geraete(String name, String ipAdresse) {
        this.name = name;
        this.ipAdresse = ipAdresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAdresse() {
        return ipAdresse;
    }

    public void setIpAdresse(String ipAdresse) {
        this.ipAdresse = ipAdresse;
    }

    @Override
    public String toString() {
        return "Gerät: " + name + "\n" + "IP-Adresse: " + ipAdresse + "\n";
    }
}
