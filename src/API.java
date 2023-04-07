public enum API {
    IMDB_TOP_MOVIES("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json", new ExtratorDeConteudoDoIMDB()),
    NASA("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD-JamesWebbSpaceTelescope.json", new ExtratorDeConteudoDaNasa()),
    LOCAL("http://localhost:8080/linguagens", new ExtratorDeConteudoDoIMDB());

    private String url;
    private ExtratorDeConteudo extrator;

    API(String url, ExtratorDeConteudo extrator){
        this.url = url;
        this.extrator = extrator;
    }

    public String getURL(){
        return url;
    }
    public ExtratorDeConteudo getExtrator(){
        return extrator;
    }
}
