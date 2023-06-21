package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeFav = new Filme("The Matrix", 1999);
        filmeFav.avalia(9);
        Filme outroFilme = new Filme("GodFather", 1972);
        outroFilme.avalia(10);
        Filme filmeDoPaulo  = new Filme("Avatar", 2023);
        filmeDoPaulo.avalia(6);
        Serie serieFav = new Serie("Lost", 2004);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(filmeFav);
        lista.add(outroFilme);
        lista.add(serieFav);
        for (Titulo item: lista) {
                System.out.println("\n" + item);
                if(item instanceof Filme filme && filme.getClassificacao() > 2)  {
                System.out.println("Classificação:" + filme.getClassificacao());
            }
        }
        LinkedList<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jason Momoa");
        buscaPorArtista.add("Leonardo DiCaprio");
        buscaPorArtista.add("Jhonny Depp");
        System.out.println("\n Lista de Artistas");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("\nDepois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("\nLista de Títulos Ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nOrdenando por ano:");
        System.out.println(lista);
    }
}
