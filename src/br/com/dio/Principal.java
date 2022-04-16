package br.com.dio;

import br.com.dio.model.Gato;

public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato("Mel","branca", 1);
        System.out.println(gato.toString());
    }
}
