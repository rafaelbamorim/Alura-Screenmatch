import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

//      Filme 1
        Filme filmeFav = new Filme();
        filmeFav.setNome("The Matrix");
        filmeFav.setAnoDeLancamento(1999);
        filmeFav.setDuracaoMinutos(135);
        filmeFav.setIncluidoNoPlano(false);

//      Serie 1
        Serie serieFav = new Serie();
        serieFav.setNome("Lost");
        serieFav.setAnoDeLancamento(2004);
        serieFav.setIncluidoNoPlano(true);
        serieFav.setTemporadas(6);
        serieFav.setMinutosPorEpisodio(48);
        serieFav.setAtiva(false);
        serieFav.setEpisodiosPorTemporada(10);

//      Filme 2
        Filme outroFilme = new Filme();
        outroFilme.setNome("GodFather");
        outroFilme.setAnoDeLancamento(1972);
        outroFilme.setDuracaoMinutos(175);
        outroFilme.setIncluidoNoPlano(true);

        System.out.println("\n======================================");
        filmeFav.exibeFichaTecnica();
        filmeFav.avalia(8);
        filmeFav.avalia(9);
        filmeFav.avalia(7);
        filmeFav.avalia(10);
        System.out.println("Total de Avaliações: " + filmeFav.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +filmeFav.mediaAvaliacoes());
        System.out.println("======================================");

        System.out.println("\n======================================");
        serieFav.exibeFichaTecnica();
        serieFav.avalia(8);
        serieFav.avalia(9);
        serieFav.avalia(7);
        serieFav.avalia(10);
        System.out.println("Total de Avaliações: " + serieFav.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +serieFav.mediaAvaliacoes());
        System.out.println("Tempo para maratonar " + serieFav.getNome() + ": " + serieFav.getDuracaoMinutos());
        System.out.println("======================================");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeFav);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serieFav);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeFav);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieFav);
        episodio.setTotalVizualizacoes(300);

    }
}