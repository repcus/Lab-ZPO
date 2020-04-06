public class KsiazkaZObwoluta implements Publikacja{

    private Publikacja publikacja;

    public KsiazkaZObwoluta(Publikacja publikacja) {
        if (publikacja instanceof KsiazkaZObwoluta) {
            System.out.println("Obwoluta może być tylko jedna");
        }else if(!(publikacja instanceof KsiazkaZOkladkaZwykla || publikacja instanceof KsiazkaZOkladkaTwarda)){
            System.out.println("Książka bez okładki nie może mieć obwoluty");
        }else{
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
        return String.format("%s\tobwoluta\t|", this.publikacja.toString());
    }
}
