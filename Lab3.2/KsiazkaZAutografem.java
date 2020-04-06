public class KsiazkaZAutografem implements Publikacja{

    private Publikacja publikacja;
    private String autograf;

    public KsiazkaZAutografem(Publikacja publikacja, String autograf) {
        if(publikacja instanceof KsiazkaZAutografem){
            System.out.println("Autograf może być tylko jeden");
        }else{
            this.publikacja = publikacja;
            this.autograf = autograf;
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
    public String dajAutograf(){
        if(this.publikacja == null) return null;
        return this.autograf;
    }

    public String toString(){
        if(this.publikacja == null) return null;
        return String.format("%s\t%s\t|", this.publikacja.toString(), dajAutograf());
    }
}
