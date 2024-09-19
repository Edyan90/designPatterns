package Epicode.designPatterns.composite;

public class Libro {
    private List<Sezioni> sezioni;
    private List<Autori> autoriList;
    private double price;

    public Libro(List<Autore> autoreList, int prezzo) {
        this.autoreList = autoreList;
        this.prezzo = prezzo;
    }

}
