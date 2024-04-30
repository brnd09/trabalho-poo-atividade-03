public class Sessao {
    int idSessao;
    Filme filme; 
    Sala sala;
    String horario;

    public Sessao(int idSessao, Filme filme, Sala sala, String horario) {
        this.idSessao = idSessao;
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }

  @Override
  public String toString() {
      return horario;
  }
}
