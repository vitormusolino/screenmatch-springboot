package br.com.modelo.screenmatch.principal;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private final String ENDERECO = "https://www.omdbapi.com/?t";
    private final String API_KEY = "&apikey=fc318e3b";

    public void exibeMenu(){
        System.out.println("Digite o nome da série: ");
        var nomeSerie = leitura.nextLine();

    }
}
