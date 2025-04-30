# 🌳 Árvore Binária em Java

Este projeto é uma implementação de uma árvore binária em Java, ideal para estudos e práticas de estruturas de dados. 📚

## 📁 Estrutura do Projeto

- `src/`: Contém os arquivos-fonte Java.
- `.gitignore`: Arquivos e pastas ignorados pelo Git.
- `README.md`: Este arquivo de documentação.

## 🚀 Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clone este repositório:

   ```bash
   git clone https://github.com/dougaandrade/ArvoreBinaria.git
   ```

3. Navegue até o diretório do projeto:

   ```bash
   cd ArvoreBinaria
   ```

4. Compile os arquivos Java:

   ```bash
   javac -d bin src/*.java
   ```

5. Execute o programa:

   ```bash
   java -cp bin Main
   ```

   > _Substitua `Main` pelo nome da classe principal, se diferente._

## 🛠️ Funcionalidades

- ✅ Inserção de nós na árvore - ✅
- 🔍 Busca de elementos - ✅
- 🔄 Travessias: - ⌛
  - Pré-ordem
  - Em-ordem
  - Pós-ordem
- 📏 Cálculo da altura da árvore - ✅
- ❌ Remoção de nós - ⌛

## 📷 Exemplo de Uso

```java
ArvoreBinaria arvore = new ArvoreBinaria();
arvore.inserir(10);
arvore.inserir(5);
arvore.inserir(15);
```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests. 👨‍💻👩‍💻

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
