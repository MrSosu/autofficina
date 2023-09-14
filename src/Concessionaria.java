public class Concessionaria {

    // attributi
    private String nome;
    private String indirizzo;
    private Automobile[] automobili;

    // costruttori
    public Concessionaria(String nome, String indirizzo, Automobile[] automobili) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.automobili = automobili;
    }

    public Concessionaria(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.automobili = new Automobile[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Automobile[] getAutomobili() {
        return automobili;
    }

    public void setAutomobili(Automobile[] automobili) {
        this.automobili = automobili;
    }

    // metodi
    public void aggiungiAuto(Automobile automobile) {
        int index = -1;
        for (int i = 0; i < automobili.length; i++) {
            if (automobili[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) System.out.println("Non hai più spazio per nuove auto!");
        else automobili[index] = automobile;
    }

    public void stampaPerPrezzo(double prezzo) {
        for (Automobile auto : automobili) {
            if (auto.getPrezzo() <= prezzo) {
                System.out.println(auto);
            }
        }
    }

    public void stampaPerMarchio(String marchio) {
        for (Automobile auto : automobili) {
            if (auto.getMarchio().equals(marchio)) {
                System.out.println(auto);
            }
        }
    }

}
