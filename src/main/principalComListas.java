package main;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme Avatar = new Filme("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);
        Serie tlou = new Serie("The last of us", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(lost);
        lista.add(tlou);
        lista.add(meuFilme);
        lista.add(Avatar);
        for (Titulo item: lista){
            System.out.println(item.toString());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Pedro pascal");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("The Rock");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("//////////////////");
        Collections.sort(lista);

        System.out.println(lista);


    }
}
