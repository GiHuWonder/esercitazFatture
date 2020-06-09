public class Fattura {
    private String id;
    private String descrizione;
    private double importo;

    void setId(String id) {
        this.id = id;
    }
    String getId() {
        return id;
    }
    void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    String getDescrizione() {
        return descrizione;
    }
    void setImporto(double importo) {
        this.importo = importo;
    }
    double getImporto() {
        return importo;
    }
    double getImportoIvato() {
        return importo * 1.22;
    }
}
