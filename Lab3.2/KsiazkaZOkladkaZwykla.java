public class KsiazkaZOkladkaZwykla implements Publikacja {

    private Publikacja publikacja;

    public KsiazkaZOkladkaZwykla(Publikacja publikacja){
        if(publikacja instanceof KsiazkaZOkladkaTwarda || publikacja instanceof KsiazkaZOkladkaZwykla){
            System.out.println("Książka nie może mieć dwóch okładek");
        }
        else{
            this.publikacja = publikacja;
        }
    }

    @Override
    public String dajAutora(){
        if(this.publikacja == null) return null;
        return this.publikacja.dajAutora();
    }

    @Override
    public String dajTytul(){
        if(this.publikacja == null) return null;
        return this.publikacja.dajTytul();
    }

    @Override
    public int dajLiczbeStron(){
        if(this.publikacja == null) return -1;
        return this.publikacja.dajLiczbeStron();
    }

    public String toString(){
        if(this.publikacja == null) return null;
        return String.format("%s\tokładka miękka\t|", this.publikacja.toString());
    }
}
