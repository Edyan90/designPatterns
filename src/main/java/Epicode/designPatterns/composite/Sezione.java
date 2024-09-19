package Epicode.designPatterns.composite;

import java.util.List;

public class Sezione implements Pagine{
    private List<Pagina> paginaList;
    private List<Sezione> sottoSezioni;

    public void addPagina(Pagina pagina){
        sottoSezioni.add(pagina);
    }
    @Override
    public int getNumeroPagine() {


    }

    @Override
    public void stampa() {

    }

}
