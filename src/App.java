import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    

        API api = API.NASA; //unica linha que muda para alterar a URL e Extrator
        String url = api.getURL();
        ExtratorDeConteudo extrator = api.getExtrator();

        ClienteHttp http = new ClienteHttp();
        String json = http.buscaDados(url);   

        //exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
        GeradoraDeFigurinhas geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            
            Conteudo conteudo = conteudos.get(i);
            
            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = conteudo.titulo() + ".png";
        
            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.titulo());


        }
    }
}
