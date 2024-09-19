package Epicode.designPatterns.composite;

    public class Pagina implements Pagine{
        private int nPagina;

        public Pagina() {
            this.nPagina = 1;
        }


        @Override
        public int getNumeroPagine() {
            return nPagina;
        }

        @Override
        public void stampa() {
            System.out.println("La pagina è solo una");
        }
}
