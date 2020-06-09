public class ProvaFatture {
    public static void main(String[] arg) {
        System.out.println("inizio");
        Fattura fattura1 = new Fattura();
        fattura1.setId("A2-2019");
        fattura1.setDescrizione("Prestazione occasionale");
        System.out.println(fattura1.getId()+"  "+fattura1.getDescrizione());
        double importo = 1500;
        fattura1.setImporto(importo);
        double importoIvato = fattura1.getImportoIvato();
        if (importoIvato == 0.0) {
            System.out.println("l'importo non è stato assegnato!");
        } else {
            System.out.println("l'importo di " + importo + " con IVA al 22% è " + importoIvato);
        }
    }
}
