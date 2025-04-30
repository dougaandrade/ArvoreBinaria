
import java.util.LinkedList;
import java.util.Queue;

public class Arvore {

  private Folha folha;
  private Arvore esquerda;
  private Arvore direita;

  public Arvore() {
    this.folha = null;
    this.esquerda = null;
    this.direita = null;
  }

  public Arvore(Folha folha) {
    this.folha = folha;
    this.esquerda = null;
    this.direita = null;
  }

  public boolean isEmpty() {
    return this.folha == null;
  }

  public void inserir(Folha novo) {
    if (isEmpty()) {
      this.folha = novo;
    } else {
      Arvore novaArvore = new Arvore(novo);
      if (novo.getValor() < this.folha.getValor()) {
        if (this.esquerda == null) {
          this.esquerda = novaArvore;
          System.out.println("Folha: " + novo.getValor() + " a esquerda de: " + this.folha.getValor());
        } else {
          this.esquerda.inserir(novo);
        }
      } else if (novo.getValor() > this.folha.getValor() && this.direita == null) {
        this.direita = novaArvore;
        System.out.println("Folha: " + novo.getValor() + " a direita de: " + this.folha.getValor());
      } else {
        this.direita.inserir(novo);
      }

    }
  }

  public boolean amplitude(int valorBuscado) {
    if (this.isEmpty()) {
      System.out.println("Árvore vazia.");
      return false;
    }

    Queue<Arvore> fila = new LinkedList<>();
    fila.add(this);

    while (!fila.isEmpty()) {
      Arvore atual = fila.poll();

      if (atual.folha != null) {
        System.out.println("Visitando: " + atual.folha.getValor());

        if (atual.folha.getValor() == valorBuscado) {
          System.out.println("Valor encontrado: " + valorBuscado);
          return true;
        }
      }

      if (atual.esquerda != null)
        fila.add(atual.esquerda);
      if (atual.direita != null)
        fila.add(atual.direita);
    }

    System.out.println("Valor " + valorBuscado + " não encontrado.");
    return false;
  }

  public void exibirGraus() {
    if (this.isEmpty())
      return;

    int grau = 0;
    if (this.esquerda != null)
      grau++;
    if (this.direita != null)
      grau++;
    System.out.println("Nó " + this.folha.getValor() + " tem grau " + grau);

    if (this.esquerda != null)
      this.esquerda.exibirGraus();
    if (this.direita != null)
      this.direita.exibirGraus();
  }

}
