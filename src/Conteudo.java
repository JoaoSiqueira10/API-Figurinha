public class Conteudo {
    private final String titulo;
    private final String urlImatem;
        
    public Conteudo(String titulo, String urlImatem) {
        this.titulo = titulo;
        this.urlImatem = urlImatem;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getUrlImatem() {
        return urlImatem;
    }
}
