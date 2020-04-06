public class Ksiazka implements Publikacja {

    private String autor;
    private String tytul;
    private int liczbaStron;

    public Ksiazka(String autor, String tytul, int liczbaStron){
        this.autor = autor;
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String dajAutora() {
        return this.autor;
    }

    @Override
    public String dajTytul() {
        return this.tytul;
    }

    @Override
    public int dajLiczbeStron() {
        return this.liczbaStron;
    }

    public String toString(){
        return String.format("|\t%s\t|\t%s\t|\t%d\t|", autor, tytul, liczbaStron);
    }
}
