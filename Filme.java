public class Filme {
    int idFilme;
    String titulo, genero;
    long duracao;

    public Filme(int idFilme, String titulo, String genero, long duracao) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

  @Override
  public String toString() {
      return " " + "titulo: " + titulo + " | genero: " + genero + " | duracao: " + duracao + " min " + " ";
  }
}


    
    
    
   

