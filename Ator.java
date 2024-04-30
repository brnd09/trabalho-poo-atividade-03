public class Ator {
  int idAtor;
  String papel, nome;
  Filme filme;

  public Ator(int idAtor, String papel, String nome, Filme filme) {
    this.idAtor = idAtor;
    this.papel = papel;
    this.nome = nome;
    this.filme = filme;
  }

  @Override
  public String toString() {
    return nome;
  }
}
