public class Automobile {

    // attributi
    private String modello;
    private String marchio;
    private String targa;
    private int cilindrata;
    private double prezzo;
    private int nMarce;
    private int marciaInserita = 0;
    private boolean isAccesa = false;

    // costruttore
    public Automobile(String modello, String marchio, String targa, int cilindrata, double prezzo, int nMarce) {
        this.modello = modello;
        this.marchio = marchio;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
        this.nMarce = nMarce;
    }

    // getter e setter
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarchio() {
        return marchio;
    }

    public void setMarchio(String marchio) {
        this.marchio = marchio;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getnMarce() {
        return nMarce;
    }

    public void setnMarce(int nMarce) {
        this.nMarce = nMarce;
    }

    public int getMarciaInserita() {
        return marciaInserita;
    }

    public void setMarciaInserita(int marciaInserita) {
        this.marciaInserita = marciaInserita;
    }

    public boolean isAccesa() {
        return isAccesa;
    }

    public void setAccesa(boolean accesa) {
        isAccesa = accesa;
    }

    // metodi
    // se isAccesa è false, questo metodo lo setta a true e setta marciaInserita a 1.
    public void accensione() {
        if (isAccesa) {
            System.out.println("ERRORE! L'auto è già accesa, così la ingolfi!");
        }
        else {
            isAccesa = true;
            marciaInserita = 1;
        }
    }

    // se isAccesa è true, questo metodo lo setta a false e setta la marciaInserita a 0.
    public void spegnimento() {
        if (!isAccesa) {
            System.out.println("ERRORE! Come fai a spegnere una macchina spenta? Solo te");
        }
        else {
            isAccesa = false;
            marciaInserita = 0;
        }
    }

    // aumenta la marcia di 1 se non supera nMarce ed è accesa.
    public void aumentaMarcia() {
        if (marciaInserita == nMarce || marciaInserita == 0) {
            System.out.println("Non puoi andare oltre con le marce! Stai bono che rompi il cambio. A meno che non hai" +
                    " la macchina spenta in tal caso sei doppiamente tonto.");
        }
        else {
            marciaInserita++;
        }
    }

    public void scalaMarcia() {
        if (marciaInserita <= 1) {
            System.out.println("ERRORE! Non puoi scalare marcia");
        }
        else {
            marciaInserita--;
        }
    }

    public void inserisciMarcia(int marcia) {
        if (marcia >= 1 && marcia <= nMarce) {
            marciaInserita = marcia;
        }
        else {
            System.out.println("Marcia non valida");
        }
    }

    @Override
    public String toString() {
        return marchio + " " + modello + " Cilindrata : " + cilindrata;
    }
}
