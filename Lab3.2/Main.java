public class Main {
    public static void main(String[] args) {
        Publikacja k1 = new Ksiazka("tata", "życzenia", 1);
        Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
        Publikacja kkk1 = new KsiazkaZObwoluta(kk1);
        Publikacja kkkk1 = new KsiazkaZAutografem(kkk1, "dla mamy");
        //teraz złe
        Publikacja z1 = new KsiazkaZOkladkaTwarda(kk1);
        Publikacja z2 = new KsiazkaZAutografem(kkkk1, "nie dla mamy");
        Publikacja z3 = new KsiazkaZObwoluta(k1);

        System.out.println(k1 + "\n" + kk1 + "\n" + kkk1 + "\n" + kkkk1);
        System.out.println(z1 + "\n" + z2 + "\n" + z3);
    }
}
