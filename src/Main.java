public class Main {
    public static void main(String[] args) {
        System.out.println("\n __________Arvore_________ \n");
        Arvore arvore = new Arvore(new Folha(30));
        arvore.inserir(new Folha(15));
        arvore.inserir(new Folha(45));
        arvore.inserir(new Folha(7));
        arvore.inserir(new Folha(19));
        arvore.inserir(new Folha(13));
        arvore.inserir(new Folha(41));
        arvore.inserir(new Folha(97));
        arvore.inserir(new Folha(49));
        System.out.println("\n __________Amplitude_________ \n");
        arvore.amplitude(19);
        arvore.amplitude(97);
        System.out.println("\n __________Grau_________ \n");
        arvore.exibirGraus();

    }
}
